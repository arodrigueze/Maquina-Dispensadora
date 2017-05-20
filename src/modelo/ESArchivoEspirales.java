package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ESArchivoEspirales {

	List<Espiral> espirales;
	private BufferedReader entrada;
	
	public List<Espiral> cargarEspirales() throws IOException{
		
		FileReader archivo = new FileReader("espirales.txt");
        entrada = new BufferedReader(archivo);
        espirales = new ArrayList<>();
        String linea = "";
        String separador = ",";
        
        while(linea!=null){
            linea = entrada.readLine();
            if(linea!=null){
                String[] listaPalabras = linea.split(separador);
                espirales.add(new Espiral(listaPalabras[0], Double.parseDouble(listaPalabras[1]),Integer.parseInt(listaPalabras[2]),listaPalabras[3].charAt(0),Integer.parseInt(listaPalabras[4])));
            }
        }
        return espirales;
	}
	
	public boolean guardarEspirales(List<Espiral> espirales){
        Iterator<Espiral> itList = espirales.iterator();        
        try {
            PrintStream salida_a_archivo = new PrintStream("espirales.txt");           
            while(itList.hasNext()){
                Espiral c=itList.next();
                salida_a_archivo.println(c.getNombreProducto()+","+c.getPrecioProducto()+","+c.getCantidadProducto()+","+c.getFila()+","+c.getColumna());
            }
            salida_a_archivo.close();
        } catch (Exception e) {
            System.out.println("Error "+e );
        }
        
        return true;
    }
	
}
