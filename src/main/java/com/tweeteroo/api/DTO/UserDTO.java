package com.tweeteroo.api.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(
  @NotBlank @Size(min = 5, max = 30) String username,
  @NotBlank @Size(min = 18, max = 1000) String avatar
) {
}
