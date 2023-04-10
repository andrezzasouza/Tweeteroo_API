package com.tweeteroo.api.models;

import com.tweeteroo.api.DTO.TweetDTO;

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
public class Tweet {
  
  public Tweet(TweetDTO req) {
    this.username = req.username();
    this.tweet = req.tweet();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column (length = 30, nullable = false)
  private String username;
  // TODO Make sure user already exists

  @Column (length = 280, nullable = false)
  private String tweet;

  // TODO add image to tweet data
}
