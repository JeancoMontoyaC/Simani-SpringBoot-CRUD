package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("SELECT new map(u.country as name, COUNT(u) as value) FROM Users u GROUP BY u.country HAVING COUNT(u) > 0")
    List<Object> countUsersByCountry();

}
