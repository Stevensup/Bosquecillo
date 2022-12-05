package vista;

import java.awt.LayoutManager;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//public class Casilla extends JPanel {
public class Casilla extends JButton {

	/*
	 * @author David Segura
	 * @methods pinta las img de las entidades en el panel
	 * @return valores de imagen en el arreglo
	 */
	public Casilla(Color pColor, String pTipoIcono) {
		// TODO Auto-generated constructor stub
		String iconName="resources/";
		this.setBackground(pColor);
			if (pTipoIcono.equalsIgnoreCase("Piso") || pTipoIcono.equalsIgnoreCase("Bosquecillo") || pTipoIcono.equalsIgnoreCase("Carrito") || pTipoIcono.equalsIgnoreCase("Letal") || pTipoIcono.equalsIgnoreCase("Tormentoso") || pTipoIcono.equalsIgnoreCase("Muros") || pTipoIcono.equalsIgnoreCase("PuntosControl") ) 
			{
				iconName=iconName+pTipoIcono+".png";
			}
		else
			{
				iconName=iconName+"other"+".png";
			}
		ImageIcon icon=new ImageIcon((getClass().getResource(iconName)));

		//this.setText(pText);
		this.setIcon(icon);
	}

}
