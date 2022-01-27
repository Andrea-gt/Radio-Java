
public class controlador implements Radio  {
    private boolean encendido =false;// Determina el estado de la radio, true (encendido) y false (apagado). 
    private boolean tipoSenal; // Determina el estado de la radio, true (AM) y false (FM). 
    private float AMactual;
    private float FMactual;
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
            if(this.tipoSenal == false) {
                return("Ya se encuentra en AM");
            }

            else {
                this.tipoSenal = false;
                return("Ahora se encuentra en AM");
            }
        }

        if(opcion==2) {
            if(this.tipoSenal == true) {
                return("Ya se encuentra en FM");
            }

            else {
                this.tipoSenal = true;
                return("Ahora se encuentra en FM");
            }
        }
        return "";
    }
    @Override
    public void subirEmisora() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void bajarEmisora() {
        // TODO Auto-generated method stub
        
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
    
    
    }