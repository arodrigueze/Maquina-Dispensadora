package modelo;

public class Espiral {
	
	private String nombreProducto;
	private double precioProducto;
	private int cantidadProducto;
	private char fila;
	private int columna;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public char getFila() {
		return fila;
	}
	public void setFila(char fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public Espiral(String nombreProducto, double precioProducto, int cantidadProducto, char fila, int columna) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.cantidadProducto = cantidadProducto;
		this.fila = fila;
		this.columna = columna;
	}	
}
