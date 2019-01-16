/* Radio Interface

 * Hoja de Trabajo 1 de Algoritmos y Estructuras de Datos

 * Define las funciones principales para el 
  
   funcionamiento del radio de un automovil

 * 15 de enero de 2019

 * @autor:

    Diana Ximena de Leon Figueroa 18607

    Fatima Jazmin Albeño Barrios 18060

*/

public interface Radio{
    
    public void toggle (); // Encender / Apagar

    public boolean getState (); /* Obtener si

    el radio esta encendido o apagado */

    public void changeFrequency (); /* Modificar

    de AM a FM y viceversa */

    public void saveStation (int numButton); /*

    Guardar la estacion en la que se encuentra */

    public void changeStation (boolean up); /*

    Cambiar numero de estacion */

    public boolean getFrequency (); /* Determinar

    si es AM o FM */

    public void changeStationButton (int numButton); /*

    Activar una estacion guardada */

    public double getStation (); /* Obtener la 

    estacion en la que se encuentra */
}
