package com.tcs.developmentbooks3.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BookServiceTest {

	@Test
	public void getAllBooksShouldReturnFiveBookNames() {
		BookService service = new BookService();
		List<String> books = service.getAllBooks();
		assertEquals(5, books.size());
		assertTrue(books.containsAll(getAllBooks()));
	}

	private List<String> getAllBooks() {
		return Arrays.asList("Clean Code", "The Clean Coder", "Clean Architecture",
				"Test Driven Development by Example", "Working Effectively With Legacy Code");
	}

}
