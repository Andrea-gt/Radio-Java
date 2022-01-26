import java.util.Scanner;

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
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		System.out.println("\nPor favor, escoje una de las opciones");

		System.out.println("1. Prender el radio");
		System.out.println("2. Cambiar de AM a FM a AM");
		System.out.println("3. Avanzar en el dial");
		System.out.println("4. Guardar emisora");
		System.out.println("5. Seleccionar Emisora");
		System.out.println("6. Apagar el radio");

		int opcion = sn.nextInt();
		sn.nextLine();

		switch(opcion){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:

	}

}
}
