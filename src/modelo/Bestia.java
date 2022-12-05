package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Laberinto;

public class Bestia {

  /*
   * @autor sebastian camacho
   * @param recibe los valores de posicion, identificacion de las bestias
   * @posicion en arreglo segun posicion aleatoria [][]
   */
  int UbicacionXBestiaLetal, UbicacionXBestiaTormentosa;
  int UbicacionYBestiaLetal, UbicacionYBestiaTormentosa;
  int identificadorBestiaLetal = 4;
  int identificadorBestiaTormentosa = 5;
  private int pUbicacionXbestiaT;
  private int pUbicacionYbestiaT;

  /*
	  * @author sebastian camacho
	  @param recibe los valores de la ubicacion bestia
	  @return la posicion en el arreglo [][]
    Contructor bestialetal
	  */
  public void BestiaLetal(int pUbicacionXbestiaL, int pUbicacionYbestiaL) {
    UbicacionXBestiaLetal = pUbicacionXbestiaL;
    UbicacionYBestiaLetal = pUbicacionYbestiaL;
  }

  /*
  * @author sebastian camacho
  @param recibe los valores de la ubicacion bestia
  @return la posicion en el arreglo [][]
     Contructor bestiatormentosa
  */
  public void BestiaTormentosa(int pUbicacionXbestiaT, int pUbicacionYbestiaT) {
    UbicacionXBestiaTormentosa = pUbicacionXbestiaT;
    UbicacionYBestiaTormentosa = pUbicacionYbestiaT;
  }

  /*
   * @author sebastian camacho
   * @param recibe los valores de la ubicacion bestia
   * @return la posicion en el arreglo [][]
   */
  public void setUbicacionXBestiaTormentosa(int pUbicacionXbestiaT) {
    this.pUbicacionXbestiaT = pUbicacionXbestiaT;
  }

  /*
  * @author sebastian camacho
  @param recibe los valores de la ubicacion bestia
  @return la posicion en el arreglo [][]
  */
  public int getUbicacionXBestiaTormentosa() {
    return pUbicacionXbestiaT;
  }

  /*
  * @author sebastian camacho
  @param recibe los valores de la ubicacion bestia
  @return la posicion en el arreglo [][]
  */
  public void setUbicacionYBestiaTormentosa(int pUbicacionYbestiaT) {
    this.pUbicacionYbestiaT = pUbicacionYbestiaT;
  }

  /*
  * @author sebastian camacho
  @param recibe los valores de la ubicacion bestia
  @return la posicion en el arreglo [][]
  */
  public int getUbicacionYBestiaTormentosa() {
    return pUbicacionYbestiaT;
  }
}
