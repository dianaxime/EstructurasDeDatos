/* Clase MyRadio

 * Hoja de Trabajo 1 de Algoritmos y Estructuras de Datos

 * Utilizacion de mi radio de un automovil

 * 16 de enero de 2019

 * @autor:

    Diana Ximena de Leon Figueroa 18607

    Fatima Jazmin Albeño Barrios 18060

*/

import java.util.Scanner; //Importar el scanner de java de la libreria

public class MyRadio  {

	public static void main(String[] args) {

		Scanner scan;

		scan = new Scanner(System.in); /* lectura de la informacion proporcionada

		por el usuario */

		UseRadio radio;

		radio = new UseRadio(); //instancia de la clase UseRadio

		int opcion; // recibe los valores introducidos por el usuario

		opcion = 0; 

		int button; // recibe el numero de boton que el usuario desee para su emisora

		int updown; // recibe si el usuario desea subir / bajar de emisora

		while ( opcion!=7 ) {

			/* Mientras la decision del usuario sea distinta a salir le permitira

			realizar cualesquiera de las siguientes opciones: */

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

				radio.toggle(); // Enciende el radio

				break;

				case 2:

				radio.changeFrequency(); //Cambia de frecuencia AM / FM

				break;

				case 3:

				System.out.println("1. Siguiente emisora");
				System.out.println("2. Anterior emisora");

				updown = scan.nextInt();

				switch ( updown ) {

					case 1:

					radio.changeStation(true); 

					// Avanza a la emisora siguiente

					break;

					case 2: 

					radio.changeStation(false);

					// Vuelve a la emisora previa

					break;

				}

				break;

				case 4:

				System.out.println("¿Que boton desea seleccionar (del 1 al 12) ?");

				button = scan.nextInt();

				radio.saveStation(button);

				// Guarda la estacion actual en el boton seleccionado 

				break;

				case 5:

				System.out.println("¿Que boton desea seleccionar (del 1 al 12) ?");

				button = scan.nextInt();

				radio.changeStationButton(button);

				// Cambia de la estacion actual a la que se encuentra guardada en el boton

				break;

				case 6:

				radio.toggle(); // Apaga el radio

				break;

			}
		}
		
	}
}