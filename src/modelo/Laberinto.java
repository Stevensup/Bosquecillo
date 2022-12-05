package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Laberinto {
  
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
  //arreglo que deriva del resultado de cantidadCasillas
  int[][] Laberinto = new int[alto][ancho];

  //Constructor
  //   @Laberinto
  public Laberinto(int palto, int pAncho, String pDificultad) {
    alto = palto;
    ancho = pAncho;
    Laberinto = new int[ancho][alto];
    //mide la cantidad de tormentosos por dificultad facil
    dificultad = (pDificultad.equals("facil")) ? 2 : 5;
    numTormentosos = cantidadCasillas * dificultad / 100;
    numMuros = cantidadCasillas * dificultad / 50;
    numLetales = cantidadCasillas * dificultad / 100;
    numPuntosControl = (((MaxpuntosControl * cantidadCasillas) / (altoMax*anchoMax))<2)?2:(MaxpuntosControl * cantidadCasillas) / (altoMax*anchoMax);
  }

  public int coordenadasAleatorias(int pLimite)
  {
      int rand= (int) Math.random()*pLimite-1;
      if(rand<0)
        rand=0;
      return rand;
  }     

  //Validador cantidadCasillas
  public void IncializadorLaberinto()
  {
      //Posición inicial Bosquecillo
      posBosquecilloX=coordenadasAleatorias(ancho);
      posBosquecilloY=coordenadasAleatorias(alto);

      for (int i = 0; i < Laberinto.length; i++) 
      {
          for (int j = 0; j < Laberinto[0].length; j++) 
          {
            Laberinto[i][j]=0;  
          }  
      }
       //Posición inicial Bosquecillo
      Laberinto[posBosquecilloX][posBosquecilloY]=1;
      //Posición inicial carro
      Laberinto[posBosquecilloX+1][posBosquecilloY]=2;
      //Laberinto con ceros
    // Creación de Tormentosos
    for (int i = numTormentosos; i > 0;) 
    {
        int x=coordenadasAleatorias(ancho);
        int y= coordenadasAleatorias(alto);
        if(Laberinto[x][y]==0)
          {
              Laberinto[x][y]=5;
              i--;
          }
    }
     
    // Creación de Letal
    for (int i = numLetales; i > 0;) 
    {
        int x=coordenadasAleatorias(ancho);
        int y= coordenadasAleatorias(alto);
        if(Laberinto[x][y]==0)
          {
              Laberinto[x][y]=4;
              i--;
          }
    }
    // Creación de Muros
    for (int i = numMuros; i > 0;) 
    {
        int x=coordenadasAleatorias(ancho);
        int y= coordenadasAleatorias(alto);
        if(Laberinto[x][y]==0)
          {
              Laberinto[x][y]=6;
              i--;
          }
    }
    // Creación de puntos de control
     
    for (int i = numPuntosControl; i > 0;) 
    {
        Laberinto[ancho-1][alto-1]=7;
        Laberinto[ancho-1][0]=7;
        Laberinto[0][alto-1]=7;
        Laberinto[0][0]=7;
        i--;
        /**int x=coordenadasAleatorias(ancho);
        int y= coordenadasAleatorias(alto);
        if(Laberinto[x][y]==0)
          {
                Laberinto[x][y]=6;
              i--;
          }         
          
        */}
}

  public String validadorTamaño() {
    String mensajeTamaño = "";
    if (
      alto > altoMin ||
      alto <= altoMax &&
      ancho > anchoMin ||
      ancho <= anchoMax
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
  public int [][] getLaberinto() {
		return Laberinto;
	}
}
