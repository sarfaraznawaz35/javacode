package com.jwt.config;

import com.jwt.helper.JwtUtil;
import com.jwt.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //get Jwt (header)
        //will see starting from Bearer or not
        //If starting from Bearer then will validate and then will do the rest things
        String requestTokenHeader = request.getHeader("Authorization");
        String username = null;
        String jwtToken = null;
        //checking requestTokenHeader is null or not and format
        if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer "))
        {
            jwtToken = requestTokenHeader.substring(7);

            try {
                username = this.jwtUtil.extractUsername(jwtToken);
            }catch (Exception e)
            {
                e.printStackTrace();
            }

            UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(username);

            //security validation
            if(username != null && SecurityContextHolder.getContext().getAuthentication()==null)
            {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

            }else
            {
                System.out.println("Token is not validated");
            }
        }
        filterChain.doFilter(request, response);
    }
}
