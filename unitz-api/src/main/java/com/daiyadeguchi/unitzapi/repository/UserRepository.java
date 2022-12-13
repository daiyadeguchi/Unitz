package com.daiyadeguchi.unitzapi.repository;

import com.daiyadeguchi.unitzapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
