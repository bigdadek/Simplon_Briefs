package Implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

import Connection.ConnectList;
import Deo.DeoList;
import List.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListImp implements DeoList{

	Connection conn = ConnectList.getListConnection();
    Statement st;
    
    int UID = UserImp.Uid;
    public static int LID;
    	// Select the list that belong to to user with id = Uid
	@Override
	public ObservableList<List> ListsList() {
		 ObservableList<List> List = FXCollections.observableArrayList();
	        String query = "SELECT * FROM lists JOIN users ON  lists.listUId = users.userId  WHERE lists.listUId=" + UID;
	        ResultSet rs;
	        
	        try{
	            st = conn.createStatement();
	            rs = st.executeQuery(query);
	            List L;
	            while(rs.next()){
	                L = new List(rs.getInt("listId"),rs.getString("listTitle"),rs.getString("listDescreption"),rs.getDate("listDate"),rs.getString("listCateg"),rs.getString("listSatuts"),rs.getInt("listUId"));
	                List.add(L);
	            }
	                
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        return List;
	}
	

	@Override
	public void CreateList(String title, String descreption, String status, Date date, String categ) {
		String query = "INSERT INTO condidats VALUES (" + title + "','" + descreption  + "','" + status + "','" + date + "','" + categ + "','" + UID + "')";
	       
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Creating is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
			System.out.println("Creating Did not go will.");
        }
		
	}

	@Override
	public void UpdateList(String title, String descreption, String status, Date date, String categ) {
		String query = "UPDATE  condidats SET title  = '" + title + "', descreption = '" + descreption + "', status = '" + status + "', date = '" + date + "' , date = '" + categ + "' ,listUId = '"+UID+"' WHERE listId =  '"+ id +"'";
        
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Updating is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
			System.out.println("Updating Did not go will.");
        }	
	}
	
	@Override
	public void DeleteList() {
		String query = "DELETE FROM lists WHERE listId =" + id ;
        
				try{
					st = conn.createStatement();
					st.executeUpdate(query);
					  System.out.println("Deleting is Done.");
				}catch(Exception ex){
		            ex.printStackTrace();
		        }
	}
	
	public List FindList() {
		String query = "SELECT * FROM lists JOIN users ON  lists.listUId = users.userId  WHERE lists.listUId=" + UID;
        ResultSet rs;
        List L=null;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while(rs.next() && L.getListId()!=LID)
            {
                L = new List(rs.getInt("listId"),rs.getString("listTitle"),rs.getString("listDescreption"),rs.getDate("listDate"),rs.getString("listCateg"),rs.getString("listSatuts"),rs.getInt("listUId"));
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
		return L;
	}


}
