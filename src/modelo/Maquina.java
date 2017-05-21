package modelo;

import java.io.IOException;

public class Maquina {
	
	private AdministradorEspiral administradorEspiral;
	private AdministradorPosicionEspiral administradorPosicionEspiral;
	private AdministradorArca administradorArca;
	private ESEnServicio ioEnServicio;
	private boolean servicio;
	
	public Maquina() throws IOException {
		this.administradorEspiral = new AdministradorEspiral();
		this.administradorPosicionEspiral = new AdministradorPosicionEspiral();
		this.administradorArca = new AdministradorArca();
		ioEnServicio = new ESEnServicio();
		this.servicio = Boolean.parseBoolean(ioEnServicio.cargarEnServicio());
		ioEnServicio.guardarEnServicio(this.servicio);
	}
	
	public AdministradorArca getAdministradorArca() {
		return administradorArca;
	}

	public AdministradorEspiral getAdministradorEspiral() {
		return administradorEspiral;
	}

	public AdministradorPosicionEspiral getAdministradorPosicionEspiral() {
		return administradorPosicionEspiral;
	}

	public boolean isServicio() {
		return servicio;
	}

	public void setServicio(boolean servicio) throws IOException {
		ioEnServicio.cargarEnServicio();
		ioEnServicio.guardarEnServicio(servicio);
		this.servicio = servicio;
		
	}
}
