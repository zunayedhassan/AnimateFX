package zunayedhassan;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Zunayed Hassan
 */
public class MyApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(CommonTools.GET_SCENE_AND_INITIALIZE(primaryStage));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
