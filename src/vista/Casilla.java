package vista;

import java.awt.LayoutManager;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//public class Casilla extends JPanel {
public class Casilla extends JButton {

	public Casilla(Color pColor, String pTipoIcono) {
		// TODO Auto-generated constructor stub
		String iconName="resources/";
		this.setBackground(pColor);
			if (pTipoIcono.equalsIgnoreCase("Muro") || pTipoIcono.equalsIgnoreCase("Piso") || pTipoIcono.equalsIgnoreCase("Bosquecillo") || pTipoIcono.equalsIgnoreCase("PuntoObjetivo") ) 
			{
				iconName=iconName+pTipoIcono+".png";
			}
		else
			{
				
			}
		ImageIcon icon=new ImageIcon((getClass().getResource(iconName)));

		//this.setText(pText);
		this.setIcon(icon);
	}

}
