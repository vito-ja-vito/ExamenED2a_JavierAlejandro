package examen;
/**
 * 
 * @author daw101
 * @version 2023/02/22
 *
 */
public class Fecha {
	/**
	 * Es un atributo público inicializado en el método validarFecha que será o true o false en función de lo que devuelva este método
	 */
	public static boolean fechaValida;
	
/**
 * Método que analizará si los parámetros introducidos, forman una fecha valida
 * @param anio, indica el año que se ha introducido
 * @param mes, indica el mes que se ha introducido
 * @param dia, indica el dia que se ha introducido
 * @return return fechaValida, dará un valor true o false en función de los datos introducidos
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
} 