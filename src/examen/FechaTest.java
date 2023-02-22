package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void CP1() {
		assertFalse(Fecha.validarFecha(0, 0, -5));
	}
	
	@Test
	void CP2() {
		assertFalse(Fecha.validarFecha(10, 33, 33));
	}
	
	@Test
	void CP3() {
		assertTrue(Fecha.validarFecha(10, 2, 10));
	}
	
	@Test
	void CP4() {
		assertTrue(Fecha.validarFecha(10, 4, 10));
	}


}
