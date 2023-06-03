package com.tatanya.backend.web;

import com.tatanya.backend.command.GetUserCommand;
import com.tatanya.backend.command.model.GetUserCommandRequest;
import com.tatanya.backend.command.model.Response;
import com.tatanya.backend.helper.ResponseHelper;
import com.tatanya.backend.web.base.BaseController;
import com.tatanya.backend.web.model.response.GetUserWebResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/backend/api/user")
public class UserController extends BaseController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Response<GetUserWebResponse>> getUser(@AuthenticationPrincipal OAuth2User oauth2User) {
    GetUserCommandRequest request = GetUserCommandRequest.builder()
      .oAuth2User(oauth2User)
      .build();

    return getContext(GetUserCommand.class)
      .execute(request)
      .map(ResponseHelper::ok)
      .doOnSuccess(result -> log.info("#getUser success with result: {}", result));
  }
}
