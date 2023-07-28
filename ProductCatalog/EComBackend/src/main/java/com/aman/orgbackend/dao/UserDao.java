package com.aman.orgbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.orgbackend.models.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
