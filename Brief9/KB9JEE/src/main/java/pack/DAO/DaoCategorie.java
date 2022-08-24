package pack.DAO;

import java.util.ArrayList;

import pack.Models.Categorie;

public interface DaoCategorie {

	public ArrayList<Categorie> ReadCategorie();
	public void CreateCategorie(int cId,String cName);
	public void UpdateCategorie(int cId,String cName);
	public void DeleteCategorie(int cId);
}
