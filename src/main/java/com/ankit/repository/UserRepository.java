package com.ankit.repository;

import com.ankit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
