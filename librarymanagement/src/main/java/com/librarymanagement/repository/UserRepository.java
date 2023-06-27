package com.librarymanagement.repository;

import com.librarymanagement.entity.BookDetails;
import com.librarymanagement.entity.Login;
import com.librarymanagement.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableAutoConfiguration
public interface UserRepository<value> extends JpaRepository<User, Long> {

    // findByuserId
    @Query(value = "select u.* from user u order by u.UserId desc limit 1", nativeQuery = true)
    User getLastUserId();






}
