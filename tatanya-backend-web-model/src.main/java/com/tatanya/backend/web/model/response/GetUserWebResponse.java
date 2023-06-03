package com.tatanya.backend.web.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserWebResponse {
  private String id;
  private String firstName;
  private String lastName;
  private String fullName;
  private String picture;
  private String email;
  private String locale;
}
