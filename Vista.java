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
	public int getAM(){
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


}