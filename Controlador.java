/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Seccion 20
 * Hoja de Trabajo 1
 * Fecha de entrega: 30-01-2022
 * 
 * Adrian Ricardo Flores Trujillo 21500
 * Andrea Ximena Ramirez Recinos 21874
 */
public class Controlador implements Radio  {
    
    private boolean encendido = false;// Determina el estado de la radio, true (encendido) y false (apagado). 
    private boolean tipoSenal; // Determina el estado de la radio, true (AM) y false (FM). 
    private float AMactual = 530;
    private float FMactual = (float)87.9;
    private float[] emisorasGuardadas = new float[12];
    private int numBoton;
    
    /**
     * Devuelve la lista con las emisoras guardadas
     * 
     * @return las emisoras guardadas
     */
    public float[] getEmisorasGuardadas() {
        return emisorasGuardadas;
    }

    /**
     * Cambia la radio entre encendido y apagado
     * 
     * @return el estado del radio
     */
    @Override
    public boolean encenderApagar() {
            this.encendido = !this.encendido;
            return this.encendido;
    }

    /**
     * Guarda la emisora actual en el boton seleccionado
     * 
     * @param numBoton el boton donde se guardará la emisora
     * @return string describiendo la operacion
     */
    @Override
    public String guardarEmisoraActual(int numBoton) {
    if(emisorasGuardadas[numBoton] == 0){
        if(tipoSenal==true){
            emisorasGuardadas[numBoton] = AMactual;
            return ("Se guardo la emisora " + this.AMactual + "AM");
        }

        if(tipoSenal==false){
            emisorasGuardadas[numBoton] = FMactual;
            return ("Se guardo la emisora " + this.FMactual + "FM");
        }
    }
    else{
        return "Ya hay una emisora almacenada aqui";
    }
    return "";
    }
    
    /**
     * Método para seleccionar una emisora guardada
     * 
     * @param numBoton el numero de boton seleccionado
     * @return String describiendo la operacion realizada
     */
    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        if(emisorasGuardadas[numBoton] > 108){
            cambiarSenal(1);
            AMactual = emisorasGuardadas[numBoton];
            return "";
        } else {
            cambiarSenal(2);
            FMactual = emisorasGuardadas[numBoton];
            return "";
        }
    }

    /**
     * Cambia la señal entre AM y FM
     * 
     * @param opcion 1 para AM, 2 para FM
     * @return String indicando la operacion hecha
     */
    @Override
    public String cambiarSenal(boolean opcion) {
        if(opcion==true) {
            if(this.tipoSenal) {
                return("Ya se encuentra en AM");
            }

            else {
                this.tipoSenal = true;
                return("Ahora se encuentra en AM");
            }
        }

        if(opcion==false) {
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

    /**
     * Dependiendo de la señal actual, aumenta la frecuencia por el intervalo indicado
     * 
     */
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
            if(getFM() > 107.9 || getFM() < 87.8){
                FMactual = (float)87.9;
            }
        } 
        
    }

    /**
     * Dependiendo de la señal actual, reduce la frecuencia por el intervalo indicado
     * 
     */
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
            if(getFM() < 87.9){
                FMactual = (float)107.9;
            }
        } 
    }

     /**
     * Devuelve la emisora actual
     * 
     * @return la emisora actual
     */
    @Override
    public float getEmisoraActual() {
        if(tipoSenal){
            return AMactual;
        } else {
            return FMactual;
        }
    }
    
    /**
     * Verifica si la radio está encendida
     * 
     * @return true = sí, false = no
     */
    @Override
    public boolean comprobarEncendida() {
        if(this.encendido == !true) {
            return false;
        }
        return true;
    }

    /**
     * Getter del tipo de señal actual
     * 
     * @return true para AM, false para FM
     */
    public boolean getTipoSenal() {
        return tipoSenal;
    }

    /**
     * Setter para la frecuencia AM
     * 
     * @param num la frecuencia a utilizar
     */
    public void setAM(float num){
        AMactual = num;
    }

    /**
     * Setter para la frecuencia FM
     * 
     * @param num la frecuencia a utilizar
     */
    public void setFM(float num){
        FMactual = num;
    }

    /**
     * Getter de la estacion AM actual
     * 
     * @return float con la estación AM
     */
    public float getAM(){
        return AMactual;
    }

    /**
     * Getter de la estacion FM actual
     * 
     * @return float con la estación FM
     */
    public float getFM(){
        return FMactual;
    }
    
    
}
