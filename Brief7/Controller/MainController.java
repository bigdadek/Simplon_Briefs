package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Condidat.Condidat;
import Condidat.CondidatEmp;
import Connect.Connect;
import Product.ProEmp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class MainController implements Initializable {
	
	@FXML
	private Label id;
	@FXML
	private Label firstName;
	@FXML
	private Label lastName;
	@FXML
	private Label email;
	@FXML
	private Label adress;
	@FXML
	private Label city;
	@FXML
	private Label country;
	@FXML
	private TextField conId;
	@FXML
	private TextField conFirstName;
	@FXML
	private TextField conLastName;
	@FXML
	private TextField ConEmail;
	@FXML
	private TextField conAdress;
	@FXML
	private TextField conCity;
	@FXML
	private TextField conCountry;
	@FXML
	private TableView<Condidat> tabCondidats;
	@FXML
	private TableColumn<Condidat, Integer> clmnId;
	@FXML
	private TableColumn<Condidat, String> clmnFirstName;
	@FXML
	private TableColumn<Condidat, String> clmLastName;
	@FXML
	private TableColumn<Condidat, String> clmnEmail;
	@FXML
	private TableColumn<Condidat, String> ClmnAdress;
	@FXML
	private TableColumn<Condidat, String> ClmnCity;
	@FXML
	private TableColumn<Condidat, String> clmnCountry;
	@FXML
	private Button btnCreate;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnDelete;

	CondidatEmp  C = new  CondidatEmp();

	public void initialize(URL arg0, ResourceBundle arg1) {
      showCondidats();
    }

    public void showCondidats(){
    	ObservableList<Condidat> L = C.CondidatsList();
        
        clmnId.setCellValueFactory(new PropertyValueFactory<Condidat, Integer>("id"));
        clmnFirstName.setCellValueFactory(new PropertyValueFactory<Condidat, String>("firstName"));
        clmLastName.setCellValueFactory(new PropertyValueFactory<Condidat, String>("lastName"));
        clmnEmail.setCellValueFactory(new PropertyValueFactory<Condidat, String>("email"));
        ClmnAdress.setCellValueFactory(new PropertyValueFactory<Condidat, String>("adress"));
        ClmnCity.setCellValueFactory(new PropertyValueFactory<Condidat, String>("city"));
        clmnCountry.setCellValueFactory(new PropertyValueFactory<Condidat, String>("country"));
        
        tabCondidats.setItems(L);
    }
	    
	@FXML
    private void handleButtonAction(ActionEvent event) {        
        
        if(event.getSource() == btnCreate)
        {
        	C.Create(conId.getText(),conFirstName.getText(),conLastName.getText(),ConEmail.getText(),conAdress.getText(),conCity.getText(),conCountry.getText());
    	    showCondidats();
        }
        
	   else if (event.getSource() == btnUpdate)
	   {
		   C.Update(conId.getText(),conFirstName.getText(),conLastName.getText(),ConEmail.getText(),conAdress.getText(),conCity.getText(),conCountry.getText());
		   showCondidats();
	   }
        
        else if(event.getSource() == btnDelete)
        {
        	C.Delete(conId.getText());
    	    showCondidats();
        }
    }
	    
    @FXML
    void handleMouseAction(MouseEvent event) {
        Condidat C = tabCondidats.getSelectionModel().getSelectedItem();
        conId.setText(""+C.getId());
        conFirstName.setText(C.getFirstName());
        conLastName.setText(C.getLastName());
        ConEmail.setText(C.getEmail());
        conAdress.setText(C.getAdress());
        conCity.setText(C.getCity());
        conCountry.setText(C.getCountry());
    }

	    
}
