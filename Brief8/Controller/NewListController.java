package Controller;

import java.io.IOException;

import Implementation.ListImp;
import Implementation.UserImp;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import javafx.scene.control.DatePicker;

import javafx.scene.control.ChoiceBox;

public class NewListController  {
	@FXML
	private TextField create_title;
	@FXML
	private TextArea create_desc;
	@FXML
	private ChoiceBox<String> create_status = new ChoiceBox<>(FXCollections.observableArrayList("Not Yet", "Doing", "Done"));
	@FXML
	private DatePicker create_date;
	@FXML
	private ChoiceBox<String> create_categ = new ChoiceBox<>(FXCollections.observableArrayList("Work", "Family", "School","Frinds","Event","Homework","Sport","Books","Movies","Other.."));
	@FXML
	private Button create_save;
	@FXML
	private Button create_exit;
	
	ListImp L = new ListImp();

	private void handleButtonAction(ActionEvent event) throws IOException {        
	    
	       if(event.getSource() == create_save)
	       {
	    	    L.CreateList(create_title.getText(), create_desc.getText(), create_status.getSelectionModel().getSelectedItem(), create_date.getValue(),create_categ.getSelectionModel().getSelectedItem());
	    	    
	    	    
	    	    Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("KB <3");
				a.setContentText("\t ' "+ create_title.getText() +" ' , has been SAVED to your TO DO LIST <3 .");
				a.showAndWait();
	    	    
				
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
	       }
	        
		   else if (event.getSource() == create_exit)
		   {
		   		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
		   }
		}
	
	

}
