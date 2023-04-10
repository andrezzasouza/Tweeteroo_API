package com.tweeteroo.api.models;

import com.tweeteroo.api.DTO.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class NewUser {
  public NewUser(UserDTO req) {
    this.username = req.username();
    this.avatar = req.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column (length = 30, nullable = false, unique = true)
  private String username;

  @Column (length = 1000, nullable = false)
  private String avatar;
  // TODO Validate URL and img format
}
