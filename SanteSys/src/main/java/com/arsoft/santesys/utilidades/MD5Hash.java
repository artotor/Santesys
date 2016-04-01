/*
 * @(#)MD5Hash.java
 *
 * Copyright Princeton S.A. &copy;&reg; 2002. Todos Los Derechos Reservados.
 *
 * Lenguaje   : Java
 * Compilador : J2SDK 1.4.1_01
 *
 */

package com.arsoft.santesys.utilidades;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class MD5Hash {

	/**
	 * Obtiene el <i>hash</i> de un password, usando el algoritmo MD5.
	 * @param  password una cadena de texto con el password al cual se le va a obtener su <i>hash</i>
	 * @return una cadena de texto de 32 caracteres de longitud, con el <i>hash</i> del password
	 * en base hexadecimal
	 */
	public static String hashPassword (String password) {

		MessageDigest md = null;

		/* Si un proveeddor criptografico JCE no se encuentra instalado, esta mal configurado
		   o no soporta el algoritmo MD5, la siguiente operacion produci una excepcion */
		try {
			md = MessageDigest.getInstance("MD5");
		}
		catch (NoSuchAlgorithmException nsae) {
			System.err.println("El proveedor criptografico no soporta el algoritmo MD5");
			nsae.getMessage();
			nsae.printStackTrace();
		}

		md.update(password.getBytes());

		// El hash del password queda en un byte []
		byte [] digest = md.digest();
		String resp = "";

		// Convierto el byte [] en una cadena de texto con la representacion hexadecimal del hash
		for (int i=0; i<16; i++) {
			resp += Integer.toString( ((digest[i] & 0xF0) >> 4), 16);
			resp += Integer.toString( (digest[i] & 0x0F), 16);
		}

		return resp;

	}

}