package com.arsoft.santesys.utilidades;

public class Utilidades {

	/**
	 * metodo que analiza sin un valor es vacio.
	 * @param cadena
	 * @return
	 */
	public static boolean isEmptyString(String cadena) 
	{
		if(cadena==null||cadena.trim().equalsIgnoreCase("null")||cadena.trim().equals(""))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param cadena
	 * @param tomarMenosUnoComoVacio, si el valor true indica que el -1 cuenta como vacio
	 * @return
	 */
	public static boolean isEmptyString(String cadena,boolean tomarMenosUnoComoVacio) 
	{
		if(cadena==null||cadena.trim().equalsIgnoreCase("null")||cadena.trim().equals("")||cadena.trim().equals("-1"))
			return true;
		return false;
	}

}
