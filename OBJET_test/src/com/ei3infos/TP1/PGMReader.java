package com.ei3infos.TP1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Camille
 *
 */
public class PGMReader 
{
	private File fichierImage;
	
	public PGMReader(File file)
	{
		this.fichierImage = file;
	}
	
	public ImagePGM lireFichier()
	{
		ImagePGM image;
		
		try 
		{
			FileReader fr = new FileReader(fichierImage);
			
			fr.close();
		} catch (FileNotFoundException e) 
		{
			try 
			{
				System.err.println("Le fichier " + fichierImage.getCanonicalPath() + " n'a pas été trouvé.");
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		} catch (IOException e) {
			try 
			{
				System.err.println("Erreur lors de la fermeture de la lecture du fichier " + fichierImage.getCanonicalPath());
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		
		return null;
	}
}
