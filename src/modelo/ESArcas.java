package modelo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ESArcas {

	List<Arca> arcas;
	private BufferedReader entrada;
	
	public List<Arca> cargarArcas() throws IOException{
		
		FileReader archivo = new FileReader("arcas.txt");
        entrada = new BufferedReader(archivo);
        arcas = new ArrayList<>();
        String linea = "";
        String separador = ",";
        
        while(linea!=null){
            linea = entrada.readLine();
            if(linea!=null){
                String[] listaPalabras = linea.split(separador);
                arcas.add(new Arca(Integer.parseInt(listaPalabras[0]), Integer.parseInt(listaPalabras[1]),Integer.parseInt(listaPalabras[2]),Boolean.parseBoolean(listaPalabras[3])));
            }
        }
        return arcas;
	}
	
	public boolean guardarArcas(List<Arca> arcas){
        Iterator<Arca> itList = arcas.iterator();        
        try {
            PrintStream salida_a_archivo = new PrintStream("arcas.txt");           
            while(itList.hasNext()){
                Arca c=itList.next();
                salida_a_archivo.println(c.getId()+","+c.getDenominacion()+","+c.getCantidad()+","+c.isVacia());
            }
            salida_a_archivo.close();
        } catch (Exception e) {
            System.out.println("Error "+e );
        }
        
        return true;
    }
	
}
