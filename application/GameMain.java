package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import player.Board;
import player.player;

public class GameMain extends player {
    private static Scene scene;
    static {
        try {

        FXMLLoader loader = new FXMLLoader(Scene2.class.getResource("Board.fxml"));
        Pane root = new Pane();

        root = loader.load();
        Board board = new Board(8, 7, 60);
        Rectangle[][] rectangles = board.getRectangles();

        for (int row = 0; row < rectangles.length; row++) {
            for (int col = 0; col < rectangles[row].length; col++) {
                root.getChildren().add(rectangles[row][col]);
            }
        }

        rectangles[1][1].setFill(Color.web("#AAFF00"));
        
        
		Label label1 = (Label) root.lookup("#label1");
		label1.setText(player.getName(player.CurrentPlayer));
        
		Button button = (Button) root.lookup("#Button1");
		button.setOnAction(event -> {
			
		    player.CurrentPlayer = 1;
		    Stage stage = (Stage) button.getScene().getWindow();
		    stage.setScene(GameMain2.getScene());
		    stage.show();
		});
            scene = new Scene(root);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Scene getScene() {
        return scene;
    }
}
