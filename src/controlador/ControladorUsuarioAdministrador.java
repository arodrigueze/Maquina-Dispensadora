package controlador;

import java.io.IOException;
import java.util.List;

import modelo.AdministradorEspiral;
import modelo.AdministradorPosicionEspiral;
import modelo.Espiral;
import modelo.PosicionEspiral;


public class ControladorUsuarioAdministrador {
	
	AdministradorEspiral administradorEspiral;
	AdministradorPosicionEspiral administradorPosicionEspiral;
	
	
	
	public ControladorUsuarioAdministrador() throws IOException {
		super();
		this.administradorEspiral = new AdministradorEspiral();
		this.administradorPosicionEspiral = new AdministradorPosicionEspiral();
	}



	public boolean agregarEspiral(Espiral espiral) throws IOException{
		return administradorEspiral.agregarEspiral(espiral);
	}



	public List<PosicionEspiral> obtenerEspiralesDisponibles() throws IOException {
		return administradorPosicionEspiral.obtenerPosicionesDesocupadas();
	}
	
	public List<PosicionEspiral> obtenerEspiralesNoDisponibles() throws IOException {
		return administradorPosicionEspiral.obtenerPosicionesOcupadas();
	}
	
	public void ocuparPosicionEspiral(PosicionEspiral posicionEspiralData) throws IOException{
		administradorPosicionEspiral.modificarPosicionEspiralAOcupado(posicionEspiralData);
	}

}
