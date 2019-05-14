package application.design.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

//import 
public class MainFrameController implements Initializable {
	@FXML
    private Button mf_test_button;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	public void btnTest_click() {
		mf_test_button.setText("Thanks!");
	}
	
	
}
