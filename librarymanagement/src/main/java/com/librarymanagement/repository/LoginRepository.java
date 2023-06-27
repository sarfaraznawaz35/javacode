package com.librarymanagement.repository;

import com.librarymanagement.entity.Login;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface LoginRepository extends JpaRepository<Login, Long> {

    @Query(value = "select l.* from login l order by l.UserId desc limit 1", nativeQuery = true)
    Login getLastLoginRecord();

    @Query(value = "select l from Login l where l.userId = :userId")
    Login getLoginByUserId(@Param("userId") Long userId);


}
