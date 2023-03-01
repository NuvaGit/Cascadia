package player;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.scene.image.Image;

public class Habitat {
    static wT animal1;
    static  wT animal2;
    static wT animal3;
    
    
	

	

static ArrayList<String> habittats = new ArrayList<String>();
public Habitat() {
	habittats.add("Forest");
	habittats.add("Wetland");
	habittats.add("River");
	habittats.add("Mountain");
	habittats.add("Prairie");

	habittats.add("Forest_Wetland");
	habittats.add("Forest_River");
	habittats.add("Forest_Mountain");
	habittats.add("Forest_Prairie");
	habittats.add("Wetland_River");
	
	habittats.add("Wetland_Mountain");
	habittats.add("Wetland_Prairie");
}


}