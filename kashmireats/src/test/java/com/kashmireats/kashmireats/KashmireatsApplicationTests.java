package com.kashmireats.kashmireats;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class KashmireatsApplicationTests {
private  Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
	int z =	c.doSum(1,2,3);
	System.out.print(z);
	int expectedResult = 6;
	assertThat(z).isEqualTo(expectedResult);

	}
	@Test
	@Disabled
	void testProduct(){
		int actual = c.doMul(2,3);
		int expected = 6;
		assertThat(actual).isEqualTo(expected);

	}

	@Test
	void checkBool(){
		assertThat(true).isTrue();
	}

}
