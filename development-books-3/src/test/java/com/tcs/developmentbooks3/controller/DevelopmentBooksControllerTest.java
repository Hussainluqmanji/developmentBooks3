package com.tcs.developmentbooks3.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class DevelopmentBooksControllerTest {

	@Test
	void getBookNameShouldReturnNameOfTheBook() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		List<String> result = controller.getAllBooks();
		assertEquals("Clean Code", result.get(0));
	}

	@Test
	public void getAllBooksShouldReturnFiveBookNames() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		List<String> books = controller.getAllBooks();
		assertEquals(5, books.size());
		assertTrue(books.containsAll(getAllBooks()));
	}

	private List<String> getAllBooks() {
		return Arrays.asList("Clean Code", "The Clean Coder", "Clean Architecture",
				"Test Driven Development by Example", "Working Effectively With Legacy Code");
	}
}
