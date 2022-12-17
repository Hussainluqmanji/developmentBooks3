package com.tcs.developmentbooks3.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class BookServiceTest {

	@Test
	public void getAllBooksShouldReturnFiveBookNames() {
		BookService service = new BookService();
		List<String> books = service.getAllBooks();
		assertEquals(5, books.size());
	}

}
