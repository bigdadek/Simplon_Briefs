package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Condidat.Condidat;
import Implementation.ListImp;
import Implementation.UserImp;
import List.List;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class ReadListController implements Initializable {
	@FXML
	private TableView<List> read_table;
	@FXML
	private TableColumn<List,Integer > create_id;
	@FXML
	private TableColumn<List,String > read_title;
	@FXML
	private TableColumn<List, String> read_date;
	@FXML
	private TableColumn<List,String > read_categ;
	@FXML
	private TableColumn<List, String> read_status;
	@FXML
	private Button read_btnCreate;
	@FXML
	private Button read_logOut;
	
	ListImp L = new ListImp();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	ObservableList<List> Tab = L.ListsList();
        
    	create_id.setCellValueFactory(new PropertyValueFactory<List, Integer>("listId"));
    	read_title.setCellValueFactory(new PropertyValueFactory<List, String>("listTitle"));
    	read_date.setCellValueFactory(new PropertyValueFactory<List, String>("listDate"));
    	read_categ.setCellValueFactory(new PropertyValueFactory<List, String>("listCateg"));
    	read_status.setCellValueFactory(new PropertyValueFactory<List, String>("listSatuts"));
        
    	read_table.setItems(Tab);
		
	}
	
     @FXML
     void handleMouseAction(MouseEvent event) {
    	 List list = read_table.getSelectionModel().getSelectedItem();
    	 create_id.setText(""+list.getListId());
    	 
    	 ListImp.LID= list.getListId();
    	 
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         Parent root;
         try {
			root = FXMLLoader.load(getClass().getResource("UdateList.fxml"));
			stage.setScene(new Scene(root));
		    stage.show();
		 } catch (IOException e) {
			e.printStackTrace();
		 }
       
     }
     
	 @FXML
	    void handleButtonAction(MouseEvent event) throws IOException {
	       if(event.getSource() == read_btnCreate)
	       {
	    	   	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("NewList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
	       }
	       else if (event.getSource() == read_logOut) 
	       {
	    	   Platform.exit();
	       }
	       
	    }

}
