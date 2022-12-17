package com.tcs.developmentbooks3.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	public List<String> getAllBooks() {
        return Arrays.asList("Clean Code", "The Clean Coder", "Clean Architecture",
                "Test Driven Development by Example", "Working Effectively With Legacy Code");
    }
}
