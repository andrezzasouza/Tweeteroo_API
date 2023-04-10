package com.tweeteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.DTO.TweetDTO;
import com.tweeteroo.api.models.Tweet;
import com.tweeteroo.api.repositories.TweetRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
  
  @Autowired TweetRepository repository;

  @PostMapping
  public String createTweet(@RequestBody @Valid TweetDTO req) {
    repository.save(new Tweet(req));
    return "OK";
  }
}
