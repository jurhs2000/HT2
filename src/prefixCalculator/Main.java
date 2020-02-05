
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
	public String[] lectorDeTexto() throws Exception{
		
		String dir = System.getProperty("user.dir");
		File archivo = new File (dir + "datos.txt");
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
	}
}
