package com.demo.springSecurity;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import io.micrometer.common.lang.NonNull;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Service
public class jwtAuthenticaticationFilter extends OncePerRequestFilter {////single execution per requestdispatch, on any servlet container
@Autowired
private jwtService jwtService;
	@Override
	protected void doFilterInternal(
		@NonNull	HttpServletRequest request, 
		@NonNull	HttpServletResponse response, 
		@NonNull	FilterChain filterChain)throws ServletException, IOException 
	{
		final String authHeader=request.getHeader("Autherization");
		final String jwt;
		final String userEmail;
		if (authHeader==null||!authHeader.startsWith("Bearer")) {
			filterChain.doFilter(request, response);
			return;
		}
		jwt=authHeader.substring(6);
		userEmail=jwtService.extractusername(jwt);
		
	}
}
