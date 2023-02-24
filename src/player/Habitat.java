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


/*
public static String StartingWildlifeToken(int x) {
	String tile = (x);
	switch(tile) {
    case "mountains":
        switch((int) Math.round(Math.random()*2)){
            case 0:
                animal1 = wT.BEAR;
                break;
            case 1:
                animal1 = wT.HAWK;
                break;
            case 2:
                animal1 = wT.ELK;
                break;
        }
        case "forests":
            switch((int) Math.round(Math.random()*3)){
                case 0:
                    animal1 = wT.BEAR;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.ELK;
                    break;
                case 3:
                    animal1 = wT.FOX;
                    break;
            }
        case "deserts":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.HAWK;
                    break;
                case 1:
                    animal1 = wT.ELK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
            
        
        case "rivers":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.SALMON;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
            
        case "waters":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.SALMON;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
        
            

    }
	
	
	return animal1.toString();
}


*/










/*
public static String WildlifeToken(int x) {
	String tile = player.gettilename(x);
	switch(tile) {
    case "mountains":
        switch((int) Math.round(Math.random()*2)){
            case 0:
                animal1 = wT.BEAR;
                break;
            case 1:
                animal1 = wT.HAWK;
                break;
            case 2:
                animal1 = wT.ELK;
                break;
        }
        case "forest":
            switch((int) Math.round(Math.random()*3)){
                case 0:
                    animal1 = wT.BEAR;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.ELK;
                    break;
                case 3:
                    animal1 = wT.FOX;
                    break;
            }
        case "dessert":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.HAWK;
                    break;
                case 1:
                    animal1 = wT.ELK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
            
        case "dessert + forest":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.HAWK;
                    break;
                case 1:
                    animal1 = wT.ELK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
        case "marine":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.SALMON;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.FOX;
                    break;
            }
        case "river":
            switch((int) Math.round(Math.random()*2)){
                case 0:
                    animal1 = wT.SALMON;
                    break;
                case 1:
                    animal1 = wT.HAWK;
                    break;
                case 2:
                    animal1 = wT.BEAR;
                    break;
            }
            

    }
	
	
	return animal1.toString();
}
*/

}
