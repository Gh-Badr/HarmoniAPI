package com.ensias.harmoniAPI.controller;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensias.harmoniAPI.model.User;
import com.ensias.harmoniAPI.service.TokenService;

@RestController
public class AuthenticationController {
	
	private final TokenService tokenService;
    private final AuthenticationManager authManager;
    

    public AuthenticationController(TokenService tokenService,AuthenticationManager authManager) {
        this.tokenService = tokenService;
        this.authManager=authManager;
    }

    @PostMapping("/authenticate")
    public String token(@RequestBody User user) {
    	Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        return tokenService.generateToken(authentication);
    }

}