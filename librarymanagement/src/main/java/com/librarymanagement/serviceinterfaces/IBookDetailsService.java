package com.librarymanagement.serviceinterfaces;

import com.librarymanagement.entity.BookDetails;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface IBookDetailsService {

    public String addBookDetailsService(BookDetails bookDetails);
    public ResponseEntity<Object> updateBookDetailsService(BookDetails bookDetails, long bookId);
    public ArrayList<BookDetails> getAllBookDetailsService();
    public Optional<BookDetails> getBookDetailsByBookIdService(long bookId);
    public String getBookDetailsByIsbnNoService(String isbnNo);
    public String deleteBookDetailsByBookIdService(long bookId);


}
