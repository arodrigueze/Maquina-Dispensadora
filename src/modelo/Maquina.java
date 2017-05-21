package modelo;

import java.io.IOException;

public class Maquina {
	
	private AdministradorEspiral administradorEspiral;
	private AdministradorPosicionEspiral administradorPosicionEspiral;
	private boolean servicio;
	
	public Maquina() throws IOException {
		this.administradorEspiral = new AdministradorEspiral();
		this.administradorPosicionEspiral = new AdministradorPosicionEspiral();
		this.servicio = true;
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

	public void setServicio(boolean servicio) {
		this.servicio = servicio;
	}
}
