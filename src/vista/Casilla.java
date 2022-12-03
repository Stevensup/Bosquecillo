package vista;

import java.awt.LayoutManager;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

//public class Casilla extends JPanel {
public class Casilla extends JButton {

	public Casilla(Color pColor, String pText) {
		// TODO Auto-generated constructor stub
		this.setBackground(pColor);
		this.setText(pText);
	}

}
