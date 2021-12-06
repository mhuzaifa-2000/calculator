package application;


import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class calculatorController {
	
    @FXML private Text actiontarget;
    
    @FXML protected void handleClick(Event event) {
        System.out.println(event);
    }
    @FXML protected void mousePressed(Event event) {
    	
    }
}
