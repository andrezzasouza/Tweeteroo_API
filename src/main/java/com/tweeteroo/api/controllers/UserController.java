package com.tweeteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.DTO.UserDTO;
import com.tweeteroo.api.models.NewUser;
import com.tweeteroo.api.repositories.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class UserController {

  @Autowired
  private UserRepository repository;

  @PostMapping
  public String createUser(@RequestBody @Valid UserDTO req) {
    repository.save(new NewUser(req));
    return "OK";
  }
}
