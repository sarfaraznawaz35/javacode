package com.librarymanagement.repository;

import com.librarymanagement.entity.BookDetails;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface BookDetailsRepository extends JpaRepository<BookDetails, Long> {

    @Query(value = " select bd from BookDetails bd where bd.isbnNo = :isbnNo")
    BookDetails getBookDetailsByIsbnNoRepository(@Param("isbnNo") String isbnNo);




}
