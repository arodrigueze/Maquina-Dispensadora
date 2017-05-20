package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdministradorPosicionEspiral {
	
	private List<PosicionEspiral> posicionEspirales;
	private ESArchivoPosicionEspiral ioPosicionEspirales;
	
	public AdministradorPosicionEspiral() throws IOException{
		posicionEspirales = new ArrayList<PosicionEspiral>();
		ioPosicionEspirales = new ESArchivoPosicionEspiral();
		posicionEspirales = ioPosicionEspirales.cargarPosicionEspirales();
		ioPosicionEspirales.guardarPosicionEspirales(posicionEspirales);		
	}
	
	public boolean modificarPosicionEspiralAOcupado(PosicionEspiral posicionEspiralData) throws IOException{
		for (Iterator<PosicionEspiral> iterator = posicionEspirales.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			if(posicionEspiral.getFila()==posicionEspiralData.getFila()&&posicionEspiral.getColumna()==posicionEspiralData.getColumna()){
				posicionEspiral.setOcupado(true);
				ioPosicionEspirales.cargarPosicionEspirales();
				ioPosicionEspirales.guardarPosicionEspirales(posicionEspirales);
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarPosicionEspiralADesocupado(PosicionEspiral posicionEspiralData) throws IOException{
		for (Iterator<PosicionEspiral> iterator = posicionEspirales.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			if(posicionEspiral.getFila()==posicionEspiralData.getFila()&&posicionEspiral.getColumna()==posicionEspiralData.getColumna()){
				posicionEspiral.setOcupado(false);
				ioPosicionEspirales.cargarPosicionEspirales();
				ioPosicionEspirales.guardarPosicionEspirales(posicionEspirales);
				return true;
			}
		}
		return false;
	}
	
	public List<PosicionEspiral> obtenerPosicionesDesocupadas() throws IOException{
		List<PosicionEspiral> posicionesDesocupadas = new ArrayList<>();
		for (Iterator<PosicionEspiral> iterator = posicionEspirales.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			if(!posicionEspiral.isOcupado()){
				posicionesDesocupadas.add(posicionEspiral);
			}
		}
		return posicionesDesocupadas;
	}
	
	public List<PosicionEspiral> obtenerPosicionesOcupadas() throws IOException{
		List<PosicionEspiral> posicionesDesocupadas = new ArrayList<>();
		for (Iterator<PosicionEspiral> iterator = posicionEspirales.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			if(posicionEspiral.isOcupado()){
				posicionesDesocupadas.add(posicionEspiral);
			}
		}
		return posicionesDesocupadas;
	}
	
}
