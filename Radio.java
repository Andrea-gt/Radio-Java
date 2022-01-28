
public interface Radio {

	/**
     * Cambia la radio entre encendido y apagado
     * 
     * @return el estado del radio
     */
	boolean encenderApagar();

	/**
     * Guarda la emisora actual en el boton seleccionado
     * 
     * @param numBoton el boton donde se guardará la emisora
     * @return string describiendo la operacion
     */
	String guardarEmisoraActual(int numBoton);

	/**
     * Método para seleccionar una emisora guardada
     * 
     * @param numBoton el numero de boton seleccionado
     * @return String describiendo la operacion realizada
     */
	String seleccionarEmisoraGuardada(int numBoton);

	/**
     * Cambia la señal entre AM y FM
     * 
     * @param opcion 1 para AM, 2 para FM
     * @return String indicando la operacion hecha
     */
	String cambiarSenal(int opcion);

	/**
     * Dependiendo de la señal actual, aumenta la frecuencia por el intervalo indicado
     * 
     */
	void subirEmisora();

	/**
     * Dependiendo de la señal actual, reduce la frecuencia por el intervalo indicado
     * 
     */
	void bajarEmisora();

	/**
     * Devuelve la emisora actual
     * 
     * @return la emisora actual
     */
	float getEmisoraActual();

	/**
     * Verifica si la radio está encendida
     * 
     * @return true = sí, false = no
     */
	boolean comprobarEncendida();
}
