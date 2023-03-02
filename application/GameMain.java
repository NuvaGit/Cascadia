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
	///---------------------------------------------------------------
	///---------------------------------------------------------------
	///---------------------------------------------------------------
	///---------------------------------------------------------------

//	
	// player 1 board 
	//
	
	///---------------------------------------------------------------
	///---------------------------------------------------------------
	///---------------------------------------------------------------
	///---------------------------------------------------------------
	///---------------------------------------------------------------
    static {
        try {

        FXMLLoader loader = new FXMLLoader(Scene2.class.getResource("Board.fxml"));
        Pane root = new Pane();

        root = loader.load();
        Board board = new Board(8, 7, 60);
        Rectangle[][] rectangles = board.getRectangles();
        
        
		Rectangle rec1 = (Rectangle) root.lookup("#rec1");
		Rectangle rec2 = (Rectangle) root.lookup("#rec2");
		Rectangle rec3 = (Rectangle) root.lookup("#rec3");
		Rectangle rec4 = (Rectangle) root.lookup("#rec4");

		
		Label label2 = (Label) root.lookup("#label2");
		Label label3 = (Label) root.lookup("#label3");
		Label label4 = (Label) root.lookup("#label4");
		Label label5 = (Label) root.lookup("#label5");
		
// tristan inset function in here xd 
		label2.setText("");
		label3.setText("");
		label4.setText("");
		label5.setText("");

		
		rec1.setFill(player.getHabcolor(label2.getText()));
        rec2.setFill(player.getHabcolor(label3.getText()));
        rec3.setFill(player.getHabcolor(label3.getText()));
        rec4.setFill(player.getHabcolor(label3.getText()));

        

        for (int row = 0; row < rectangles.length; row++) {
            for (int col = 0; col < rectangles[row].length; col++) {
                root.getChildren().add(rectangles[row][col]);
            }
        }

        rectangles[3][3].setFill(player.getHabcolor(player.getHabitat(0)));
        rectangles[3][4].setFill(player.getHabcolor(player.getHabitat(1)));
        rectangles[4][3].setFill(player.getHabcolor(player.getHabitat(2)));

        
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
