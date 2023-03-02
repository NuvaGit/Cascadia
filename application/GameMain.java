package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
		
		Label label6 = (Label) root.lookup("#label6");
		Label label7 = (Label) root.lookup("#label7");
		Label label8 = (Label) root.lookup("#label8");
		Label label9 = (Label) root.lookup("#label9");

// tristan inset function in here xd 
		label2.setText(player.randomhab());
		label3.setText(player.randomhab());
		label4.setText(player.randomhab());
		label5.setText(player.randomhab());
		label6.setText(player.StartingWildlifeToken(label2.getText()));
		label6.setTextFill(Color.WHITE);
		label7.setText(player.StartingWildlifeToken(label3.getText()));
		label7.setTextFill(Color.WHITE);
		label8.setText(player.StartingWildlifeToken(label4.getText()));
		label8.setTextFill(Color.WHITE);
		label9.setText(player.StartingWildlifeToken(label5.getText()));
		label9.setTextFill(Color.WHITE);


		rec1.setFill(player.getHabcolor(label2.getText()));
        rec2.setFill(player.getHabcolor(label3.getText()));
        rec3.setFill(player.getHabcolor(label4.getText()));
        rec4.setFill(player.getHabcolor(label5.getText()));

      

        for (int row = 0; row < rectangles.length; row++) {
            for (int col = 0; col < rectangles[row].length; col++) {
                root.getChildren().add(rectangles[row][col]);
            }
        }

        
        rectangles[3][3].setFill(player.getHabcolor(player.getHabitat(0)));
        rectangles[3][4].setFill(player.getHabcolor(player.getHabitat(1)));
        rectangles[4][3].setFill(player.getHabcolor(player.getHabitat(2)));
        Text text = new Text(player.StartingWildlifeToken(player.getHabitat(0)));
        text.setFont(Font.font("Arial", 18));
        text.setFill(Color.WHITE);
        text.setX(rectangles[3][3].getX() + (rectangles[3][3].getWidth() - text.getLayoutBounds().getWidth()) / 2);
        text.setY(rectangles[3][3].getY() + (rectangles[3][3].getHeight() - text.getLayoutBounds().getHeight()) / 2);

        root.getChildren().add(text);
        
        Text text1 = new Text(player.StartingWildlifeToken(player.getHabitat(1)));
        text1.setFont(Font.font("Arial", 18));
        text1.setFill(Color.WHITE);
        text1.setX(rectangles[3][4].getX() + (rectangles[3][4].getWidth() - text.getLayoutBounds().getWidth()) / 2);
        text1.setY(rectangles[3][4].getY() + (rectangles[3][4].getHeight() - text.getLayoutBounds().getHeight()) / 2);

        root.getChildren().add(text1);
		
        
        Text text2 = new Text(player.StartingWildlifeToken(player.getHabitat(2)));
        text2.setFont(Font.font("Arial", 18));
        text2.setFill(Color.WHITE);
        text2.setX(rectangles[4][3].getX() + (rectangles[4][3].getWidth() - text.getLayoutBounds().getWidth()) / 2);
        text2.setY(rectangles[4][3].getY() + (rectangles[4][3].getHeight() - text.getLayoutBounds().getHeight()) / 2);
        root.getChildren().add(text2);
        
        
        Label label1 = (Label) root.lookup("#label1");
		label1.setText(player.getName(player.CurrentPlayer));
        
		
		
		
		
		
		
		
		
		// rec clicked
		rec1.setOnMouseClicked(event -> {			
			rectangles[4][4].setOnMouseClicked(e -> {
				rectangles[4][4].setFill(rec1.getFill());
			});
			rectangles[4][5].setOnMouseClicked(e -> {
				if(player.isValidClick(4, 5, rectangles) == true) {
				rectangles[4][5].setFill(rec1.getFill());
				}
			});
			rectangles[4][6].setOnMouseClicked(e -> {
				if(player.isValidClick(4, 6, rectangles) == true) {
					rectangles[4][6].setFill(rec1.getFill());
					}			});
			rectangles[3][5].setOnMouseClicked(e -> {
				if(player.isValidClick(3, 5, rectangles) == true) {
					rectangles[3][5].setFill(rec1.getFill());
					}			});
		
		
		});
		
		
		
		
		
		
		
		
		
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
