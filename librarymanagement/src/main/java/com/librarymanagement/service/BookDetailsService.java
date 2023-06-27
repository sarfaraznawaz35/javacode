package com.librarymanagement.service;

import com.librarymanagement.entity.BookDetails;
import com.librarymanagement.repository.BookDetailsRepository;
import com.librarymanagement.serviceinterfaces.IBookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class BookDetailsService implements IBookDetailsService {

    @Autowired
    BookDetailsRepository bookDetailsRepository;


    public String addBookDetailsService(BookDetails bookDetails) {
        java.util.Date utilDate = new Date();
        var date = new Timestamp(utilDate.getTime());
        bookDetails.setCreatedOn(date);
        var result = this.bookDetailsRepository.save(bookDetails);
        return "New BookDetails has been added";
    }

    public ResponseEntity<Object> updateBookDetailsService(BookDetails bookDetails, long bookId) {
        java.util.Date utilDate = new Date();
        var date = new Timestamp(utilDate.getTime());
        Optional<BookDetails> result = this.bookDetailsRepository.findById(bookId);
        if (result.isEmpty())
            return ResponseEntity.notFound().build();

        var existingBookDetail = result.get();
        existingBookDetail.setIsbnNo(bookDetails.getIsbnNo());
        existingBookDetail.setBookName(bookDetails.getBookName());
        existingBookDetail.setAuthorName(bookDetails.getAuthorName());
        existingBookDetail.setQuantity(bookDetails.getQuantity());

        existingBookDetail.setUpdatedBy(bookId);
        existingBookDetail.setUpdatedOn(date);

        bookDetailsRepository.save(existingBookDetail);
        return ResponseEntity.noContent().build();
    }

    public ArrayList<BookDetails> getAllBookDetailsService() {
        var result = this.bookDetailsRepository.findAll();
        return (ArrayList<BookDetails>) result;
    }

    public Optional<BookDetails> getBookDetailsByBookIdService(long bookId) {
        var result = this.bookDetailsRepository.findById(bookId);
        return result;
    }

    public String getBookDetailsByIsbnNoService(String isbnNo) {
        this.bookDetailsRepository.getBookDetailsByIsbnNoRepository(isbnNo);
        return null;
    }

    public String deleteBookDetailsByBookIdService(long bookId) {
         this.bookDetailsRepository.deleteById(bookId);
        return "data of BookDetails has been deleted";
    }

}
