public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controlador controlador = new Controlador();
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
					controlador.encenderApagar();
					if(controlador.comprobarEncendida()){
						System.out.println("La radio ya se encuentra encendida");
					}
					while(menu != 5){
						
						v.mostrarEstado(controlador);

						menu = v.menuEncendido();
						switch(menu){

							case 1: 
								int opcion = v.cambiarEmisora();
								System.out.println(controlador.cambiarSenal(opcion));
								break;

							case 2: //Avanzar el dial
								switch(v.getOpcionDial(controlador.getTipoSenal())){

									case 1:
										controlador.subirEmisora();
										break;

									case 2:
										controlador.bajarEmisora();
										break;

									case 3:
										if(controlador.getTipoSenal()){
											controlador.setAM(v.getAM());
										} else {
											controlador.setFM(v.getFM());
										}
								}
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
								controlador.encenderApagar();
								if(controlador.comprobarEncendida()==false){
									System.out.println("La radio se ha apagado");
								}	
								break;
								
						}

				}	

				case 2: //Salir
					System.exit(0);
			}
		}
	}
}
		
	
