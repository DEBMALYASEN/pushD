package com.pushD.doctor.controller;
import com.pushD.doctor.config.JwtUtils;
import com.pushD.doctor.entity.Doctor;
import com.pushD.doctor.entity.JwtRequest;
import com.pushD.doctor.entity.JwtResponse;
import com.pushD.doctor.exceptionhelper.doctornotFoundException;
import com.pushD.doctor.service.impl.doctordetailsimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin("*")
class AuthenticateController
{


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private doctordetailsimpl doctordetailsimpl;

    @Autowired
    private JwtUtils jwtUtils;
    private com.pushD.doctor.service.doctordetailservice doctordetailservice;


    @PostMapping("/generate-token")//generate token
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception // output whole http response jet request from client side
    {
        try
           {
            authenticate(jwtRequest.getEmail(), jwtRequest.getPassword());//spring authenticate
            }
        catch (doctornotFoundException e)
           {
            e.printStackTrace();
            throw new Exception("Doctor not found ");
            }

        Doctor docDetails =doctordetailservice.loadDoctorByEmail(jwtRequest.getEmail());//to fetch info service ->repo->database
        String token = this.jwtUtils.generateToken(docDetails);
        return ResponseEntity.ok(new JwtResponse(token));


    }


    private void authenticate(String email, String password) throws Exception
    {

        try
        {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));

        } catch (DisabledException e) {
            throw new Exception("DOCTOR DISABLED " + e.getMessage());
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid Credentials " + e.getMessage());
        }
    }



    //return the details of current LOGGED IN doctor
    @GetMapping("/current-doctor")
    public Doctor getCurrentDoctor(Principal principal) throws doctornotFoundException
    {
        return ( this.doctordetailservice.loadDoctorByEmail(principal.getName()));

    }


}
