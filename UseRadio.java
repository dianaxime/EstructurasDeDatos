/* Clase UseRadio

 * Hoja de Trabajo 1 de Algoritmos y Estructuras de Datos

 * Utilizacion de las funciones principales para el 
  
   funcionamiento del radio de un automovil

 * 15 de enero de 2019

 * @autor:

    Diana Ximena de Leon Figueroa 18607

    Fatima Jazmin Albeño Barrios 18060

*/

public class UseRadio implements Radio{

    private boolean state; // Encedido (true) / Apagado (false)

    private boolean frequency; // AM (true) / FM (false)

    private double[] buttonStation; // Estaciones guardadas

    private double station; // Estacion en la que se encuentra la radio

    public UseRadio () {

    	buttonStation = new double[12]; // Crea los botones para guardar emisoras

    	state = false; // Inicia con la radio apagada 

    	frequency = true; // Inicia en AM

    	station = 530; // Inicia en la menor emisora de AM

    }

    public void toggle () {

        if ( state==false ) {
        
        	// Si el estado (state) es apagado (false) modificar a encendido (true)

            state = true;

        } else if ( state==true ) {

        	// Si el estado (state) es encendido (true) modificar a apagado (false)

        	state = false;

        }
    }

    public boolean getState () {

    	return state; // devuelve el estado del radio
    }

    public void changeFrequency () {

        if ( frequency==false ) {
        
        	// Si la frecuencia (frequency) es FM (false) modificar a AM (true)

            frequency = true;

            station = 530;

        } else if ( frequency==true ) {

        	// Si la frecuencia (frequency) es AM (true) modificar a FM (false)

        	frequency = false;

        	station = 87.9;

        }
    }

    public void changeStation ( boolean up ) {

    	if ( frequency==false ) {
        
        	// Si la frecuencia (frequency) es FM (false)

        	if ( up==true) {

        		// Si la opcion es subir de emisora 

        		if ( station==107.9 ){

        			//cuando llega al rango mas alto vuelve al comienzo

        			station = 87.9;
        		} 

        		station = station + 0.2; // Suma para llegar a la siguiente emisora

        	} else if ( up==false ) {

        		// Si la opcion es regresar a una emisora

        		if ( station==87.9 ){

        			// Al llegar al limite mas bajo vuelve al final

        			station = 107.9;
        		} 

        		station = station - 0.2; // Resta para encontrar la emisora previa

        	}

        } else if ( frequency==true ) {

        	// Si la frecuencia (frequency) es AM (true)

        	if ( up==true) {

        		// Si la opcion es subir de emisora 

        		if ( station==1610 ){

        			//cuando llega al final de las emisoras vuelve a comenzar

        			station = 530;
        		} 

        		station = station + 10; // Suma para llegar a la siguiente emisora

        	} else if ( up==false ) {

        		// Si la opcion es regresar a una emisora

        		if ( station==530 ){

        			// Cuando llega a la primera emisora regresa al final

        			station = 1610;
        		} 

        		station = station - 10; // Resta para encontrar la emisora previa

        	} 
        }
    }

    public boolean getFrequency () {

    	return frequency; // Devuelve en que frecuencia se encuentra
    }

    public double getStation () {

    	return station; // Devuelve la estacion actual
    }

    public void saveStation ( int numButton ) {

    	numButton--; /* Resta uno para que sea equivalente 

    	a los indices del array */

    	for ( int i = 0; i < buttonStation.length; i++) {

    		/* Recorre el array y cuando encuentra el boton indicado por el 

    		usuario almacena en el la estacion actual */

    		if ( i==numButton ) {

    			buttonStation[i] = getStation();
    		}
    	}
    }

    public void changeStationButton ( int numButton ) {

    	numButton--; /* Resta uno para que sea equivalente 

    	a los indices del array */

    	for ( int i = 0; i < buttonStation.length; i++) {

    		/* Recorre el array y cuando encuentra el boton indicado por el 

    		usuario cambia al valor de la emisora almacenado */

    		if ( i==numButton ) {

    			station = buttonStation[i];

    			if ( ( station>=87.9 ) && ( station<=107.9 ) && ( frequency==true ) ) {

    				/* Si la emisora se encuentra en el rango de FM y la frecuencia es AM

    				modifica la frecuencia */

    				changeFrequency();

    			} else if ( ( station>=530 ) && ( station<=1610 ) && ( frequency==false ) ) {

    				/* Si la emisora se encuentra en el rango de AM y la frecuencia es FM

    				modifica la frecuencia */

    				changeFrequency();
    				
    			}
    		}
    	}
    }
}