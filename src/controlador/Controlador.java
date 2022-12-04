package controlador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Laberinto;

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
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand(); 
        //@metodo para iniciar el juego

        //@metodo para salir

        //Método para mostrar reglas
    }
}
