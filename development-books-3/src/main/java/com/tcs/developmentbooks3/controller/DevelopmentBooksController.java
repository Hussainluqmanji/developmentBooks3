package com.tcs.developmentbooks3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.developmentbooks3.model.Books;
import com.tcs.developmentbooks3.service.BookService;

@RestController
public class DevelopmentBooksController {

	@Autowired
	BookService service;
	
    @GetMapping("/getAllBooks")
    public List<Books> getAllBooks() {
		return service.getAllBooks();
    }
}
