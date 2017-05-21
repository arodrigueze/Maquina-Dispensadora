package controlador;

import java.io.IOException;
import java.util.List;

import modelo.Espiral;
import modelo.Maquina;

public class ControladorUsuarioCliente {
	
	private Maquina maquina;
		
	public ControladorUsuarioCliente() throws IOException {
		super();
		this.maquina = new Maquina();
	}



	public List<Espiral> obtenerEspirales() {
		return maquina.getAdministradorEspiral().obtenerEspirales();
	}

}
