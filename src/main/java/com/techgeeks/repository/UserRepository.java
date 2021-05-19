package com.techgeeks.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgeeks.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> FindByUserName(String userName);
}
