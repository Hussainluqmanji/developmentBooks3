package com.tcs.developmentbooks3.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tcs.developmentbooks3.model.Books;

class DevelopmentBooksControllerTest {

	DevelopmentBooksController controller;

	@BeforeEach
	public void setUp() {
		controller = new DevelopmentBooksController();
	}

	@Test
	void getBookNameShouldReturnNameOfTheBook() {
		List<Books> result = controller.getAllBooks();
		assertEquals("Clean Code", result.get(0));
	}

	@Test
	public void getAllBooksShouldReturnFiveBookNames() {
		List<Books> books = controller.getAllBooks();
		assertEquals(5, books.size());
	}

}
