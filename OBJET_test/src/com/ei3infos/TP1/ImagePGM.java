package com.ei3infos.TP1;

/**
 * Classe repr�sentant une image au format PGM.
 * @author Camille
 *
 */
public class ImagePGM 
{
	/**
	 * La largeur de l'image
	 */
	private int largeur;
	
	/**
	 * La hauteur de l'image
	 */
	private int hauteur;
	
	/**
	 * Le niveau maximum de gris
	 */
	private int niveauMaxGris = 255;
	
	/**
	 * Le tableau contenant les diff�rentes valeurs de niveau de gris de chaque pixels.
	 */
	private int[][] niveauGrisPixels;
	
	/**
	 * Constructeur avec la largeur et la hauteur.
	 * 
	 * @param largeur
	 * 		La largeur de l'image.
	 * @param hauteur
	 * 		La hauteur de l'image.
	 */
	public ImagePGM(int largeur, int hauteur)
	{
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		this.niveauGrisPixels = new int[largeur][hauteur];
	}
	
	/**
	 * Modifie le niveau de gris du pixel d'abscisse et d'ordonn�e donn�es
	 * 
	 * @param abs
	 * 		L'abscisse du pixel dont on veut modifier le niveau de gris.
	 * @param ord
	 * 		L'ordonn�e du pixel dont on veut modifier le niveau de gris.
	 * @param valeur
	 * 		La nouvelle valeur de niveau de gris.
	 */
	public void setNiveauGrisPixel(int abs, int ord, int valeur)
	{
		valeur = (valeur > niveauMaxGris) ? niveauMaxGris : valeur;
		valeur = (valeur < 0) ? 0 : valeur;
		
		this.niveauGrisPixels[abs][ord] = valeur;
	}
	
	/**
	 * R�cup�re le niveau de gris du pixel d'abscisse et d'ordonn�e donn�es
	 * 
	 * @param abs
	 * 		L'abscisse du pixel dont on veut r�cup�rer le niveau de gris.
	 * @param ord
	 * 		L'ordonn�e du pixel dont on veut r�cup�rer le niveau de gris.
	 * @return
	 * 		La valeur de niveau de gris de ce pixel.
	 */
	public int getNiveauGrisPixel(int abs, int ord)
	{
		return this.niveauGrisPixels[abs][ord];
	}
	
	/**
	 * R�cup�re la largeur.
	 * 
	 * @return la largeur
	 */
	public int getLargeur() 
	{
		return largeur;
	}
	
	/**
	 * R�cup�re la hauteur de l'image.
	 * 
	 * @return la hauteur
	 */
	public int getHauteur() 
	{
		return hauteur;
	}
	
	/**
	 * R�cup�re le niveau maximum de gris pour cette image.
	 * 
	 * @return le niveau maximum de gris
	 */
	public int getNiveauMaxGris() 
	{
		return niveauMaxGris;
	}
}
