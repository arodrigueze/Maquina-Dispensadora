package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
		if(espiral.getPrecioProducto()%50!=0)
			return false;
		espirales.add(espiral);
		ioEspirales.cargarEspirales();
		ioEspirales.guardarEspirales(espirales);
		return true;
	}
	
	public boolean eliminarEspiral(char fila, int columna) throws IOException{
		for (Iterator iterator = espirales.iterator(); iterator.hasNext();) {
			Espiral espiral = (Espiral) iterator.next();
			if(espiral.getFila()==fila&&espiral.getColumna()==columna){
				espirales.remove(espiral);
				ioEspirales.cargarEspirales();
				ioEspirales.guardarEspirales(espirales);
				return true;
			}
		}
		return false;
	}

	public boolean editarEspiral(Espiral espiralChange) throws IOException {
		if(espiralChange.getPrecioProducto()%50!=0)
			return false;
		if(espiralChange.getCantidadProducto()<=0&&espiralChange.getCantidadProducto()>50)
			return false;
		for (Iterator iterator = espirales.iterator(); iterator.hasNext();) {
			Espiral espiral = (Espiral) iterator.next();
			if(espiral.getFila()==espiralChange.getFila()&&espiral.getColumna()==espiralChange.getColumna()){
				espirales.remove(espiral);
				espirales.add(espiralChange);
				ioEspirales.cargarEspirales();
				ioEspirales.guardarEspirales(espirales);
				return true;
			}
		}
		return false;
	}

	public List<Espiral> obtenerEspirales() {
		return espirales;
	}

	public void editarCantidad(char fila, int columna, int cantidad) throws IOException {
		for (Iterator iterator = espirales.iterator(); iterator.hasNext();) {
			Espiral espiral = (Espiral) iterator.next();
			if(espiral.getFila()==fila&&espiral.getColumna()==columna){
				espirales.remove(espiral);
				espiral.setCantidadProducto(cantidad);
				espirales.add(espiral);
				ioEspirales.cargarEspirales();
				ioEspirales.guardarEspirales(espirales);
				break;
			}
		}
	}

	public void guardarEspirales(List<Espiral> listaEspirales) throws IOException {
		ioEspirales.cargarEspirales();
		ioEspirales.guardarEspirales(listaEspirales);
	}
	
	
}
