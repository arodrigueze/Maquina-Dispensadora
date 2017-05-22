package modelo;

import java.io.IOException;
import java.util.ArrayList;
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
		arcas.add(arca);
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas);
		return true;
	}
	
	public boolean eliminarArca(Arca arca) throws IOException{
		arcas.remove(arca);
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas);
		return true;
	}
	
	public void editarDenominacion(int id, int nuevaDenominacion) throws IOException {
		for (Iterator iterator = arcas.iterator(); iterator.hasNext();) {
			Arca arca = (Arca) iterator.next();
			if(arca.getId()==id){
				arcas.remove(arca);
				arca.setDenominacion(nuevaDenominacion);
				arcas.add(arca);
				ioarcas.cargarArcas();
				ioarcas.guardarArcas(arcas);
				break;
			}
		}
	}
	
	public void editarCantidad(int id, int cantidad) throws IOException {
		for (Iterator iterator = arcas.iterator(); iterator.hasNext();) {
			Arca arca = (Arca) iterator.next();
			if(arca.getId()==id){
				arcas.remove(arca);
				arca.setCantidad(cantidad);;
				arcas.add(arca);
				ioarcas.cargarArcas();
				ioarcas.guardarArcas(arcas);
				break;
			}
		}
	}

	public List<Arca> obtenerArcas() {
		return arcas;
	}

	public void guardarArcas(List<Arca> arcas2) throws IOException {
		ioarcas.cargarArcas();
		ioarcas.guardarArcas(arcas2);
	}

}
