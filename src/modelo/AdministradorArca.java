package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AdministradorArca {
	
	private List<Arca> arcas;
	private ESArcas ioarcas;

	public AdministradorArca() throws IOException {
		super();
		arcas = new ArrayList<Arca>();
		ioarcas = new ESArcas();
		arcas = ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas);
	}
	
	public boolean agregarArca(Arca arca) throws IOException{
		if (arca.getCantidad()>500) {
			return false;
		}
		if(arca.getDenominacion()==50||arca.getDenominacion()==100||arca.getDenominacion()==200||arca.getDenominacion()==500||arca.getDenominacion()==1000||arca.getDenominacion()==2000){
			arcas.add(arca);
			ioarcas.cargarArcas();
			ioarcas.guardarArcas(arcas);
			arcas.clear();
			arcas = ioarcas.cargarArcas();
			return true;
		}
		return false;
	}
	
	public boolean eliminarArca(Arca arca) throws IOException{
		arcas.remove(arca);
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas);
		return true;
	}
	
	public boolean editarDenominacion(int nuevaDenominacion, Arca arca) throws IOException {
		if(arca.getDenominacion()==50||arca.getDenominacion()==100||arca.getDenominacion()==200||arca.getDenominacion()==500||arca.getDenominacion()==1000||arca.getDenominacion()==2000){
			int index = arcas.indexOf(arca);
			arcas.get(index).setDenominacion(nuevaDenominacion);
			ioarcas.cargarArcas();
			ioarcas.guardarArcas(arcas);
			return true;
		}
		return false;
	}
	
	public boolean editarCantidad(int cantidad, Arca arca) throws IOException {
		if(cantidad>500 || cantidad<=0)
			return false;
		int index = arcas.indexOf(arca);
		arcas.get(index).setCantidad(cantidad);;
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas);
		return true;
	}

	public List<Arca> obtenerArcas() {
		return arcas;
	}

	public void guardarArcas(List<Arca> arcas2) throws IOException {
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas2);
	}

}
