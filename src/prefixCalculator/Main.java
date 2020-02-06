
package prefixCalculator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class Main {
	public static String[] lectorDeTexto() throws Exception{
		String barra = File.separator;
		String dir = System.getProperty("user.dir");
		File archivo = new File (dir + barra + "prefixCalculator"+barra +"datos.txt");
		FileReader fr;
		String linea = "";
		fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String[] listaLinea = null;
		
		while((linea = br.readLine()) != null){
		listaLinea = linea.split("");
		}
		return listaLinea;
			
	}
	public static void main(String[] args) {
		System.out.println("ejecutando");
		try {
			String[] lista = lectorDeTexto();
			iCalculator calculadora = new Calculator();
			iStack<Integer> stack = new Stack<Integer>();
			int a =0,b= 0;
			for (String c : lista) {
				if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")) {
					if(c.equals("+")) {
						a = stack.pop();
						b = stack.pop();
						stack.push(calculadora.suma(a, b));
					}

					if(c.equals("-")) {
						a = stack.pop();
						b = stack.pop();
						stack.push(calculadora.resta(a, b));
					}
					

					if(c.equals("*")) {
						a = stack.pop();
						b = stack.pop();
						stack.push(calculadora.multiplicacion(a, b));
					}

					if(c.equals("/")) {
						a = stack.pop();
						b = stack.pop();
						stack.push(calculadora.division(a, b));
					}
					
					
					
				}
				else {
					stack.push(Integer.parseInt(c));
				}
				
			}
			System.out.println("EL RESULTADO POSTFIX ES: "+stack.peek());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
