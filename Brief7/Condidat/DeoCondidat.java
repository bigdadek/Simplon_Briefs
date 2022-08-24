package Condidat;

import java.util.ResourceBundle;

import javafx.collections.ObservableList;

public interface DeoCondidat  {
	
	public ObservableList<Condidat> CondidatsList();
	public void Create(String id, String name, String lastName , String email , String adress , String city,String country);
	public void Update(String id, String name, String lastName , String email , String adress , String city,String country);
	public void Delete(String id);
	
}
