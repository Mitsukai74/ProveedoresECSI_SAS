package com.proveedores.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.proveedores.services.UserDetailsImplemen;

@Configuration
public class UserConfigurity {
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	UserDetailsService userDetailsService() {
	    return new UserDetailsImplemen();
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	    .authorizeHttpRequests((authorize) -> authorize	    		
	    		.requestMatchers("/login","*/*").permitAll()
	            .anyRequest().authenticated()
	        )
	    
		    .formLogin(formLogin -> formLogin		    		
		            .loginPage("/login")		            
		            .permitAll());
		    return http.build();
	}

}
