package controlador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Laberinto;
import vista.Interfaz;
import modelo.Carrito;

/**
* Atributos
*/
//private Laberinto Laberinto;


public class Controlador extends KeyAdapter implements ActionListener{

    @Override
	public void keyPressed (KeyEvent e) {
		
		int tecla = e.getKeyCode();
		switch (tecla) {
		case KeyEvent.VK_UP:
			//@cambiar poisición bosquecillo arriba
			break;
		case KeyEvent.VK_DOWN:
			//@cambiar poisición bosquecillo abajo
            break;
		case KeyEvent.VK_LEFT:
			//@cambiar poisición bosquecillo izquierda
            break;
		case KeyEvent.VK_RIGHT:
			//@cambiar poisición bosquecillo derecha
			break;

		}
	
	}

	public void controlador(int pAltura, int pAncho ){
		Interfaz gui = new Interfaz();
		String dificultad = gui.leerString("ingrese dificultad: facil o dificil");
		Laberinto mapa = new Laberinto(pAltura,pAncho,dificultad);
		gui.mostrarMensaje(mapa.validadorTamaño());
		Carrito carro = new Carrito();
	}

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
	}
	
	

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand(); 
        //@metodo para iniciar el juego

        //@metodo para salir

        //Método para mostrar reglas
    }
}
