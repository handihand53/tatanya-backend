package com.tatanya.backend.command.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.oauth2.core.user.OAuth2User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserCommandRequest {
  private OAuth2User oAuth2User;
}
