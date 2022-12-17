package com.tcs.developmentbooks3.controller;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class DevelopmentBooksControllerTest {

	@Test
	void getBookNameShouldReturnNameOfTheBook() {
		DevelopmentBooksController controller = new DevelopmentBooksController();
		String result = controller.getBookName();
		assertEquals("Clean Code", result);
	}

}
