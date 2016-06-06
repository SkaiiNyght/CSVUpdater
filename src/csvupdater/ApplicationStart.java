package csvupdater;
import javafx.application.Application;
import javafx.stage.Stage;
import view.Main;

/**
 * This program will read in a CSV, and update or insert new records for the test
 * values.
 * 
 * @author Zach Larson
 * @version 0.11
 */
public class ApplicationStart extends Application {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Main.Display(primaryStage);
    }
}
