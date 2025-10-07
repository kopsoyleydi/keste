package com.keste.auth.controller;

import com.keste.auth.data.UserDto;
import com.keste.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

  private final UserService userService;

  @GetMapping("/me")
  public UserDto getCurrentUser(@AuthenticationPrincipal OAuth2User principal) {
    if (principal == null) {
      return new UserDto();
    }
    return userService.processOAuthPostLogin(principal);
  }

  @GetMapping("/ping")
  public String ping() {
    return "Auth service is working!";
  }
}
