public class main {

	private boolean encendido;// Determina el estado de la radio, true (encendido) y false (apagado). 
	private boolean tipoSenal; // Determina el estado de la radio, true (AM) y false (FM). 
	private float AMactual;
	private float FMactual;
	private float[] emisorasGuardadas = new float[12];
	private int numBoton;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vista v = new Vista();
		int menu = 0;
		
		while(true){
			switch(v.menuApagado()){

				case 1: //Encender
					menu = 0;
					while(menu != 5){
						menu = v.menuEncendido();
						switch(menu){

							case 1: //Cambiar entre FM y AM
								break;

							case 2: //Avanzar el dial
								break;

							case 3: //Guardar emisora
								break;

							case 4: //Seleccionar emisora
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