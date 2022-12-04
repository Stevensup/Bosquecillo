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

private Tuple getValAleaNotInSnake(){
    Tuple p ;
    int ranX= 0 + (int)(Math.random()*19); 
    int ranY= 0 + (int)(Math.random()*19); 
    p=new Tuple(ranX,ranY);
    for(int i = 0;i<=positions.size()-1;i++){
        if(p.getY()==positions.get(i).getX() && p.getX()==positions.get(i).getY()){
            ranX= 0 + (int)(Math.random()*19); 
            ranY= 0 + (int)(Math.random()*19); 
            p=new Tuple(ranX,ranY);
            i=0;
        }
    }
    return p;
}