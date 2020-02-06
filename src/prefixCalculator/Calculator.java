package prefixCalculator;


public class Calculator implements iCalculator{

	/**
	 * suma los parametros y los devuelve
	 */
	@Override
	public int suma(int a, int b) {
		
		return a+b;
	}

	/**
	 * resta los parametros y los devuelve
	 */
	@Override
	public int resta(int a, int b) {
		
		return a-b;
	}

	/**
	 * multiplica los parametros y los devuelve
	 */
	@Override
	public int multiplicacion(int a, int b) {
		
		return a*b;
	}

	/**
	 *divide los parametros y da el entero mas cercano si es decimal
	 */
	@Override
	public int division(int a, int b) {
		
		return a/b;
	}


}
