package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class ESEnServicio {
	
private BufferedReader entrada;
	
public String cargarEnServicio() throws IOException{
		FileReader archivo = new FileReader("enServicio.txt");
        entrada = new BufferedReader(archivo);
        String linea = "";
        linea = entrada.readLine();
        return linea;
	}

public boolean guardarEnServicio(Boolean enServicio){        
    try {
        PrintStream salida_a_archivo = new PrintStream("enServicio.txt");           
        salida_a_archivo.println(enServicio);
        salida_a_archivo.close();
    } catch (Exception e) {
        System.out.println("Error "+e );
    }
    return true;
}
}
