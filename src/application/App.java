package application;

import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewMannager;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            ViewMannager mannager = new  ViewMannager();
            primaryStage = mannager.getMainStage();
            primaryStage.show();
            primaryStage.setTitle("Space Invaders");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
