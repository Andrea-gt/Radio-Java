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
import java.util.Scanner;

class Vista{

	private Scanner scan = new Scanner(System.in);

	/**
	 * Método para mostra1r el menu del radio apagado
	 * 
	 * @return la opcion del usuario
	 */
	public int menuApagado(){
		System.out.println("\nLa radio esta apagada. Ingrese una opcion:");
		System.out.println("1. Prender el radio");
		System.out.println("2. Salir");
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 3){
						return num;
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}


	/**
	 * Método para mostrar el menu principal
	 * 
	 * @return la opcion del usuario
	 */
	public int menuEncendido(){
		System.out.println("\n-----------------MENU-----------------");
		System.out.println("1. Cambiar de AM a FM a AM");
		System.out.println("2. Avanzar en el dial");
		System.out.println("3. Guardar emisora");
		System.out.println("4. Seleccionar Emisora");
		System.out.println("5. Apagar el radio");
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 7){
						return num;
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	/**
	 * Para cambiar el tipo de emisora
	 * @return entero entre 1 y 2
	 */
	public boolean cambiarEmisora(){
		System.out.println("Selecione una opcion");
		System.out.println("1. Cambiar a AM");
		System.out.println("2. Cambiar a FM");

		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 3){
						if(num==1){
							return true;
						}
						if(num == 2){
							return false;
						}
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	/**
	 * Pide el ingreso de una frecuencia AM
	 * 
	 * @return entero de 530 a 1610 en intervalos de 10
	 */
	public float getAM(){
		System.out.println("Ingrese una frecuencia AM (de 530 a 1610 en intervalos de 10): ");
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 509 && num < 1611){ //Se revisa que esté dentro del intervalo indicado
						if(num % 10 == 0){ //Revisa si la entrada es valida
							return num;
						}
						else{
							System.out.println("Ingrese una frecuencia valida");
						}
					} else{
						System.out.println("Ingrese una frecuencia valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	/**
	 * Pide el ingreso de una frecuencia FM
	 * 
	 * @return numero de 87.9 a 107.9 en intervalos de 0.2
	 */
	public float getFM(){
		System.out.println("Ingrese una frecuencia FM (de 87.9 a 107.9 en intervalos de 0.2): ");
		while(true){
			try{
				while(true){
					float num = scan.nextFloat();
					if(num >= 87.9 && num <= 107.9){ //Se revisa que esté dentro del intervalo indicado
						if(num % 0.2 > 0.09 && num % 0.2 < 0.11){ //Revisa si la entrada es valida
							return num;
						}
						else{
							System.out.println("Ingrese una frecuencia valida");
						}
					} else{
						System.out.println("Ingrese una frecuencia valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	/** 
	 * es pura vanidad(?) para mostrar el tipo de frecuencia y la frecuencia cada vez que se repita el ciclo del menú inicial
	 * algo así se me ocurre: 
	 * Estación actual: 97.7 FM
	 * 
	 * @param c el objeto del que se van a sacar los datos (o se los pasamos de manera explicita?)
	 */
	public void mostrarEstado(float frec){
		if(frec != 0){
			System.out.println("\nEmisora Actual: " + frec + ((frec>108)?"AM":"FM"));
		}
		else{
			System.out.println("No hay ninguna emisora seleccionada por el momento");
		}
	}

	/**
	 * Para cambiar el tipo de emisora
	 * 
	 * @param cond si es AM (true) o FM (false)
	 * @return entero entre 1 y 3
	 */
	public int getOpcionDial(boolean cond){

		System.out.println("Selecione una opcion (" + ((cond)?"AM)":"FM)"));
		System.out.println("1. Subir Dial");
		System.out.println("2. Bajar Dial");
		System.out.println("3. Ingresar frecuencia manualmente");

		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 4){
						return num;
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	/**
	 * Pide una entrada de 1-12 y la devuelve respecto a la posicion en el array
	 * 
	 * @return la entrada seleccionada
	 */
	public int guardardadoDeEmisora(){
		System.out.println("Porfavor seleccione un espacio del 1 al 12: ");
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 13){
						return num-1;
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}

	public int escogerEmisora(){
		System.out.println("Porfavor seleccione una de las emisoras almacenadas");
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num < 13){
						return num-1;
					} else{
						System.out.println("Ingrese una opcion valida");
					}
				}
			} catch(Exception e){
				System.out.println("Ingrese un numero");
				scan.next();
			}
		}
	}
}