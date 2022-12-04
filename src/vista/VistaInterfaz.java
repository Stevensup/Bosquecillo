package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaInterfaz extends JFrame {
    public VistaInterfaz()
    {
        setTitle("Ajustes Iniciales");
        setSize(800, 600);
        setLocationRelativeTo(null);
        //setResizable(true);
        //setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
      /** Muestra el mensaje dado en el parámetro pMensaje
   */
  public void mostrarMensaje(String pMensaje) {
    JOptionPane.showMessageDialog(this, pMensaje);
  }
  public void mostrarMensaje(int pMensaje) {
    JOptionPane.showMessageDialog(this, pMensaje);
  }
  /**
   * Obtiene un String del usuario
   */
  public String leerString(String pMensaje) {
    String j = JOptionPane.showInputDialog(this, pMensaje);
    return j;
  }

  /**
   * Obtiene un entero del usuario
   */
  public int leerEntero(String pMensaje) {
    return Integer.parseInt(
      JOptionPane.showInputDialog(this, pMensaje).toString()
    );
  }
}
