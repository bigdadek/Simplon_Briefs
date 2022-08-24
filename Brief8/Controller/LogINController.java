package Controller;

import java.io.IOException;

import Implementation.UserImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class LogINController extends UserImp {
	@FXML
	private TextField log_UserName;
	@FXML
	private PasswordField log_password;
	@FXML
	private Button log_btnLog;
	@FXML
	private Button log_btnSign;
	@FXML
	private Button log_Fogotpasswd;
	
	UserImp U = new UserImp();
	
	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {        
	    
       if(event.getSource() == log_btnLog)
       {
	    	if(U.userExist(log_UserName.getText(),log_password.getText())!=0)
	   		{
	    			// if the user exists it s gonna send his id to the main page , for reading his own lists
	    		
	    		    Alert a = new Alert(AlertType.INFORMATION);
	   				a.setTitle("KB <3");
	   				a.setContentText("\t WelCome <3 .");
	   				a.showAndWait();
	   				
	   				
	   		        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	   		        Parent root;root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
					stage.setScene(new Scene(root));
			   	    stage.show();
	   		      
	   		}
	    			// if it doesnt exist it s gonna display an alert for the error
	   		else
	   		{
	   				Alert a = new Alert(AlertType.INFORMATION);
	   				a.setTitle("KB <3");
	   				a.setHeaderText("Error:");
	   				a.setContentText("Your UserName or your password is incorrect .\n Please try again <3 .");

	   				a.showAndWait();
	   		}
       }
        
	   else if (event.getSource() == log_btnSign)
	   {
		   Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		   Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
		   stage.setScene(new Scene(root));
		   stage.show();
	   }

	   else if (event.getSource() == log_Fogotpasswd)
	   {
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("KB <3");
				a.setHeaderText("You forgot your password !!");
				a.setContentText("  I don't Know what to do yet . \n  I m just a beginner -_- .");
				a.showAndWait();
	   }

	}
	
	
}
