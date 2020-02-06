package prefixCalculator;

public class Calculator implements iCalculator{

	@Override
	public int suma(int a, int b) {
		
		return a+b;
	}

	@Override
	public int resta(int a, int b) {
		
		return a-b;
	}

	@Override
	public int multiplicacion(int a, int b) {
		
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		
		return a/b;
	}

}
