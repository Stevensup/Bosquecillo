package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Laberinto;

import modelo.Laberinto;
import java.util.Scanner;

public class Bosquecillo{ 
	Scanner sc;
	
	public Bosquecillo() {
		sc = new Scanner(System.in);

	}
	private int Habilidad1, Habilidad2 , Habilidad3;
    int ubicacionXBosquecillo;
    int ubicacionYBosquecillo;
    int PasosIniciales;
    int identificador = 1;
    int contadorObjetivos;
     
    public Bosquecillo(int ubicacionXBosquecillo, int ubicacionYBosquecillo)
    {
    	ubicacionXBosquecillo = ubicacionXBosquecillo;
    	ubicacionYBosquecillo = ubicacionYBosquecillo;
    
	}
    
	public void setUbicacionXBosquecillo(int ubicacionXBosquecillo) {
		this.ubicacionXBosquecillo = ubicacionXBosquecillo;
	}

	public int getUbicacionYBosquecillo() {
		return ubicacionYBosquecillo;
	}

	public void setUbicacionYBosquecillo(int ubicacionYBosquecillo) {
		this.ubicacionYBosquecillo = ubicacionYBosquecillo;
	}
    
}