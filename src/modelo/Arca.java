package modelo;

public class Arca {
	
	private int denominacion;
	private int cantidad;
	private boolean vacia;
	
	public Arca(int denominacion, int cantidad, boolean vacia) {
		super();
		this.denominacion = denominacion;
		this.cantidad = cantidad;
		this.vacia = false;
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
