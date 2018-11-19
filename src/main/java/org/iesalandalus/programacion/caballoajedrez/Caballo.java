package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	
	
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public Caballo() {
		this.color= Color.NEGRO;
		this.posicion=new Posicion(8, 'b');
			
	}
	
	
	
}
