package pack.DAO;


import java.util.ArrayList;
import java.util.Date;

import pack.Models.List;
public interface DaoList {

	public ArrayList<List> ReadLists();
	public void CreateList(String title, String descreption , String status , Date date , String categ);
	public void UpdateList(String title, String descreption , String status , Date date , String categ);
	public void DeleteList();
	
}
