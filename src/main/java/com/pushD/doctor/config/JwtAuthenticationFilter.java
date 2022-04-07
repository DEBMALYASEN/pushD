package com.pushD.doctor.config;

import com.pushD.doctor.entity.Doctor;
import com.pushD.doctor.exceptionhelper.doctornotFoundException;
import com.pushD.doctor.service.impl.doctordetailsimpl;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter

{
    @Autowired
    private doctordetailsimpl doctorDetailsService;

    @Autowired
    private JwtUtils jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
    {

        final String requestTokenHeader = request.getHeader("Authorization");
        System.out.println(requestTokenHeader);
        String email = null;
        String jwtToken = null;

        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer "))
        {
            //yes

            jwtToken = requestTokenHeader.substring(7);

            try
            {
                email= this.jwtUtil.extractemail(jwtToken);
            }
            catch (ExpiredJwtException e)
            {
                e.printStackTrace();
                System.out.println("jwt token has expired");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("error");
            }

        }
        else
        {
            System.out.println("Invalid token , not start with bearer string");
        }

        //validated
        if (email!= null && SecurityContextHolder.getContext().getAuthentication() == null) {
            Doctor Doctor=null;
            try
            {
                Doctor = this.doctorDetailsService.loadDoctorByEmail(email);
            }
            catch (doctornotFoundException e)
            {
                e.printStackTrace();
            }
            if (this.jwtUtil.validateToken(jwtToken,Doctor))
            {
                UsernamePasswordAuthenticationToken emailPasswordAuthentication = new UsernamePasswordAuthenticationToken(Doctor, null);
                emailPasswordAuthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(emailPasswordAuthentication);
            }
        }
        else
        {
            System.out.println("Token is not valid");
        }



        filterChain.doFilter(request, response);

    }


}
