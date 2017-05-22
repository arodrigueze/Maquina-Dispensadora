package controlador;

import java.io.IOException;
import java.util.List;

import modelo.Arca;
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



	public boolean isServicio() {
		return maquina.isServicio();
	}



	public List<Arca> cargarArcas() {
		// TODO Auto-generated method stub
		return maquina.getAdministradorArca().obtenerArcas();
	}



	public void guardarArcas(List<Arca> arcas) throws IOException {
		maquina.getAdministradorArca().guardarArcas(arcas);		
	}

}
