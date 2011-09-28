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
	private FileReader fr;
	
	public PGMReader(File file)
	{
		this.fichierImage = file;
	}
	
	public ImagePGM lireFichier()
	{
		ImagePGM image = new ImagePGM();
		boolean lectureOk = true;
		
		try 
		{
			fr = new FileReader(fichierImage);
			
			
			// On remet chaque ligne lue dans un String
			String ligne = "";
			
			// On lit les 3 premières lignes
			ligne = lireLigneSuivante();
			
			// on vérifie que le fichier a la bonne en-tête
			if (ligne.equals("P2"))
			{
				lireLigneSuivante();
				
				// Lecture des dimensions
				ligne = lireLigneSuivante();
			} else
			{
				lectureOk = false;
			}
			
			// Lecture des paramètres
			
			
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
				System.err.println("Erreur lors de la lecture du fichier " + fichierImage.getCanonicalPath());
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		if (lectureOk)
		{
			System.out.println("Fichier " + fichierImage.getName() + " lu");
		} else
		{
			System.err.println("Erreur lors de la lecture du fichier " + fichierImage.getName() + ". Est-ce bien un fichier pgm ?");
		}
		
		return image;
	}

	private String lireLigneSuivante() 
	{
		// le charactère lu
		int c = 0;
		
		String ligne = "";
		ligne = "";
		// On lit la ligne
		try {
			while (!((c = fr.read()) == 10 || c == -1))
			{
//				System.out.println(c);
//				 10 et 13 correspondent aux fins de ligne
				if (c != 10 && c != 13)
				{
					ligne += (char) c;
				}
				}
		} catch (IOException e) 
		{
			try {
				System.err.println("Erreur lors de la lecture du fichier " + fichierImage.getCanonicalPath());
			} catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		System.out.println(ligne);
			
		return ligne;
	}
}
