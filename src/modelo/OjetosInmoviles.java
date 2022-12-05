package modelo;
public class OjetosInmoviles {
    int ubicacionXmuro;
    int ubicacionYmuro;
    int ubicacionXpuntosControl;
    int ubicacionYpuntosControl;
    int identificadorM=6;
    int identificadorPC=7;
	int pUbicacionXpuntosControl;
	int pUbicacionXmuro;
	int pUbicacionYpuntosControl;
	int pUbicacionYmuro;    
    
    public void Muros(int pUbicacionXmuro, int pUbicacionYmuro) {
    	ubicacionXmuro = pUbicacionXmuro;
    	ubicacionYmuro = pUbicacionYmuro;
    }
    
    public void PuntosControl(int pUbicacionXpuntosControl, int pUbicacionYpuntosControl) {
    	ubicacionXpuntosControl = pUbicacionXpuntosControl;
    	ubicacionYpuntosControl =pUbicacionYpuntosControl;
    }
    
    public void setUbicacionPuntosControl(int pUbicacionXpuntosControl, int pUbicacionYpuntosControl) {
    	this.pUbicacionXpuntosControl = pUbicacionXpuntosControl;
    	this.pUbicacionYpuntosControl = pUbicacionYpuntosControl;
    }
    
    public int getUbicacionXpuntosControl() {
    	return pUbicacionXpuntosControl;
    }
    
    public int getUbicacionYpuntosControl() {
    	return pUbicacionYpuntosControl;
    }
    
    public void setUbicacionMuro (int pUbicacionXmuro, int pUbicacionYmuro) {
    	this.pUbicacionXmuro = pUbicacionXmuro;
    	this.pUbicacionYmuro = pUbicacionYmuro;
    }
    
    public int getUbicacionXmuro() {
    	return pUbicacionXmuro;
    }
    
    public int getUbicacionYmuro() {
    	return pUbicacionYmuro;
    }
}