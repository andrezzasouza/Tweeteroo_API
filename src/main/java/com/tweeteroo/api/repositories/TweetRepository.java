package com.tweeteroo.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweeteroo.api.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
  List<Tweet> findByUsername(String username);
}
