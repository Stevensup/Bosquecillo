package vista;

import java.awt.BorderLayout;
import java.io.File; //File class
import java.io.FileNotFoundException; //File Class exception handler
import java.util.Scanner;// Scanner to read text files aka rules
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

public class Interfaz extends JFrame implements ActionListener {

  //    public Interfaz(Controlador pControlador) {
  /**
   * Atributos
   */
  JButton btnEmpezar, btnPuntosDeControl, btnPasosRestantes, btnHabilidades;
  private final ColorUIResource colorFondoTablero = new ColorUIResource(
    38,
    70,
    83
  );
  private final ColorUIResource colorFondoStats = new ColorUIResource(
    231,
    111,
    81
  );
  private final ColorUIResource colorLetraBotones = new ColorUIResource(
    5,
    94,
    112
  );
  private final ColorUIResource colorFondoBotones = new ColorUIResource(
    152,
    215,
    194
  );
  private final ColorUIResource colorCasillas = new ColorUIResource(
    42,
    157,
    143
  );
  public static int ancho;
  public static int alto;

  /**
   *  Creación de la interfaz, con 3 paneles en malla
   */
  public Interfaz() 
  {

  }
  public void crearInterfaz(int pAncho, int pAlto, int[][] pLaberinto) {
    // Especificación de los atributos de la ventana
    getContentPane().setLayout(new GridLayout(1, 2));
    setTitle("Bosquecillo");
    setSize(1200, 800);
    setLocationRelativeTo(null);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    ancho=pAncho;
    alto=pAlto;

    // Inicialización del atributo controlador con el controlador de la aplicación
    //controlador = pControlador;

    //Inicializacion de paneles
    add(crearPanelTablero(pAncho, pAlto,pLaberinto));
    add(crearPanelLateral());
    setVisible(true);
  }

  /**@return panel que contiene el tablero de juego en gui
   * @param ancho del tablero
   * @param altura del tablero
   */

  public JPanel crearPanelTablero(int pAncho, int pAlto,int [][] pLaberinto) {
    JPanel panelTablero = new JPanel();
    panelTablero.setBorder(new TitledBorder("Tablero"));
    panelTablero.setLayout(new GridLayout(pAncho, pAlto));
    panelTablero.setBackground(colorFondoTablero);

    for (int i = 0; i < pAncho; i++) {
      String tipoIcono = "Muro";
      ArrayList<Casilla> ArregloPanelesCuadrados = new ArrayList<Casilla>();
      for (int j = 0; j < pAlto; j++) {
        if (pLaberinto[i][j]==0) 
          tipoIcono = "Piso";
          else if(pLaberinto[i][j]==1)
          tipoIcono = "Bosquecillo";
          else if(pLaberinto[i][j]==2)
          tipoIcono = "Carrito";
          else if(pLaberinto[i][j]==3)
          tipoIcono = "Other";
          else if(pLaberinto[i][j]==4)
          tipoIcono = "Letal";
          else if(pLaberinto[i][j]==5)
          tipoIcono = "Tormentoso";
          else if(pLaberinto[i][j]==6)
          tipoIcono = "Muros";
          else if(pLaberinto[i][j]==7)
          tipoIcono = "PuntosControl";
        
        Casilla cuadrado = new Casilla(colorCasillas, tipoIcono);
        ArregloPanelesCuadrados.add(cuadrado);
        panelTablero.add(cuadrado);
      }
    }
    return panelTablero;
  }

  public JPanel crearPanelLateral() {
    JPanel panelLateral = new JPanel();
    panelLateral.setBorder(new TitledBorder("Tablero"));
    panelLateral.setLayout(new GridLayout(2, 1));
    panelLateral.add(crearPanelStats());
    panelLateral.add(crearPanelExtra());
    return panelLateral;
  }

  public JPanel crearPanelStats() {
    JPanel panelStats = new JPanel();
    //panelStats.setLayout(new BoxLayout(panelStats, BoxLayout.Y_AXIS));
    panelStats.setBorder(new TitledBorder("Game Stats"));
    btnEmpezar = new JButton("Reglas");
    ImageIcon icon = new ImageIcon("resources/"+btnEmpezar.getText());
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

  public JPanel crearPanelExtra() {
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
    String comando = e.getActionCommand();

    if(comando.equals("Reglas"))
      mostrarReglas(); 
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
  public void mostrarReglas()
  {
    String reglas="";
    try {
      File archivo = new File("src/vista/resources/reglas.txt");
      Scanner Lector = new Scanner(archivo);
      while (Lector.hasNextLine()) 
      {
        reglas = reglas+Lector.nextLine();
      }
JFrame frame = new JFrame("Reglas de Juego Bosquecillo");
JTextArea jArea=new JTextArea(reglas);
jArea.setBounds(10,30, 400,300);
jArea.setLineWrap(true);
frame.add(jArea);
frame.setLocationRelativeTo(null);
frame.setResizable(true);       
frame.setSize(450, 400);
frame.setLayout(null);
frame.setVisible(true);

      //mostrarMensaje(reglas);
      Lector.close();
    } catch (FileNotFoundException e) {
      mostrarMensaje("Occurió un error.");
      e.printStackTrace();
    }
  }
}
