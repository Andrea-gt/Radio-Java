import javax.management.ObjectName;

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
public class main {
	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Controlador controlador = new Controlador();
		Vista v = new Vista();
		int menu = 0;
	
		while(true){
			switch(v.menuApagado()){

				case 1: //Encender
					menu = 0;
					controlador.encenderApagar();
					System.out.println("La radio ya se encuentra encendida");
					controlador.comprobarEncendida();
						
					
					while(menu != 5){
						
						v.mostrarEstado(controlador.getEmisoraActual());

						menu = v.menuEncendido();
						switch(menu){

							case 1: 
								boolean opcion = v.cambiarEmisora();
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

								}
								break;

							case 3: //Guardar emisora
								controlador.getEmisoraActual();
								int numBoton = v.guardardadoDeEmisora();
								System.out.println(controlador.guardarEmisoraActual(numBoton));
								break;

							case 4: //Seleccionar emisora 
								controlador.getEmisoraActual();
								int opcionEmisora = v.escogerEmisora();
								System.out.println(controlador.seleccionarEmisoraGuardada(opcionEmisora));
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