package controlador;

import java.io.IOException;
import java.util.List;

import modelo.Arca;
import modelo.Espiral;
import modelo.Maquina;
import modelo.PosicionEspiral;


public class ControladorUsuarioAdministrador {
	
	Maquina maquina;	
	
	public ControladorUsuarioAdministrador() throws IOException {
		super();
		this.maquina = new Maquina();
	}

	public boolean agregarEspiral(Espiral espiral) throws IOException{
		return maquina.getAdministradorEspiral().agregarEspiral(espiral);
	}

	public List<PosicionEspiral> obtenerEspiralesDisponibles() throws IOException {
		return maquina.getAdministradorPosicionEspiral().obtenerPosicionesDesocupadas();
	}
	
	public List<PosicionEspiral> obtenerEspiralesNoDisponibles() throws IOException {
		return maquina.getAdministradorPosicionEspiral().obtenerPosicionesOcupadas();
	}
	
	public void ocuparPosicionEspiral(PosicionEspiral posicionEspiralData) throws IOException{
		maquina.getAdministradorPosicionEspiral().modificarPosicionEspiralAOcupado(posicionEspiralData);
	}

	public boolean editarEspiral(Espiral espiral) throws IOException {
		return maquina.getAdministradorEspiral().editarEspiral(espiral);
	}

	public List<Espiral> obtenerEspirales() {
		return maquina.getAdministradorEspiral().obtenerEspirales();
	}

	public void editarCantidad(char fila, int columna, int cantidad) throws IOException {
		maquina.getAdministradorEspiral().editarCantidad(fila, columna, cantidad);
	}

	public boolean isServicio() {
		return maquina.isServicio();
	}

	public void cambiarEstadoMaquina(boolean b) throws IOException {
		maquina.setServicio(b);
	}

	public boolean eliminarEspiral(char fila, int columna) throws IOException {
		return maquina.getAdministradorEspiral().eliminarEspiral(fila, columna);
	}

	public void desocuparPosicionEspiral(PosicionEspiral posicionEspiral) throws IOException {
		maquina.getAdministradorPosicionEspiral().modificarPosicionEspiralADesocupado(posicionEspiral);
		
	}

	public void agregarArca(Arca arca) throws IOException {
		maquina.getAdministradorArca().agregarArca(arca);
	}

	public List<Arca> obtenerArcas() {
		return maquina.getAdministradorArca().obtenerArcas();
	}

	public void editarDenominacion(int id, int denominacion) throws IOException {
		maquina.getAdministradorArca().editarDenominacion(id, denominacion);		
	}

	public void editarCantidadDenominacion(int id, int cantidad) throws IOException {
		maquina.getAdministradorArca().editarCantidad(id, cantidad);
	}

}
