import static org.junit.Assert.*; 

import org.junit.jupiter.api.Test;
//Jose Hurtarte
//Julio Herrera

class PruebasUnitarias {

	@Test
	public void restarTest() {
		iCalculadora test = new Calculadora();
		int a = 76;
		int b = 89;
		assertEquals(-13, test.resta(a, b));
	}
	@Test
	public void sumarTest() {
		iCalculadora test = new Calculadora();
		int a = 111;
		int b = 222;
		assertEquals(333, test.suma(a, b));
	}
	@Test
	public void multiplicarTest() {
		iCalculadora test = new Calculadora();
		int a = 123;
		int b = 13;
		assertEquals(1599, test.multiplicacion(a, b));
	}
	@Test
	public void dividirTest() {
		iCalculadora test = new Calculadora();
		int a = 1440;
		int b = 12;
		assertEquals(120, test.division(a, b));
	}

}
