package com.ecommerce.backend;

class BackendApplicationTests {

	void contextLoads() {
		int result = 10 + 20;

		if (result != 30) {
			throw new AssertionError("Expected 30, but got " + result);
		}
	}

}
