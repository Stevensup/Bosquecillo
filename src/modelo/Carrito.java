package modelo;

import modelo.Laberinto;
import java.util.Scanner;

public class Carrito 
{
	/*
   * @autor Juan Ochoa
   * @param recibe los valores de posicion de carrito - recibimos cantidad de pasos  , identificador del carrito - contador de objetivos en la gui
   * @return valor de la ubicacion en el arreglo , calcula el valor de pasos y objetivos
   */
    int ubicacionXCarrito;
    int ubicacionYCarrito;
    int PasosIniciales;
    int identificador = 2;
    int contadorObjetivos;

	
    	 /*
		* @author Juan Ochoa
		@param recibe los valores de la ubicacion carrito
		@return la posicion en el arreglo [][], pasos inicil, usado y pendientes
		   Contructor carrito
		*/
    public Carrito(int ubicacionXCarrito, int ubicacionYCarrito, int PasosIniciales, int PasosUsados, int PasosPendientes) {
    	ubicacionXCarrito = ubicacionXCarrito;
    	ubicacionYCarrito = ubicacionYCarrito;
    	PasosIniciales = PasosIniciales;
    	PasosUsados = PasosUsados;
    	PasosPendientes = PasosPendientes;
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public void setUbicacionXCarrito(int ubicacionXCarrito) {
		this.ubicacionXCarrito = ubicacionXCarrito;
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public int getUbicacionXCarrito() {
		return ubicacionXCarrito;
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public void setUbicacionYCarrito(int ubicacionYCarrito) {
		this.ubicacionYCarrito = ubicacionYCarrito;
	}
	
	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public int getUbicacionYCarrito() {
		return ubicacionYCarrito;
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public int getPasosIniciales(int Altura, int Ancho) {       
		return Altura*Ancho;   
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public void setPasosIniciales(int pasosIniciales) {
		PasosIniciales = pasosIniciales;
	
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public int getContadorObjetivos() {
		return contadorObjetivos;
	}

	/*
	 * @author Juan Ochoa
	 * @param retoma el valor en la posicion indicada
	 * @return retorna el valor del mismo al controlador
	 */
	public void setContadorObjetivos(int contadorObjetivos) {
		this.contadorObjetivos = contadorObjetivos;
	}
}
	