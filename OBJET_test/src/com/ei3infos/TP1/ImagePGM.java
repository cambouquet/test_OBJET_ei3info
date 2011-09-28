package com.ei3infos.TP1;

public class ImagePGM 
{
	private int largeur;
	private int hauteur;
	private int niveauMaxGris = 255;
	
	/**
	 * @return the largeur
	 */
	public int getLargeur() 
	{
		return largeur;
	}
	
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) 
	{
		this.largeur = largeur;
	}
	
	/**
	 * @return the hauteur
	 */
	public int getHauteur() 
	{
		return hauteur;
	}
	
	/**
	 * @param hauteur the hauteur to set
	 */
	public void setHauteur(int hauteur) 
	{
		this.hauteur = hauteur;
	}
	
	/**
	 * @return the niveauMaxGris
	 */
	public int getNiveauMaxGris() 
	{
		return niveauMaxGris;
	}
}
