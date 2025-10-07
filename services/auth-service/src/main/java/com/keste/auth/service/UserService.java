package com.keste.auth.service;

import com.keste.auth.data.AuthProvider;
import com.keste.auth.data.UserDto;
import com.keste.auth.model.User;
import com.keste.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public UserDto processOAuthPostLogin(OAuth2User oAuth2User) {
    String email = oAuth2User.getAttribute("email");
    String name = oAuth2User.getAttribute("name");

    return userRepository.findByEmail(email)
        .map(existingUser -> {
          existingUser.setEmail(name);
          return userRepository.save(existingUser);
        })
        .map(this::toDto)
        .orElseGet(() -> {
          User newUser = User.builder()
              .email(email)
              .provider(AuthProvider.GOOGLE)
              .build();
          return toDto(userRepository.save(newUser));
        });
  }

  public UserDto toDto(User user) {
    return new UserDto(user.getEmail(), user.getProvider());
  }
}
