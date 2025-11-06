package it.poma.es1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class Es1ApplicationTests {

	@Autowired
	private MainController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	void test_sommaWorks() {
		assertThat(MainController.aritmetica("somma", 1, 2)).isEqualTo(3);
	}

}
