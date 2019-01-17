/* Clase MyRadio

 * Hoja de Trabajo 1 de Algoritmos y Estructuras de Datos

 * Utilizacion de mi radio de un automovil

 * 16 de enero de 2019

 * @autor:

    Diana Ximena de Leon Figueroa 18607

    Fatima Jazmin Albeño Barrios 18060

*/

import java.util.Scanner; //Importar el scanner de java de la libreria

public class MyRadio () {

	public static void main(String[] args) {

		Scanner scan;

		scan = new Scanner(System.in);

		UseRadio radio;

		radio = new UseRadio();

		int opcion;

		opcion = 0;

		while ( opcion=!7 ) {

			System.out.println( "---------------------------------------" );
			System.out.println( "| 1. Encender el radio                |" );
			System.out.println( "| 2. Cambiar de AM a FM y viceversa   |" );
			System.out.println( "| 3. Cambiar de emisora               |" );
			System.out.println( "| 4. Guardar una emisora              |" );
			System.out.println( "| 5. Seleccionar una emisora guardada |" );
			System.out.println( "| 6. Apagar el radio                  |" );
			System.out.println( "| 7. Salir                            |" );
			System.out.println( "---------------------------------------" );

			opcion = scan.nextInt();

			switch ( opcion ) {

				case 1:

				break;

				case 2:

				break;

				case 3:

				break;

				case 4:

				break;

				case 5:

				break;

				case 6:

				break;

			}
		}
		
	}
}