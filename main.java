public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vista v = new Vista();
		int menu = 0;

		boolean encendido;// Determina el estado de la radio, true (encendido) y false (apagado). 
		boolean tipoSenal; // Determina el estado de la radio, true (AM) y false (FM). 
		float AMactual;
		float FMactual;
		float[] emisorasGuardadas = new float[12];
		int numBoton;		
		
		while(true){
			switch(v.menuApagado()){

				case 1: //Encender
					menu = 0;
					while(menu != 5){

						//mostrar aquí lo de v.mostrarEstado() maybe???

						menu = v.menuEncendido();
						switch(menu){

							case 1: //Cambiar entre FM y AM
								break;

							case 2: //Avanzar el dial
								break;

							case 3: //Guardar emisora
								v.mostrarGuardados(new float[]{(float)12.5, 800, 100, (float)310.7, 0, 0}); //array de prueba :)
								//Se pide en qué posicion guardar la emisora y se le pasa a un método que la asigne a la posicion seleccionada (?)
								break;

							case 4: //Seleccionar emisora 
								v.mostrarGuardados(new float[]{(float)12.5, 800, 100, (float)310.7, 0, 0}); 
								//Se selecciona la emisora  y se pasa la posicion del array seleccionado a un método que asigne la emisora actual a la que se saque del array (?)
								break;

							case 5: //Apagar
								break;
						}
					}
					break;

				case 2: //Salir
					System.exit(0);
			}
		}
	}
}