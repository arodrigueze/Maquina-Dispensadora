package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.Arca;

public class Maquina {
	
	private AdministradorEspiral administradorEspiral;
	private AdministradorPosicionEspiral administradorPosicionEspiral;
	private AdministradorArca administradorArca;
	private ESEnServicio ioEnServicio;
	private List<Integer> vueltas;
	private boolean servicio;
	private String status;
	
	public Maquina() throws IOException {
		this.administradorEspiral = new AdministradorEspiral();
		this.administradorPosicionEspiral = new AdministradorPosicionEspiral();
		this.administradorArca = new AdministradorArca();
		ioEnServicio = new ESEnServicio();
		this.servicio = Boolean.parseBoolean(ioEnServicio.cargarEnServicio());
		ioEnServicio.guardarEnServicio(this.servicio);
		this.vueltas=new ArrayList<>();
	}
	
	public String getStatus() {
		return status;
	}
	
	public List<Integer> getVueltas() {
		return vueltas;
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

	public boolean comprarProducto(List<Integer> saldoCliente, char fila, int columna) throws IOException {
		boolean hayProducto = false;
		boolean dif = false;
		int total=0;
		vueltas.clear();
		for (int i = 0; i < saldoCliente.size(); i++) {
			total=total+saldoCliente.get(i);
		}
		
		List<Espiral> listaEspirales = this.administradorEspiral.obtenerEspirales();
		List<Arca> arcas = this.administradorArca.obtenerArcas();
		
		Espiral espiral=null;
		for (int i = 0; i<listaEspirales.size(); i++) {
			if(listaEspirales.get(i).getFila()==fila&&listaEspirales.get(i).getColumna()==columna){
				espiral = listaEspirales.get(i);
				hayProducto=true;
				break;
			}
		}
		
		if (!hayProducto){
			status = "No hay producto disponible.";
			return false;
		}
			
		
		if(total<espiral.getPrecioProducto()){
			status = "Saldo no disponible";
			return false;
		}
		
		int diferencia = (int)(total-espiral.getPrecioProducto());
		
		for (Iterator iterator = arcas.iterator(); iterator.hasNext();) {
			Arca arca = (Arca) iterator.next();
			int cantidad = arca.getCantidad();
			while(cantidad>0&&diferencia>=arca.getDenominacion()){
				cantidad--;
				diferencia = diferencia-arca.getDenominacion();
				if(diferencia<=0)
					dif = true;
			}
		}
		
		if(!dif){
			status="No podemos dar cambio en este momento.";
			return false;
		}	
		
		diferencia = (int)(total-espiral.getPrecioProducto());
		
		for (int i = 0; i<arcas.size();i++) {
			while(arcas.get(i).getCantidad()>0&&diferencia>=arcas.get(i).getDenominacion()){
				if(diferencia<=0)
					break;
				arcas.get(i).setCantidad(arcas.get(i).getCantidad()-1);
				vueltas.add(arcas.get(i).getDenominacion());
				diferencia = diferencia-arcas.get(i).getDenominacion();
			}
		}
		this.administradorArca.guardarArcas(arcas);
		
		for (int i = 0; i<listaEspirales.size(); i++) {
			if(listaEspirales.get(i).getFila()==fila&&listaEspirales.get(i).getColumna()==columna){
				listaEspirales.get(i).setCantidadProducto(listaEspirales.get(i).getCantidadProducto()-1);
				if(listaEspirales.get(i).getCantidadProducto()==0){
					listaEspirales.remove(listaEspirales.get(i));
					this.administradorPosicionEspiral.modificarPosicionEspiralADesocupado(new PosicionEspiral(listaEspirales.get(i).getFila(), listaEspirales.get(i).getColumna(), false));
				}
				this.administradorEspiral.guardarEspirales(listaEspirales);
				break;
			}
		}
		return true;
	}

	public void cancelarTransaccion(List<Integer> saldoCliente) throws IOException {
		List<Arca> arcas = this.administradorArca.obtenerArcas();
		for (int i = 0; i<saldoCliente.size();i++) {
			for (int j = 0; j<arcas.size();j++) {
				if(arcas.get(j).getDenominacion()==saldoCliente.get(i)){
					arcas.get(j).setCantidad(arcas.get(j).getCantidad()-1);
					break;
				}
			}
		}
		this.administradorArca.guardarArcas(arcas);
	}
}
