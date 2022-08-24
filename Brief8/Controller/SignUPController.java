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
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class SignUPController {
	@FXML
	private TextField sign_FirstName;
	@FXML
	private TextField sign_LastName;
	@FXML
	private TextField sign_UserName;
	@FXML
	private PasswordField sign_password;
	@FXML
	private Button sign_btnSign;
	@FXML
	private Button sign_btnLog;
	

	UserImp U = new UserImp();
	
	private void SignUp()
	{
		if(U.userExist(sign_UserName.getText(),sign_password.getText())!=0)
		{
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("KB <3");
				a.setHeaderText("Error:");
				a.setContentText("This user is allready existed .\n	Welcome back , I think you bwere a little bit lost <3 .");
				a.showAndWait();
		}
		else
			U.CreateUser(sign_FirstName.getText(),sign_LastName.getText(),  sign_UserName.getText(),sign_password.getText());
		
	}
	
	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {        
	    
       if(event.getSource() == sign_btnSign)
       {
    	    SignUp();
    	    
    	    Alert a = new Alert(AlertType.INFORMATION);
			a.setTitle("KB <3");
			a.setContentText("\t WelCome <3 .");
			a.showAndWait();
			
	   		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        Parent root = FXMLLoader.load(getClass().getResource("ReadList.fxml"));
	        stage.setScene(new Scene(root));
	        stage.show();
       }
        
	   else if (event.getSource() == sign_btnLog)
	   {
	   		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        Parent root = FXMLLoader.load(getClass().getResource("LogIN.fxml"));
	        stage.setScene(new Scene(root));
	        stage.show();
	   }
	}

}
