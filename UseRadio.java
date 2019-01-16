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

    	buttonStation = new double[12];

    	state = false;

    	frequency = true;

    	station = 87.9;

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

        		if ( station==107.9 ){

        			station = 87.9;
        		} 

        		station = station + 0.2;

        	} else if ( up==false ) {

        		if ( station==87.9 ){

        			station = 107.9;
        		} 

        		station = station - 0.2;

        	}

        } else if ( frequency==true ) {

        	// Si la frecuencia (frequency) es AM (true)

        	if ( up==true) {

        		if ( station==1610 ){

        			station = 530;
        		} 

        		station = station + 10;

        	} else if ( up==false ) {

        		if ( station==530 ){

        			station = 1610;
        		} 

        		station = station - 10;

        	} 
        }
    }

    public boolean getFrequency () {

    	return frequency;
    }

    public double getStation () {

    	return station;
    }

    public void saveStation ( int numButton ) {

    	numButton--;

    	for ( int i = 0; i < buttonStation.length; i++) {

    		if ( i==numButton ) {

    			buttonStation[i] = getStation();
    		}
    	}
    }

    public void changeStationButton ( int numButton ) {

    	numButton--;

    	for ( int i = 0; i < buttonStation.length; i++) {

    		if ( i==numButton ) {

    			station = buttonStation[i];
    		}
    	}
    }
}