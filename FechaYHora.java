
/**
 * En este programa se mostrará la fecha y la hora. Recoge las funciones de CalendarioBasico y de ClockDisplay para unirlo en un solo 
 * programa
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // Indica el tipo que viene de la clase CalendarioBasico y el atributo fecha.
    private CalendarioBasico fecha;
    // Indica el tipo que viene de la clase ClockDisplay y el atributo hora.   
    private ClockDisplay hora;

    /**
     * El constructor de la clase no tiene parámetros e iniciará el programa en 1 de enero de 2001 a las 00:00.
     */
    public FechaYHora()
    {
        fecha = new CalendarioBasico();
        hora = new ClockDisplay();        
    }

    /**
     * Devuelve la fecha y la hora en el siguiente formato "dd/mm/aa 00:00"
     */
    public String getFechaYHora()
    {
        return fecha.obtenerFecha() + " " + hora.getTime();
    }
    
    /**
     * Permite avanzar la hora en un minuto, permite avanzar fecha cuando 
     * toque.
     */
    public void avanzar()
    {
        hora.timeTick();
        if (hora.getTime().equals("00:00")){
            fecha.avanzarFecha();
        }            
    }
    
    /**
     * Permite fijar una fecha y una hora.
     */
    public void fijarFechaYHora(int dias, int meses, int ano, int horas, int min)
    {
        hora.setTime(horas, min);
        fecha.fijarFecha(dias, meses, ano);
    }
}
