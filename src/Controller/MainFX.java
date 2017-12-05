package Controller;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author Carlos Vega González
 * @version 2.3.0
 * Interface made for the final exam
 */


public class MainFX extends Application {	
		
	    public Stage primaryStage;

		@Override
	    public void start(Stage primaryStage) throws Exception{

	        FXMLLoader loader=new FXMLLoader(getClass().getResource("../view/Login.fxml"));
	        AnchorPane pane=loader.load();
	        Scene scene=new Scene(pane);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	       
			this.primaryStage = primaryStage;
	        this.primaryStage.setTitle("Hola Ernesto");
	        

	        
	        

	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}