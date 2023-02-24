package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import player.player;

public class GameMain extends player {
	private static Scene scene;
	static int turn = 1;
	static ImageView lastClickedImage = null;
	static {
		FXMLLoader loader = new FXMLLoader(Scene2.class.getResource("GamePanel.fxml"));
		Parent root;
		try {
			root = loader.load();

			scene = new Scene(root, 800, 600);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Scene getScene() {
		return scene;
	}
}
