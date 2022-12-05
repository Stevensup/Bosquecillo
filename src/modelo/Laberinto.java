package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Laberinto {

  /*
   * @author Steven Useche
   * @param declaracion de variables con los valores utlizados en la logica
   * @returna valores a la vista de acuerdo a las acciones
   */

  private int alto; // Recoleta dato de N
  private int ancho; //Recolecta dato de M
  private int altoMax = 20;
  private int anchoMax = 20;
  private int altoMin = 5;
  private int anchoMin = 5;
  private int MaxpuntosControl = 5;
  private int MinpuntosControl = 2;
  private int numTormentosos; // variable que retorna las tormentosos
  private int numLetales; // variable que retorna los letales
  private int numPuntosControl; //variable que toma cantidad ramdon de puntos
  private int numMuros; //variable que retorna muros totales
  private int dificultad; //Variable que define la cantidad de tormentosos/letales en dificultad Dificil
  private int posBosquecilloX;
  private int posBosquecilloY;
  //Calcula el cantidadCasillas del juego
  private int cantidadCasillas = alto * ancho;
  //mide la cantidad de tormentosos por dificultad facil
  private int Cantidadtormentoso;
  private int Cantidadmuros;
  private int Cantidadletales;
  /*
   * @methodo declaracion de arreglo de 2D */
  //arreglo que deriva del resultado de cantidadCasillas
  int[][] Laberinto = new int[alto][ancho];

  /*
   * @author Steven Useche
   * @constructor que conlleva los parametros del juego , ancho-alto-dificultad-cant bestias
   * @retorna los varaibles de entorno para el juego
   */

  public Laberinto(int palto, int pAncho, String pDificultad) {
    alto = palto;
    ancho = pAncho;
    Laberinto = new int[ancho][alto];
    //mide la cantidad de tormentosos por dificultad facil
    dificultad = (pDificultad.equals("facil")) ? 2 : 5;
    numTormentosos = cantidadCasillas * dificultad / 100;
    numMuros = cantidadCasillas * dificultad / 50;
    numLetales = cantidadCasillas * dificultad / 100;
    numPuntosControl =
      (((MaxpuntosControl * cantidadCasillas) / (altoMax * anchoMax)) < 2)
        ? 2
        : (MaxpuntosControl * cantidadCasillas) / (altoMax * anchoMax);
  }

  /*
   * @author Steven Useche
   * @param encargador de asignar aleatoriamente valores en coordenadas
   * @return rand al controlador
   */
  public int coordenadasAleatorias(int pLimite) {
    int rand = (int) Math.random() * pLimite - 1;
    if (rand < 0) rand = 0;
    return rand;
  }

  /*
   * @author Steven Useche
   * @param encargador de asignar aleatoriamente valores en coordenadas
   */

  //Validador cantidadCasillas
  public void IncializadorLaberinto() {
    //Posición inicial Bosquecillo
    posBosquecilloX = coordenadasAleatorias(ancho);
    posBosquecilloY = coordenadasAleatorias(alto);

    for (int i = 0; i < Laberinto.length; i++) {
      for (int j = 0; j < Laberinto[0].length; j++) {
        Laberinto[i][j] = 0;
      }
    }
    /*
     * @method asigna la posicion inicial de bosquecillo
     */
    //Posición inicial Bosquecillo
    Laberinto[posBosquecilloX][posBosquecilloY] = 1;
    /*
     * @method asigna la posicion inicial de carrito
     */
    Laberinto[posBosquecilloX + 1][posBosquecilloY] = 2;
    /*
     * @method asigna las posiciones vacias
     * Creación de Tormentosos en posiciones aleatorias
     */
    for (int i = numTormentosos; i > 0;) {
      int x = coordenadasAleatorias(ancho);
      int y = coordenadasAleatorias(alto);
      if (Laberinto[x][y] == 0) {
        Laberinto[x][y] = 5;
        i--;
      }
    }

    /* @method asigna las posiciones vacias
     * Creación de letales en posiciones aleatorias
     */
    for (int i = numLetales; i > 0;) {
      int x = coordenadasAleatorias(ancho);
      int y = coordenadasAleatorias(alto);
      if (Laberinto[x][y] == 0) {
        Laberinto[x][y] = 4;
        i--;
      }
    }
    /* @method asigna las posiciones vacias
     * Creación de muros en posiciones aleatorias
     */
    for (int i = numMuros; i > 0;) {
      int x = coordenadasAleatorias(ancho);
      int y = coordenadasAleatorias(alto);
      if (Laberinto[x][y] == 0) {
        Laberinto[x][y] = 6;
        i--;
      }
    }
    /* @method asigna las posiciones vacias
     * Creación de puntos de control en posiciones aleatorias
     */
    for (int i = numPuntosControl; i > 0;) {
      Laberinto[ancho - 1][alto - 1] = 7;
      Laberinto[ancho - 1][0] = 7;
      Laberinto[0][alto - 1] = 7;
      Laberinto[0][0] = 7;
      i--;
      /**int x=coordenadasAleatorias(ancho);
        int y= coordenadasAleatorias(alto);
        if(Laberinto[x][y]==0)
          {
                Laberinto[x][y]=6;
              i--;
          }         
          
        */
    }
  }

  /* @method controla el tamaño del laberinto
    * Creación del panel
    @return al controlador para ser usado por la GUI mensajetamaño
    */

  public String validadorTamaño() {
    String mensajeTamaño = "";
    if (
      alto > altoMin || alto <= altoMax && ancho > anchoMin || ancho <= anchoMax
    ) {
      mensajeTamaño =
        "Se va a crea un mapa de " +
        alto +
        " de alto. Por " +
        ancho +
        " de Ancho. "; // "se cumple"
    } else if (alto < altoMin || alto > altoMax) {
      mensajeTamaño = "Por favor validar que la alto sea minimo 5 maximo 5";
    } else if (ancho < altoMin || ancho > anchoMax) {
      mensajeTamaño =
        "Por favor validar que el ancho sea minimo 5 y no mayor a 20";
    }
    return mensajeTamaño;
  }

  /*
   * @author Steven Useche
   * @methods setter and getters del panel de gui y sus variables de entorno
   * @return variables: bosquecillo,carrito,alto,ancho,bestias:
   */

  public int getAlto() {
    return alto;
  }

  public void setAlto(int alto) {
    this.alto = alto;
  }

  public int getAncho() {
    return ancho;
  }

  public void setAncho(int ancho) {
    this.ancho = ancho;
  }

  public int getAltoMax() {
    return altoMax;
  }

  public void setAltoMax(int altoMax) {
    this.altoMax = altoMax;
  }

  public int getAnchoMax() {
    return anchoMax;
  }

  public void setAnchoMax(int anchoMax) {
    this.anchoMax = anchoMax;
  }

  public int getAltoMin() {
    return altoMin;
  }

  public void setAltoMin(int altoMin) {
    this.altoMin = altoMin;
  }

  public int getAnchoMin() {
    return anchoMin;
  }

  public void setAnchoMin(int anchoMin) {
    this.anchoMin = anchoMin;
  }

  public int getMaxpuntosControl() {
    return MaxpuntosControl;
  }

  public void setMaxpuntosControl(int maxpuntosControl) {
    MaxpuntosControl = maxpuntosControl;
  }

  public int getMinpuntosControl() {
    return MinpuntosControl;
  }

  public void setMinpuntosControl(int minpuntosControl) {
    MinpuntosControl = minpuntosControl;
  }

  public int getNumTormentosos() {
    return numTormentosos;
  }

  public void setNumTormentosos(int numTormentosos) {
    this.numTormentosos = numTormentosos;
  }

  public int getNumLetales() {
    return numLetales;
  }

  public void setNumLetales(int numLetales) {
    this.numLetales = numLetales;
  }

  public int getNumPuntosControl() {
    return numPuntosControl;
  }

  public void setNumPuntosControl(int numPuntosControl) {
    this.numPuntosControl = numPuntosControl;
  }

  public int getNumMuros() {
    return numMuros;
  }

  public void setNumMuros(int numMuros) {
    this.numMuros = numMuros;
  }

  public int getDificultad() {
    return dificultad;
  }

  public void setDificultad(int dificultad) {
    this.dificultad = dificultad;
  }

  public int getposBosquecilloX() {
    return posBosquecilloX;
  }

  public int getposBosquecilloY() {
    return posBosquecilloY;
  }

  public int getcantidadCasillas() {
    return cantidadCasillas;
  }

  public int[][] getLaberinto() {
    return Laberinto;
  }
}
