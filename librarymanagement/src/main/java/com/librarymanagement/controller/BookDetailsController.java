package com.librarymanagement.controller;

import com.librarymanagement.entity.BookDetails;
import com.librarymanagement.model.ApiResponse;
import com.librarymanagement.service.BookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookdetails")
public class BookDetailsController {

    @Autowired
    BookDetailsService bookDetailsService;

    @PostMapping("/addBookDetails")
    public ResponseEntity<ApiResponse> addBookDetails(@RequestBody BookDetails bookDetails){
    var result = this.bookDetailsService.addBookDetailsService(bookDetails);
    return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @PutMapping("/updateBookDetails/{bookId}")
    public ResponseEntity<ApiResponse> updateBookDetails(@RequestBody BookDetails bookDetails, @PathVariable("bookId") long bookId){
        var result = this.bookDetailsService.updateBookDetailsService(bookDetails, bookId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @GetMapping("/getAllBookDetails")
    public ResponseEntity<ApiResponse> getAllBookDetails(){
        var result = this.bookDetailsService.getAllBookDetailsService();
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @GetMapping("/getBookDetailsByBookId/{bookId}")
    public ResponseEntity<ApiResponse> getBookDetailsByBookId( @PathVariable("bookId") long bookId){
        var result = this.bookDetailsService.getBookDetailsByBookIdService(bookId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @GetMapping("/getBookDetailsByIsbnNo/{isbnNo}")
    public ResponseEntity<ApiResponse> getBookDetailsByIsbnNo( @PathVariable("isbnNo") String isbnNo){
        var result = this.bookDetailsService.getBookDetailsByIsbnNoService(isbnNo);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @DeleteMapping("/deleteBookDetailsByBookId/{bookId}")
    public ResponseEntity<ApiResponse> deleteBookDetailsByBookId(@PathVariable("bookId") long bookId){
        var result = this.bookDetailsService.deleteBookDetailsByBookIdService(bookId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

}
