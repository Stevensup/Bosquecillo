package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.Carrito;
import modelo.Laberinto;
import vista.Interfaz;
import vista.VistaInterfaz;

/**
 * Atributos
 */
public class Controlador extends KeyAdapter implements ActionListener {

  @Override
  public void keyPressed(KeyEvent e) {
    /*
		@author david segura
		@param recibe por la funcion keyPressed el evento del teclado
		@return posicion para mover a bosquecillo KeyEvent
		 */
    int tecla = e.getKeyCode();
    switch (tecla) {
      case KeyEvent.VK_UP:
        /*	
		cambiar poisición bosquecillo arriba
		 */
        break;
      case KeyEvent.VK_DOWN:
        /* 
		cambiar poisición bosquecillo abajo
			*/
        break;
      case KeyEvent.VK_LEFT:
        /* 
			cambiar poisición bosquecillo izquierda

			*/
        break;
      case KeyEvent.VK_RIGHT:
        /*
			cambiar poisición bosquecillo derecha
			 */
        break;
    }
  }

  /* 
 * Controlador encargado de iniciar la interfaz y recoleccion de datos logica
  		@author david segura
		@param recolecta el ancho,altura y difucultad de juego validartamaño(valida los requerimientos de alturaxancho) getnumpuntoscontrol(verifica la cantidad de puntos de control segun la cantidad de anchoxaltura)
		@return  valores enteros al controlador ancho-altura y string segun complejidad juego
 * 
*/
  public Controlador() {
    Interfaz gui = new Interfaz();
    //String dificultad = gui.leerString("ingrese dificultad: facil o dificil");
    int pAncho = gui.leerEntero("Ingrese el ancho del tablero");
    int pAlto = gui.leerEntero("Ingrese la altura del tablero");
    Laberinto mapa = new Laberinto(pAlto, pAncho, "dificil");
    gui.mostrarMensaje(mapa.validadorTamaño());
    gui.mostrarMensaje(mapa.getNumPuntosControl());
    mapa.IncializadorLaberinto();
    gui.crearInterfaz(pAncho,pAlto, mapa.getLaberinto());
    //Carrito carro = new Carrito(mapa.getposBosquecilloX(),mapa.getposBosquecilloY(),mapa.getcantidadCasillas());
  }

  /**
	public void validadorUbicacion() {
		//posicion bosquecillo para validar
		  if (mapa[Carrito.ubicacionXCarrito+1][Carrito.ubicacionYCarrito+1]==4) {
			  Carrito.PasosUsados=Carrito.PasosUsados-(Carrito.PasosUsados*0.05);
		  }
		  else if (mapa[Carrito.ubicacionXCarrito-1][Carrito.ubicacionYCarrito-1]==4) {
			  Carrito.PasosUsados=Carrito.PasosUsados-(Carrito.PasosUsados*0.05);
		  }
		  else if (mapa[Carrito.ubicacionXCarrito+1][Carrito.ubicacionYCarrito+1]==3) {
			  Carrito.PasosUsados=Carrito.PasosUsados-Carrito.PasosUsados;
		  }
		  else if (mapa[Carrito.ubicacionXCarrito-1][Carrito.ubicacionYCarrito-1]==3) {
			  Carrito.PasosUsados=Carrito.PasosUsados-Carrito.PasosUsados;
		  }
		  else if (mapa[Carrito.ubicacionXCarrito+1][Carrito.ubicacionYCarrito+1]==5) {
			  Carrito.PasosUsados=Carrito.PasosUsados;
		  }
		  else if (mapa[Carrito.ubicacionXCarrito-1][Carrito.ubicacionYCarrito-1]==5) {
			  Carrito.PasosUsados=get.PasosUsados;
		  }
		 }
	*/

  @Override
  public void actionPerformed(ActionEvent e) {
    String comando = e.getActionCommand();
    //@metodo para iniciar el juego

    //@metodo para salir

    //Método para mostrar reglas
  }
}
