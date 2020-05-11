package view;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.SHIP;
import model.SmallLabel;

import java.util.Random;


public class GameViewManager {

    private AnchorPane gamePane;
    private Scene gameScene;
    private Stage gameStage;

    private static final int GAMGE_HEIGHT = 800;
    private static final int GAMGE_WIDTH = 600;

    private Stage menuStage;
    private ImageView ship;


    public GameViewManager() {
        initializeStage();
        createKeyListeners();
    }

    private void createKeyListeners() {
        gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {

                } else if (event.getCode() == KeyCode.LEFT) {

                }

            }
        });
        gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {

                } else if (event.getCode() == KeyCode.RIGHT) {

                }

            }
        });

    }

    public void initializeStage() {
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane, GAMGE_HEIGHT, GAMGE_WIDTH);
        gameStage = new Stage();
        gameStage.setScene(gameScene);
    }

    public void startNewGame(Stage menuStage, SHIP choosenShip) {
        this.menuStage = menuStage;
        this.menuStage.hide();
        createShip(choosenShip);
        gameStage.show();
    }

    private void createShip(SHIP choosenShip) {

        ship = new ImageView(choosenShip.getUrlShip());
        ship.setLayoutX(GAMGE_WIDTH / 2);
        ship.setLayoutY(GAMGE_HEIGHT - 90);
        gamePane.getChildren().add(ship);
    }

}

