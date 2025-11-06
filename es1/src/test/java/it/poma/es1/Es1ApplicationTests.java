package it.poma.es1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class Es1ApplicationTests {

	@Test
	void contextLoads() {
		assertThat(1).isEqualTo(1);
	}

	@Test
	void verificaSomma() {
		double risultato = MainController.operazione("somma", 1, 2);
		assertThat(risultato).isEqualTo(3);
	}

	@Test
	void verificaMoltiplicazione() {
		double risultato = MainController.operazione("moltiplicazione", 1, 2);
		assertThat(risultato).isEqualTo(2);
	}

	@Test
	void verificaDivisione() {
		double risultato = MainController.operazione("divisione", 1, 2);
		assertThat(risultato).isEqualTo(0.5);
	}

	@Test
	void verificaSottrazione() {
		double risultato = MainController.operazione("sottrazione", 1, 2);
		assertThat(risultato).isEqualTo(-1);
	}

}
