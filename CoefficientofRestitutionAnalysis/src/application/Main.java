package application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);  
		stage.setResizable(false);
		stage.show();
		stage.setTitle("Coefficient Of Restitution Visualizer");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}