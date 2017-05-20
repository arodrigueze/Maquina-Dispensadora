package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdministradorEspiral {
	
	private List<Espiral> espirales;
	private ESArchivoEspirales ioEspirales;
	
	public AdministradorEspiral() throws IOException{
		espirales = new ArrayList<Espiral>();
		ioEspirales = new ESArchivoEspirales();
		espirales = ioEspirales.cargarEspirales();
		ioEspirales.guardarEspirales(espirales);		
	}
	
	public boolean agregarEspiral(Espiral espiral) throws IOException{
		espirales.add(espiral);
		ioEspirales.cargarEspirales();
		ioEspirales.guardarEspirales(espirales);
		return true;
	}
	
	
}
