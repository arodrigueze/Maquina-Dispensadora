package controlador;

import java.io.IOException;
import java.util.List;

import modelo.Arca;
import modelo.Espiral;
import modelo.Maquina;
import modelo.PosicionEspiral;

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



	public void guardarEspirales(List<Espiral> listaEspirales) throws IOException {
		maquina.getAdministradorEspiral().guardarEspirales(listaEspirales);
		
	}



	public void eliminarPosicionEspiral(char fila, int columna) throws IOException {
		maquina.getAdministradorPosicionEspiral().modificarPosicionEspiralADesocupado(new PosicionEspiral(fila, columna, false));		
	}



	public boolean comprarProducto(List<Integer> saldoCliente, char fila, int columna) throws IOException {
		return maquina.comprarProducto(saldoCliente,fila,columna);
	}
	

	public String getStatusMaquina() {
		return maquina.getStatus();
	}



	public List<Integer> obtenerVueltasCliente() {
		// TODO Auto-generated method stub
		return maquina.getVueltas();
	}



	public void cancelarTransaccion(List<Integer> saldoCliente) throws IOException {
		maquina.cancelarTransaccion(saldoCliente);
		
	}

}
