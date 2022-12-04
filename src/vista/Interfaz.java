package vista;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

public class Interfaz extends JFrame implements ActionListener {
//    public Interfaz(Controlador pControlador) {
    /**
	* Atributos
	*/
    JButton btnEmpezar,btnPuntosDeControl,btnPasosRestantes,btnHabilidades;
    private final ColorUIResource colorFondoTablero = new ColorUIResource(38, 70, 83);
    private final ColorUIResource colorFondoStats = new ColorUIResource(231, 111, 81);
    private final ColorUIResource colorLetraBotones = new ColorUIResource(5, 94, 112);
    private final ColorUIResource colorFondoBotones = new ColorUIResource(152, 215, 194);
    private final ColorUIResource colorCasillas = new ColorUIResource(42, 157, 143);
    public static int ancho=10;
    public static int alto=ancho;
/**
*  Creación de la interfaz, con 3 paneles en malla
*/
    public Interfaz() {


        // Especificación de los atributos de la ventana
        getContentPane().setLayout(new GridLayout(1,2));
        setTitle("Bosquecillo"); 
        setSize(1200,800); 
        setLocationRelativeTo(null); 
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        // Inicialización del atributo controlador con el controlador de la aplicación
        //controlador = pControlador;

        //Inicializacion de paneles
        add(crearPanelTablero(ancho,alto));
        add(crearPanelLateral());
        setVisible(true);
        
    }
/**@return panel que contiene el tablero de juego en gui
 * @param ancho del tablero
 * @param altura del tablero
 */

    public JPanel crearPanelTablero(int pAncho, int pAlto){
        JPanel panelTablero = new JPanel(); 
        panelTablero.setBorder(new TitledBorder("Tablero"));
        panelTablero.setLayout(new GridLayout(pAncho,pAlto));
        panelTablero.setBackground(colorFondoTablero);

        for (int i = 0; i < ancho; i++) {
            String tipoIcono="Muro";
            ArrayList<Casilla> ArregloPanelesCuadrados=new ArrayList<Casilla>();
            for (int j = 0; j < alto; j++) {
                if (j%2==0) 
                {
                    tipoIcono="Piso";
                    if(i%2==0)
                        tipoIcono="Bosquecillo";
                }
                Casilla cuadrado = new Casilla(colorCasillas,tipoIcono);
                tipoIcono="Muro";
                ArregloPanelesCuadrados.add(cuadrado);
                panelTablero.add(cuadrado);
            }
            
        }
        return panelTablero;
}
    public JPanel crearPanelLateral(){
        JPanel panelLateral = new JPanel(); 
        panelLateral.setBorder(new TitledBorder("Tablero"));
        panelLateral.setLayout(new GridLayout(2,1));
        panelLateral.add(crearPanelStats());
        panelLateral.add(crearPanelExtra());
        return panelLateral;
    }
    public JPanel crearPanelStats(){
        JPanel panelStats = new JPanel(); 
        //panelStats.setLayout(new BoxLayout(panelStats, BoxLayout.Y_AXIS));
        panelStats.setBorder(new TitledBorder("Game Stats"));
        btnEmpezar = new JButton("Empezar");
        ImageIcon icon=new ImageIcon("resources/piso.png");
        btnEmpezar.setIcon(icon);
        btnEmpezar.setForeground(colorLetraBotones);
        btnEmpezar.addActionListener(this);
        btnEmpezar.setActionCommand(btnEmpezar.getText());

        btnPuntosDeControl = new JButton("Pausar");
        btnPuntosDeControl.setForeground(colorLetraBotones);
        btnPuntosDeControl.addActionListener(this);
        btnPuntosDeControl.setActionCommand(btnPuntosDeControl.getText());

        btnHabilidades = new JButton("Guardar");
        btnHabilidades.addActionListener(this);
        btnHabilidades.setActionCommand(btnHabilidades.getText());

        btnPasosRestantes = new JButton("Cargar");
        btnPasosRestantes.addActionListener(this);
        btnPasosRestantes.setActionCommand(btnPasosRestantes.getText());


        panelStats.add(btnEmpezar);
        panelStats.add(btnPuntosDeControl);
        panelStats.add(btnHabilidades);
        panelStats.add(btnPasosRestantes);
        panelStats.setBackground(colorFondoStats);
       
        return panelStats;
}
public JPanel crearPanelExtra(){
    JPanel panelExtra = new JPanel(); 
    //panelExtra.setLayout(new BoxLayout(panelExtra, BoxLayout.Y_AXIS));
    panelExtra.setBorder(new TitledBorder("Game Extra"));
    btnEmpezar = new JButton("Empezar");
    btnEmpezar.setForeground(colorLetraBotones);
    btnEmpezar.addActionListener(this);
    btnEmpezar.setActionCommand(btnEmpezar.getText());

    btnPuntosDeControl = new JButton("Pausar");
    btnPuntosDeControl.setForeground(colorLetraBotones);
    btnPuntosDeControl.addActionListener(this);
    btnPuntosDeControl.setActionCommand(btnPuntosDeControl.getText());

    btnHabilidades = new JButton("Guardar");
    btnHabilidades.addActionListener(this);
    btnHabilidades.setActionCommand(btnHabilidades.getText());

    btnPasosRestantes = new JButton("Cargar");
    btnPasosRestantes.addActionListener(this);
    btnPasosRestantes.setActionCommand(btnPasosRestantes.getText());


    panelExtra.add(btnEmpezar);
    panelExtra.add(btnPuntosDeControl);
    panelExtra.add(btnHabilidades);
    panelExtra.add(btnPasosRestantes);
    panelExtra.setBackground(colorFondoBotones);
   
    return panelExtra;
}

    /**
     * Conecta los botones con la lógica del controlador
      */
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //String comando = e.getActionCommand(); 
            
            }

}
