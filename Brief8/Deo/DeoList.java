package Deo;


import java.util.Date;

import List.List;
import javafx.collections.ObservableList;

public interface DeoList {

	public ObservableList<List> ListsList();
	public void CreateList(String title, String descreption , String status , Date date , String categ);
	public void UpdateList(String title, String descreption , String status , Date date , String categ);
	public void DeleteList();
	
}
