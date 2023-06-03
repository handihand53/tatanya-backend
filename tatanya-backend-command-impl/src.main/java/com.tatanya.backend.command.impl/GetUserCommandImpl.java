package com.tatanya.backend.command.impl;

import com.tatanya.backend.command.GetUserCommand;
import com.tatanya.backend.command.model.GetUserCommandRequest;
import com.tatanya.backend.web.model.response.GetUserWebResponse;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetUserCommandImpl implements GetUserCommand {
  @Override
  public Mono<GetUserWebResponse> execute(GetUserCommandRequest request) {
    return Mono.just(request.getOAuth2User())
      .map(this::toGetUserWebResponse);
  }

  private GetUserWebResponse toGetUserWebResponse(OAuth2User oAuth2User) {
    return GetUserWebResponse.builder()
      .id(oAuth2User.getAttribute("sub"))
      .firstName(oAuth2User.getAttribute("given_name"))
      .lastName(oAuth2User.getAttribute("family_name"))
      .fullName(oAuth2User.getAttribute("name"))
      .picture(oAuth2User.getAttribute("picture"))
      .email(oAuth2User.getAttribute("email"))
      .locale(oAuth2User.getAttribute("locale"))
      .build();
  }
}
