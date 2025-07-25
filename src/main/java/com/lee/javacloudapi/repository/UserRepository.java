package com.lee.javacloudapi.repository;

import com.lee.javacloudapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
