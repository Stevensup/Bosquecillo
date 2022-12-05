package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Laberinto;

public class Bestia {
    int UbicacionXBestiaLetal, UbicacionXBestiaTormentosa;
    int UbicacionYBestiaLetal, UbicacionYBestiaTormentosa;
    int identificadorBestiaLetal = 4;
    int identificadorBestiaTormentosa = 5;
	private int pUbicacionXbestiaT;
	private int pUbicacionYbestiaT;
	
    

    public void BestiaLetal(int pUbicacionXbestiaL,int pUbicacionYbestiaL){
    	UbicacionXBestiaLetal = pUbicacionXbestiaL;
    	UbicacionYBestiaLetal = pUbicacionYbestiaL;
    }

    public void BestiaTormentosa(int pUbicacionXbestiaT,int pUbicacionYbestiaT){
        UbicacionXBestiaTormentosa = pUbicacionXbestiaT;
        UbicacionYBestiaTormentosa = pUbicacionYbestiaT;
    }
     
	public void setUbicacionXBestiaTormentosa(int pUbicacionXbestiaT) {
		this.pUbicacionXbestiaT = pUbicacionXbestiaT;
	}

	public int getUbicacionXBestiaTormentosa() {
		return pUbicacionXbestiaT;
	}

	public void setUbicacionYBestiaTormentosa(int pUbicacionYbestiaT) {
		this.pUbicacionYbestiaT = pUbicacionYbestiaT;
	}

	public int getUbicacionYBestiaTormentosa() {
		return pUbicacionYbestiaT;
		}
	
}