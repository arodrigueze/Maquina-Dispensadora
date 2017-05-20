package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ESArchivoPosicionEspiral {

	List<PosicionEspiral> productos;
	private BufferedReader entrada;
	
	public List<PosicionEspiral> cargarPosicionEspirales() throws IOException{
		
		FileReader archivo = new FileReader("PosicionEspirales.txt");
        entrada = new BufferedReader(archivo);
        productos = new ArrayList<>();
        String linea = "";
        String separador = ",";
        
        while(linea!=null){
            linea = entrada.readLine();
            if(linea!=null){
                String[] listaPalabras = linea.split(separador);
                productos.add(new PosicionEspiral(listaPalabras[0].charAt(0), Integer.parseInt(listaPalabras[1]),Boolean.parseBoolean(listaPalabras[2])));
            }
        }
        return productos;
	}
	
	public boolean guardarPosicionEspirales(List<PosicionEspiral> espirales){
        Iterator<PosicionEspiral> itList = espirales.iterator();        
        try {
            PrintStream salida_a_archivo = new PrintStream("PosicionEspirales.txt");           
            while(itList.hasNext()){
                PosicionEspiral c=itList.next();
                salida_a_archivo.println(c.getFila()+","+c.getColumna()+","+c.isOcupado());
            }
            salida_a_archivo.close();
        } catch (Exception e) {
            System.out.println("Error "+e );
        }
        
        return true;
    }
	
}
