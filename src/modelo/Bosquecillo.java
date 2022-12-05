package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import modelo.Laberinto;
import modelo.Laberinto;

public class Bosquecillo {

  /*
   * @autor sebastian camacho
   * @param recibe los valores de posicion de bosquecillo - recibimos cantidad de pasos  , identificador del bosquesillo - contador de objetivos en la gui
   * @return valor de la ubicacion en el arreglo , calcula el valor de pasos y objetivos
   */
  private int Habilidad1, Habilidad2, Habilidad3;
  int ubicacionXBosquecillo;
  int ubicacionYBosquecillo;
  int PasosIniciales;
  int identificador = 1;
  int contadorObjetivos;

  /*
   * @author sebastian camacho
   * @param recibe los parametros de ubicacion en X y Y
   * @return los valores en el arreglo de X y Y
   * Constructor Bosquecillo
   */
  public Bosquecillo(int ubicacionXBosquecillo, int ubicacionYBosquecillo) {
    ubicacionXBosquecillo = ubicacionXBosquecillo;
    ubicacionYBosquecillo = ubicacionYBosquecillo;
  }

  /*
   * @author sebastian camacho
   * @param recibe los parametros de ubicacion en X y Y
   * @return los valores en el arreglo de X y Y
   */
  public void setUbicacionXBosquecillo(int ubicacionXBosquecillo) {
    this.ubicacionXBosquecillo = ubicacionXBosquecillo;
  }

  /*
   * @author sebastian camacho
   * @param recibe los parametros de ubicacion en X y Y
   * @return los valores en el arreglo de X y Y
   */
  public int getUbicacionYBosquecillo() {
    return ubicacionYBosquecillo;
  }

  /*
   * @author sebastian camacho
   * @param recibe los parametros de ubicacion en X y Y
   * @return los valores en el arreglo de X y Y
   */
  public void setUbicacionYBosquecillo(int ubicacionYBosquecillo) {
    this.ubicacionYBosquecillo = ubicacionYBosquecillo;
  }
}
