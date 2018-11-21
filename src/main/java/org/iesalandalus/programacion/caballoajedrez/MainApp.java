package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	public MainApp(){
		
	}
	public static void main(String[] args) {
		System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");
	
	Caballo caballo = new Caballo();
	
	try {
		System.out.println(caballo.getPosicion());
		caballo.mover(Direccion.ABAJO_IZQUIERDA);
		caballo.getPosicion();
	}catch(OperationNotSupportedException e) {
		e.printStackTrace();
	}
	System.out.println(caballo.getPosicion());
	
	
	}
	
private static void mostrarMenu(){
	Caballo caballo = new Caballo();
	

/*private static elergirOpcion(){
	
	
	
}
private static void ejecutarOpcion(){
	
	
	
}
private static void crearCaballoDefecto(){
	
	
	
}
private static void crearCaballoDefectoColor(){
	
	
	
}
private static elegirColor(Color color){
	

}*/
	

/*private static void crearCaballoColorPosicion(){
	
	
	
}
private static elegirColumnaInicial(char columnaInicial){
	
	
	
}
private static void mover(){
	
	
	
}
private static void mostrarMenuDirecciones(){
	
	
	
}
private static elegirDireccion(Direccion direccion){
	
	
	
}

}*/

}}