package modelo;

import modelo.Laberinto;
import java.util.Scanner;

public class Carrito 
{

    int ubicacionXCarrito;
    int ubicacionYCarrito;
    int PasosIniciales;
    int identificador = 2;
    int contadorObjetivos;

	
    public Carrito(int ubicacionXCarrito, int ubicacionYCarrito, int PasosIniciales, int PasosUsados, int PasosPendientes) 
    {
    	ubicacionXCarrito = ubicacionXCarrito;
    	ubicacionYCarrito = ubicacionYCarrito;
    	PasosIniciales = PasosIniciales;
    	PasosUsados = PasosUsados;
    	PasosPendientes = PasosPendientes;
	}

	public void setUbicacionXCarrito(int ubicacionXCarrito) {
		this.ubicacionXCarrito = ubicacionXCarrito;
	}

	public int getUbicacionXCarrito() {
		return ubicacionXCarrito;
	}

	public void setUbicacionYCarrito(int ubicacionYCarrito) {
		this.ubicacionYCarrito = ubicacionYCarrito;
	}
	
	public int getUbicacionYCarrito() {
		return ubicacionYCarrito;
	}

	public int getPasosIniciales(int Altura, int Ancho) {       
		return Altura*Ancho;   
	}

	public void setPasosIniciales(int pasosIniciales) {
		PasosIniciales = pasosIniciales;
	
	}

	public int getContadorObjetivos() {
		return contadorObjetivos;
	}

	public void setContadorObjetivos(int contadorObjetivos) {
		this.contadorObjetivos = contadorObjetivos;
	}
}
	