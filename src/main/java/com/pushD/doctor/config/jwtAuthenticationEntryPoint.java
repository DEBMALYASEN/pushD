package com.pushD.doctor.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@Component
public class jwtAuthenticationEntryPoint  implements AuthenticationEntryPoint
{

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException
    {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized : Server");
    }
}
/*
Create the JWT class which contains methods like generate, create and validate the token.
Now username and password I have hardcoded, but in the real application, you have to get it from the database.
Now we have to create the Authentication request for checking the input coming from the “auth/authentication” API.
If the requested user name and password is correct then we have to send JWT as a response. For that, we have to create an authentication response class.
Now, We have to create the POST API “/auth/authenticate” and first we have to hit this API. which takes the username and password as an AuthenticationRequest and give JWT as an AuthenticationResponse.
 */