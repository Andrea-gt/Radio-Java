import java.util.Scanner;

class Vista{
	private Scanner scan = new Scanner(System.in);

	/**
	 * Método para mostrar el menu del radio apagado
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
					if(num > 509 && num < 1611){
						if(num % 10 == 0){
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
					int num = scan.nextInt();
					if(num >= 87.9 && num <= 107.9){
						if(num % 0.2 == 0.1){
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
	public void mostrarEstado(/*????*/){
		//TODO
	}

	/**
	 * Método para mostrar los botones guardados
	 * 
	 * @param lista la lista de botones guardados
	 * @return el indice donde se encuentra la eleccion del usuario
	 */
	public int mostrarGuardados(float[] lista){
		System.out.println(); 
		for(int i = 0; i<lista.length ; i++){
			if(lista[i] > 80){
				System.out.println((i+1) + ". " + lista[i] + ((lista[i] > 108)?" AM":" FM")); 
			} else{
				System.out.println((i+1) + ". Vacio"); 
			}
				
		}
		while(true){
			try{
				while(true){
					int num = scan.nextInt();
					if(num > 0 && num <= lista.length){
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