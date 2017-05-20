package modelo;

public class PosicionEspiral {
	
	private char fila;
	private int columna;
	private boolean ocupado;
	
	
	public PosicionEspiral(char fila, int columna, boolean ocupado) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
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
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
