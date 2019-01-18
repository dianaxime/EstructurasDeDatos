/* Clase MyRadio

 * Hoja de Trabajo 1 de Algoritmos y Estructuras de Datos

 * Utilizacion de mi radio de un automovil

 * 16 de enero de 2019

 * @autor:

    Diana Ximena de Leon Figueroa 18607

    Fatima Jazmin Albeño Barrios 18060

*/

import java.util.Scanner; //Importar el scanner de java de la libreria

import java.text.DecimalFormat; // Importa el modificador de texto

import java.text.NumberFormat; // Importa el modificador de texto

public class MyRadio  {

	private static String toString(Radio radio){

		String infoRadio; // Guarda los datos actuales del Radio

		NumberFormat formato; // Formato de las emisoras

        formato = new DecimalFormat("#0.0");

        infoRadio = "---------------------------------\n";

        infoRadio += "Radio:"  + ((radio.getState() ? "ON" : "OFF")) + "\n";

        infoRadio +="Frecuencia: " + (( radio.getFrequency() ? "FM" : "AM")) + "\n";

        infoRadio +="Emisora actual: " + formato.format(radio.getStation()) + "\n"; 

        infoRadio += "---------------------------------\n";

        return infoRadio;
    }

    private static String buttons(UseRadio radio){

    	String emisoras;

    	emisoras="";

    	for (int i=0; i<radio.buttonStation.length; i++){

    		if (radio.buttonStation[i]==0.0){

    			emisoras+="| 0.0 ";
    		}
    		else{

    			emisoras+="| "+ radio.buttonStation[i];
    		}
    	}
    	return emisoras;
    }

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

			System.out.println(toString(radio));
			System.out.println(buttons(radio));

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