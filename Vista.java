import java.io.Scanner;

class Vista{
	private Scanner scan = new Scanner(System.in);

	/**
	 * Método para mostrar el menu principal
	 * 
	 * @return la opcion del usuario
	 */
	public int menu(){
		System.out.println("\n-----------------MENU-----------------");
		System.out.println("1. Prender el radio");
		System.out.println("2. Cambiar de AM a FM a AM");
		System.out.println("3. Avanzar en el dial");
		System.out.println("4. Guardar emisora");
		System.out.println("5. Seleccionar Emisora");
		System.out.println("6. Apagar el radio");
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
}