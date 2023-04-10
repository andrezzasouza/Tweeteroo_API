package com.tweeteroo.api.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TweetDTO(
  @NotBlank @Size(min = 5, max = 30) String username,
  @NotBlank @Size(min = 1, max = 280) String tweet
) {
}
