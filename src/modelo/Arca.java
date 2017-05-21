package modelo;

public class Arca {
	
	private int id;
	private int denominacion;
	private int cantidad;
	private boolean vacia;
	
	public Arca(int id, int denominacion, int cantidad, boolean vacia) {
		super();
		this.id = id;
		this.denominacion = denominacion;
		this.cantidad = cantidad;
		this.vacia = false;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(int denominacion) {
		this.denominacion = denominacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isVacia() {
		return vacia;
	}
	public void setVacia(boolean vacia) {
		this.vacia = vacia;
	}
	
	
}
