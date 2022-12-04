package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Laberinto {

  private int altura; // Recoleta dato de N
  private int ancho; //Recolecta dato de M
  private int alturaMax = 20;
  private int anchoMax = 20;
  private int alturaMin = 5;
  private int anchoMin = 5;
  private int MaxpuntosControl = 5;
  private int MinpuntosControl = 2;
  private int identificador = 5; // identificador del laberinto
  private int tormentoso; // variable que retorna las tormentosos
  private int letal; // variable que retorna los letales
  private int puntosControl; //variable que toma cantidad ramdon de puntos
  private int muros; //variable que retorna muros totales
  private int dificultad; //Variable que define la cantidad de tormentosos/letales en dificultad Dificil
  //Calcula el cantidadCasillas del juego
  private int cantidadCasillas = altura * ancho;
  //arreglo que deriva del resultado de cantidadCasillas
  int[][] Laberinto = new int[altura][ancho];
  //mide la cantidad de tormentosos por dificultad facil
  private int Cantidadtormentoso;
  private int Cantidadmuros;
  private int Cantidadletales;

  //Constructor
  //   @Laberinto
  public Laberinto(int pAltura, int pAncho, String pDificultad) {
    altura = pAltura;
    ancho = pAncho;
    //mide la cantidad de tormentosos por dificultad facil
    dificultad = (pDificultad.equals("facil")) ? 2 : 5;
    Cantidadtormentoso = cantidadCasillas * dificultad / 100;
    Cantidadmuros = cantidadCasillas * dificultad / 50;
    Cantidadletales = cantidadCasillas * dificultad / 100;
  }

  //Validador cantidadCasillas
  public String validadorTamaño() {
    String mensajeTamaño="";
    if (
      altura > alturaMin ||
      altura <= alturaMax &&
      ancho > anchoMin ||
      ancho <= anchoMax
    ) {
      mensajeTamaño =
        "Se va a crea un mapa de " +
        altura +
        " de altura. Por " +
        ancho +
        "de Ancho. "; // "se cumple"
    } else if (altura < alturaMin || altura > alturaMax) {
      mensajeTamaño = "Por favor validar que la altura sea minimo 5 maximo 5";
    } else if (ancho < alturaMin || ancho > anchoMax) {
      mensajeTamaño =
        "Por favor validar que el ancho sea minimo 5 y no mayor a 20";
    }
    return mensajeTamaño;
  }

  public int agregarpuntosControl() {
    if (cantidadCasillas <= 10) {
      // asigna valor mayor de puntos de control
      puntosControl =
        (MaxpuntosControl * cantidadCasillas / (alturaMax * anchoMax) < 2)
          ? 2
          : MaxpuntosControl * cantidadCasillas / (alturaMax * anchoMax);
    }
    return puntosControl;
  }

  //Ramdon position tormentosos
  public int posicionaleatoriotormentoso() {
    int ntormentoso = 6;
    return ntormentoso;
  } //ingresar las cantidades aleatorias en el arreglo laberinto

  //Ramdon position letal
  public int posicionaleatorioletal() {
    //ingresar las cantidades aleatorias en el arreglo laberinto
    int nletal = 0;
    return nletal;
  }

  //Ramdon position muros
  public int posmuros() {
    //ingresar las cantidades aleatorias en el arreglo laberinto
    int nmuros = 0;
    return nmuros;
  }
}
