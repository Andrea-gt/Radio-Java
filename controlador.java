
public class Controlador implements Radio  {
    private boolean encendido = false;// Determina el estado de la radio, true (encendido) y false (apagado). 
    private boolean tipoSenal; // Determina el estado de la radio, true (AM) y false (FM). 
    private float AMactual = 530;
    private float FMactual = (float)87.9;
    private float[] emisorasGuardadas = new float[12];
    private int numBoton;
    
    @Override
    public boolean encenderApagar() {
            this.encendido = !this.encendido;
            return this.encendido;
    }
    @Override
    public String guardarEmisoraActual(int numBoton) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String cambiarSenal(int opcion) {
        if(opcion==1) {
            if(this.tipoSenal) {
                return("Ya se encuentra en AM");
            }

            else {
                this.tipoSenal = true;
                return("Ahora se encuentra en AM");
            }
        }

        if(opcion==2) {
            if(!this.tipoSenal) {
                return("Ya se encuentra en FM");
            }

            else {
                this.tipoSenal = false;
                return("Ahora se encuentra en FM");
            }
        }
        return "";
    }
    @Override
    public void subirEmisora() {
        if(tipoSenal){ // Si es AM
            if(AMactual != 1610){
                AMactual += 10;
            } else {
                AMactual = 530;
            }
        } else { // Si es FM
            FMactual += 0.2;
            if(FMactual > 107.9){
                FMactual = (float)87.9;
            }
        } 
        
    }
    @Override
    public void bajarEmisora() {
        if(tipoSenal){ // Si es AM
            if(AMactual != 530){
                AMactual -= 10;
            } else {
                AMactual = 1610;
            }
        } else { // Si es FM
            FMactual -= 0.2;
            if(FMactual < 87.9){
                FMactual = (float)107.9;
            }
        } 
    }

    @Override
    public float getEmisoraActual() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public boolean comprobarEncendida() {
        if(this.encendido == !true) {
            return false;
        }
        return true;
    }

    public boolean getTipoSenal() {
        return tipoSenal;
    }

    public void setAM(float num){
        AMactual = num;
    }

    public void setFM(float num){
        FMactual = num;
    }

    public float getAM(){
        return AMactual;
    }

    public float getFM(){
        return FMactual;
    }
    
    
    }