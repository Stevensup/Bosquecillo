package modelo;
public class OjetosInmoviles {
    /*
     * @author Sebastian Camacho
     * @param declaracion de variables de los objetos dentro del juego respecto a posiciones e identificador
     * @return valores enteros que seran tratados por el controlador para dichos objetos
     */
    int ubicacionXmuro;
    int ubicacionYmuro;
    int ubicacionXpuntosControl;
    int ubicacionYpuntosControl;
    int identificadorM=6;
    int identificadorPC=7;
	int pUbicacionXpuntosControl;
	int pUbicacionXmuro;
	int pUbicacionYpuntosControl;
	int pUbicacionYmuro;    
    
    /*
     * @author sebastian camacho
     * @param constructor que toma el valor en ubicacion X/y del muro
     * @return se retoma la posicion X o Y
     */
    public void Muros(int pUbicacionXmuro, int pUbicacionYmuro) {
    	ubicacionXmuro = pUbicacionXmuro;
    	ubicacionYmuro = pUbicacionYmuro;
    }
    /*
     * @author sebastian camacho
     * @param constructor que toma el valor en ubicacion X/y puntoscontrol
     * @return se retoma la posicion X o Y
     */
    public void PuntosControl(int pUbicacionXpuntosControl, int pUbicacionYpuntosControl) {
    	ubicacionXpuntosControl = pUbicacionXpuntosControl;
    	ubicacionYpuntosControl =pUbicacionYpuntosControl;
    }
    /*
     * @author sebastian camacho
     * @param constructor que toma el valor en ubicacion X/y puntoscontrol
     * @return se retoma la posicion X o Y
     */
    public void setUbicacionPuntosControl(int pUbicacionXpuntosControl, int pUbicacionYpuntosControl) {
    	this.pUbicacionXpuntosControl = pUbicacionXpuntosControl;
    	this.pUbicacionYpuntosControl = pUbicacionYpuntosControl;
    }
    /*
     * @author Sebastian Camacho
     * @param retornna su valor en el arreglo
     * @return valores al controlador en posicion
     */
    public int getUbicacionXpuntosControl() {
    	return pUbicacionXpuntosControl;
    }
    /*
     * @author Sebastian Camacho
     * @param retornna su valor en el arreglo
     * @return valores al controlador en posicion
     */
    public int getUbicacionYpuntosControl() {
    	return pUbicacionYpuntosControl;
    }
    /*
     * @author sebastian camacho
     * @param constructor que toma el valor en ubicacion X/y puntoscontrol
     * @return se retoma la posicion X o Y parametros de ubicacion muro x/y
     */
    public void setUbicacionMuro (int pUbicacionXmuro, int pUbicacionYmuro) {
    	this.pUbicacionXmuro = pUbicacionXmuro;
    	this.pUbicacionYmuro = pUbicacionYmuro;
    }
    /*
     * @author Sebastian Camacho
     * @param retornna su valor en el arreglo
     * @return valores al controlador en posicion
     */
    public int getUbicacionXmuro() {
    	return pUbicacionXmuro;
    }
    /*
     * @author Sebastian Camacho
     * @param retornna su valor en el arreglo
     * @return valores al controlador en posicion
     */
    public int getUbicacionYmuro() {
    	return pUbicacionYmuro;
    }
}