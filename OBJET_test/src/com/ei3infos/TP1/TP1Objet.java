package com.ei3infos.TP1;

import java.io.File;
/**
 * 
 */

/**
 * @author Camille
 *
 */
public class TP1Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		PGMReader pgmReader= new PGMReader(new File("images/lena512x512.pgm"));
		pgmReader.lireFichier();
	}

}
