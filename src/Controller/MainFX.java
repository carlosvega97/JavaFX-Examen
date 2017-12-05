package Controller;
	
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
		
	    @Override
	    public void start(Stage primaryStage) throws Exception{

	        FXMLLoader loader=new FXMLLoader(getClass().getResource("../view/Login.fxml"));
	        AnchorPane pane=loader.load();
	        Scene scene=new Scene(pane);
	        primaryStage.setScene(scene);
	        primaryStage.show();

	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}