
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
			for (String string : lista) {
				System.out.println(string);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
