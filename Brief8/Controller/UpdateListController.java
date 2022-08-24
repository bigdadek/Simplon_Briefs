package Controller;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Implementation.ListImp;
import Implementation.UserImp;
import List.List;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import javafx.scene.control.DatePicker;

import javafx.scene.control.ChoiceBox;

public class UpdateListController implements Initializable {
	@FXML
	private TextField Update_title;
	@FXML
	private TextArea Update_descreption;
	@FXML
	private ChoiceBox<String> Update_status= new ChoiceBox<>(FXCollections.observableArrayList("Not Yet", "Doing", "Done"));
	@FXML
	private DatePicker Update_date;
	@FXML
	private ChoiceBox<String> Update_categ= new ChoiceBox<>(FXCollections.observableArrayList("Work", "Family", "School","Frinds","Event","Homework","Sport","Books","Movies","Other.."));
	@FXML
	private Button Update_exit;
	@FXML
	private Button Update_delete;
	@FXML
	private Button Update_update;
	@FXML
	private TextField Update_id;
		
	ListImp L = new ListImp();
	
	int UID = UserImp.Uid;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List lis = L.FindList();
        Update_id.setEditable(false);
        Update_id.setText(""+lis.getListId());
        Update_title.setText(lis.getListTitle());
        Update_descreption.setText(lis.getListDiscription());
        Update_status.getSelectionModel().setSelectedItem(lis.getListSatuts());
        Update_date.setValue(lis.getListDate());
        Update_categ.getSelectionModel().setSelectedItem(lis.getListCateg());
        
        Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("KB <3");
		a.setHeaderText("Descreption :");
		a.setContentText("\t"+lis.getListTitle()+"\n"+lis.getListDiscription());

		a.showAndWait();
		
	}

	private void handleButtonAction(ActionEvent event) throws IOException {        
	    
	       if(event.getSource() == Update_update)
	       {

	    	    L.UpdateList(Update_title.getText(), Update_descreption.getText(), Update_status.getSelectionModel().getSelectedItem(), Update_date.getValue(), Update_categ.getSelectionModel().getSelectedItem());
		   	
	    	    Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("KB <3");
				a.setContentText("\t  Your TO DO LIST ' "+ Update_title.getText() +" ' , has been UPDATED <3 .");
				a.showAndWait();
				
				
	    	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
	       }
	        
		   else if (event.getSource() == Update_delete)
		   {
			   	L.DeleteList();
		   		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
		   }
		   else if (event.getSource() == Update_exit)
		   {
		   		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
		        stage.setScene(new Scene(root));
		        stage.show();
		   }
		}



}
