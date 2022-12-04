package controlador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Laberinto;
import vista.Interfaz;

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
		
	}
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand(); 
        //@metodo para iniciar el juego

        //@metodo para salir

        //Método para mostrar reglas
    }
}
