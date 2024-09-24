package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OidcUser oidcUser) {
        return "Welcome, " + oidcUser.getFullName();
    }
}
