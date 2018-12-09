package com.eci.cosw.springbootsecureapi.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JwtFilter
    extends GenericFilterBean
{

    public void doFilter( final ServletRequest servletRequest, final ServletResponse servletResponse,
                          final FilterChain filterChain )
        throws IOException, ServletException
    {

        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final String authHeader = request.getHeader( "authorization" );

        if ( "OPTIONS".equals( request.getMethod() ) )
        {
            response.setStatus( HttpServletResponse.SC_OK );

            filterChain.doFilter( servletRequest, response );
        }
        else
        {


            filterChain.doFilter( servletRequest, response );
        }
    }
}
