package vista;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Interfaz extends JFrame implements ActionListener {
//    public Interfaz(Controlador pControlador) {
    JButton btnEmpezar,btnPuntosDeControl,btnPasosRestantes,btnHabilidades;
    public Interfaz() {
    /**
	* Atributos
	*/

        // Especificación de los atributos de la ventana
        getContentPane().setLayout(new GridLayout(1,2));
        setTitle("Bosquecillo"); 
        setSize(850,600); 
        setLocationRelativeTo(null); 
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        // Inicialización del atributo controlador con el controlador de la aplicación
        //controlador = pControlador;

        //Inicializacion de paneles
        add(crearTablero());
        add(crearPanelStats());
        setVisible(true);
        
    }
    public JPanel crearTablero(){
        JPanel panelTablero = new JPanel(); 
        panelTablero.setBorder(new TitledBorder("Tablero"));

        return panelTablero;
}

    public JPanel crearPanelStats(){
        JPanel panelStats = new JPanel(); 
        panelStats.setLayout(new BoxLayout(panelStats, BoxLayout.Y_AXIS));
        panelStats.setBorder(new TitledBorder("Game Stats"));
        btnEmpezar = new JButton("Empezar");
        btnEmpezar.addActionListener(this);
        btnEmpezar.setActionCommand(btnEmpezar.getText());

        btnPuntosDeControl = new JButton("PuntosDeControl");
        btnPuntosDeControl.addActionListener(this);
        btnPuntosDeControl.setActionCommand(btnPuntosDeControl.getText());

        btnHabilidades = new JButton("HabilidadesDeControl");
        btnHabilidades.addActionListener(this);
        btnHabilidades.setActionCommand(btnHabilidades.getText());

        btnPasosRestantes = new JButton("PasosRestantesDeControl");
        btnPasosRestantes.addActionListener(this);
        btnPasosRestantes.setActionCommand(btnPasosRestantes.getText());


        panelStats.add(btnEmpezar);
        panelStats.add(btnPuntosDeControl);
        panelStats.add(btnHabilidades);
        panelStats.add(btnPasosRestantes);
       
        return panelStats;
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
