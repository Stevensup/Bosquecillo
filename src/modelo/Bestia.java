package modelo;

public class Bestia {
    private int Pasos;
    private int UbicacionX;
    private int UbicacionY;
    private int Identificador;
    private int Habilidad1, Habilidad2 , Habilidad3;	

    public void Bestia_Asesino(int pUbicacionX,int pUbicacionY){
        UbicacionX = pUbicacionX;
        UbicacionY = pUbicacionY;
        Identificador = 3;

    }

    public void Bestia_Tormentosa(int pUbicacionX,int pUbicacionY){
        UbicacionX = pUbicacionX;
        UbicacionY = pUbicacionY;
        int Identificador = 4;

    }
}
