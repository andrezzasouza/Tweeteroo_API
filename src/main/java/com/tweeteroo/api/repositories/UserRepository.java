package com.tweeteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweeteroo.api.models.NewUser;

@Repository
public interface UserRepository extends JpaRepository<NewUser, Long> {
}
