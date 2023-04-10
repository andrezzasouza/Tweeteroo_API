package com.tweeteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/{username}")
  public List<Tweet> getTweetsByUser(@PathVariable String username) {
    return repository.findByUsername(username);
  }

  @PostMapping
  public String createTweet(@RequestBody @Valid TweetDTO req) {
    repository.save(new Tweet(req));
    return "OK";
  }
}
