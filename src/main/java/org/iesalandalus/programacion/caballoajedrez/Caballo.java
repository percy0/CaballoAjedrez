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
public Caballo(Color color) {
if(color ==null) {
	
		throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");

}
		if(color.equals (Color.BLANCO)) {
		this.posicion=new Posicion(1, 'b');
		this.color=color;
		}
		if(color.equals (Color.NEGRO)) {	
	this.posicion=new Posicion(8, 'b');
	this.color=color;
	}
	
}
	
/*	public Caballo(Color color, char columnaInicial) {
		if(columnaInicial!='b' || columnaInicial!='g') {
			
			throw new IllegalArgumentException("ERROR: Columna inicial no válida.");
		
		}
		
		
	}
	public Caballo(Caballo caballo) {
		
	}
	public void mover(Direccion direccion) {
		if(direccion == null) {
			throw new IllegalArgumentException("ERROR: Columna inicial no válida.");
		}
		this.direccion= Direccion.ABAJO_DERECHA;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caballo other = (Caballo) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Caballo [color=" + color + ", posicion=" + posicion + "]";
	}*/
	
}
