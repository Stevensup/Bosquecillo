package modelo;

import java.util.Scanner;
import modelo.Laberinto;

public class Carrito {

  int ubicacionXCarrito;
  int ubicacionYCarrito;
  int PasosIniciales;
  int PasosUsados;
  int PasosPendientes;
  int identificador = 2;
  int contadorObjetivos;

  public Carrito(
    int pubicacionXCarrito,
    int pubicacionYCarrito,
    int pPasosIniciales,
    int pPasosUsados,
    int pPasosPendientes
  ) {
    ubicacionXCarrito = pubicacionXCarrito;
    ubicacionYCarrito = pubicacionYCarrito;
    PasosIniciales = pPasosIniciales;
    PasosUsados = pPasosUsados;
    PasosPendientes = pPasosPendientes;
  }


  public void setUbicacionXCarrito(int ubicacionXCarrito) {
    this.ubicacionXCarrito = ubicacionXCarrito;
  }

  public int getUbicacionYCarrito() {
    return ubicacionYCarrito;
  }

  public void setUbicacionYCarrito(int ubicacionYCarrito) {
    this.ubicacionYCarrito = ubicacionYCarrito;
  }

  public int getPasosIniciales(int Altura, int Ancho) {
    return Altura * Ancho;
  }

  public void setPasosIniciales(int pasosIniciales) {
    PasosIniciales = pasosIniciales;
  }

  public int getPasosUsados() {
    return PasosUsados;
  }

  public void setPasosUsados(int pasosUsados) {
    PasosUsados = pasosUsados;
  }

  public int getPasosPendientes(int pasosIniciales, int pasosUsados) {
    return pasosIniciales - pasosUsados;
  }

  public void setPasosPendientes(int pasosPendientes) {
    PasosPendientes = pasosPendientes;
  }

  public int getContadorObjetivos() {
    return contadorObjetivos;
  }

  public void setContadorObjetivos(int contadorObjetivos) {
    this.contadorObjetivos = contadorObjetivos;
  }
}
/**
 * Methods
 * @tbd
 */
