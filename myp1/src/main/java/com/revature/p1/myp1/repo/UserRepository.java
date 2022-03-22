package com.revature.p1.myp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p1.myp1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
