package com.tatanya.backend.web;

import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/backend/api/dashboard")
public class PollingController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<String> getDashboard() {
    return Mono.just("dashboard");
  }

}
