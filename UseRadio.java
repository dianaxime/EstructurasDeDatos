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

    private boolean state; // Encedido (TRUE) / Apagado (FALSE)

    private boolean frequency; // AM (TRUE) / FM (FALSE)

    private double[12] buttonStation; // Estaciones guardadas

    private double station; // Estacion en la que se encuentra la radio

    public void toggle () {

        if ( state==FALSE ) {
        
        	// Si el estado (state) es apagado (FALSE) modificar a encendido (TRUE)

            state = TRUE;

        } else if ( state==TRUE ) {

        	// Si el estado (state) es encendido (TRUE) modificar a apagado (FALSE)

        	state = FALSE;

        }
    }

    public boolean getState () {

    	return state; // devuelve el estado del radio
    }

    public void changeFrequency () {

        if ( frequency==FALSE ) {
        
        	// Si la frecuencia (frequency) es FM (FALSE) modificar a AM (TRUE)

            frequency = TRUE;

        } else if ( frequency==TRUE ) {

        	// Si la frecuencia (frequency) es AM (TRUE) modificar a FM (FALSE)

        	frequency = FALSE;

        }
    }

    public void changeStation (boolean up) {

    	if ( frequency==FALSE ) {
        
        	// Si la frecuencia (frequency) es FM (FALSE)

        	if ( up==TRUE) {

        		if ( station==107.9 ){

        			station = 87.9
        		} 

        		station = station + 0.2;

        	} else if ( up==FALSE ) {

        		if ( station==87.9 ){

        			station = 107.9
        		} 

        		station = station - 0.2;

        	}

        } else if ( frequency==TRUE ) {

        	// Si la frecuencia (frequency) es AM (TRUE)

        	if ( up==TRUE) {

        		if ( station==1610 ){

        			station = 530
        		} 

        		station = station + 10;

        	} else if ( up==FALSE ) {

        		if ( station==530 ){

        			station = 1610
        		} 

        		station = station - 10;

        	} 
        }
    }
}