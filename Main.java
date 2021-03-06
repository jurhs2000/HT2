
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Jose Hurtarte
//Julio Herrera
public class Main {
	public static String[] lectorDeTexto() throws Exception{
		final String barra = File.separator;
		final String dir = System.getProperty("user.dir");
		// AQUI SE LEE EL ARCHIVO TXT
		// si no corre se debe de reemplazar en el parentesis (dir + barra +"NOMBRE DEL
		// FOLDER EN DONDE ESTA EL PROYECTO"+barra+ "datos.txt")
		// El error del archivo de texto puede pasar si se corre el programa en eclipse
		// y no en consola
		// o tambien sucede al trabajar con paquetes
		final File archivo = new File(dir + barra + "datos.txt");
		FileReader fr;
		String linea = "";
		fr = new FileReader(archivo);
		final BufferedReader br = new BufferedReader(fr);
		String[] listaLinea = null;

		while ((linea = br.readLine()) != null) {
			listaLinea = linea.split("");
		}
		return listaLinea;

	}

	public static void main(final String[] args) {
		System.out.println("CALCULADORA POSTFIX\n");
		try {
			final String[] lista = lectorDeTexto();
			final iCalculadora calculadora = new Calculadora(); // ESTA ES LA LINEA DONDE SE DECLARA NUESTRA CLASE CALCULADORA
			final iStack<Integer> stack = new Stack<Integer>(); // ESTA ES LA LINEA DONDE SE DECLARA NUESTRA CLASE STACK
			int a = 0, b = 0;

			boolean verificador1 = false;
			// Verificacion si hay suficientes operadores para los numeros escritos O
			// VISCEVERSA

			int contadorOperador = 0;
			int contadorNumero = 0;
			for (final String c : lista) {
				if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
					contadorOperador++;
				} else {
					contadorNumero++;
				}
			}
			if (contadorOperador + 1 != contadorNumero) {
				verificador1 = true;
				System.out.println("NO HAY SUFICIENTES OPERADORES O NUMEROS PARA REALIZAR LA OPERACION");
			}

			if (!verificador1) {
				for (final String c : lista) {
					if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
						if (c.equals("+")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculadora.suma(a, b));
						}

						if (c.equals("-")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculadora.resta(a, b));
						}

						if (c.equals("*")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculadora.multiplicacion(a, b));
						}

						if (c.equals("/")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculadora.division(a, b));
						}
					} else {
						stack.push(Integer.parseInt(c));
					}
				}
				System.out.println("EL RESULTADO POSTFIX ES: " + stack.peek());
			}
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error de archivo, ver instrucciones en lineas comentadas");
		}
	}
}
