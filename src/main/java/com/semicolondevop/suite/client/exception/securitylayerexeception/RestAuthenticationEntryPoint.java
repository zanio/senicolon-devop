package com.semicolondevop.suite.client.exception.securitylayerexeception;

/* Aniefiok
 *created on 5/15/2020
 *inside the package */

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class RestAuthenticationEntryPoint extends CustomFilterResponse implements AuthenticationEntryPoint  {

     @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

             new CustomFilterResponse("Unauthorized",httpServletResponse);


    }



}
