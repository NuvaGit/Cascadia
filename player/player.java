package player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class player extends Habitat{
	
static ArrayList<String> names = new ArrayList<String>();
static public  int playercount;
static public int CurrentPlayer = 0;
public static ArrayList<String> Score = new ArrayList(); 


public static int getplayercount() {
	return playercount;
}

public static void addplayer(String gg) {
	names.add(gg);
}

public int playercount() {
	return names.size();
}
public static String getName(int x) {
	return names.get(x);
}
public static void shuffle() {
	Collections.shuffle(names);
}
public static void shufflehabitats() {
	Collections.shuffle(habittats);
}


public static  String getHabitat(int x) {
	return habittats.get(x);
}


public static LinearGradient getHabcolor(String x) {

	
	
	
	if(x == "Forest_Wetland") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#90EE90")),
		        new Stop(0.5,Color.web("#90EE90")),
		        new Stop(0.5, Color.web("#023020")),
		        new Stop(1,Color.web("#023020")));	
		return gradient;

	}
	else if(x == "Forest_River") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#90EE90")),
		        new Stop(0.5,Color.web("#90EE90")),
		        new Stop(0.5, Color.web("#ADD8E6")),
		        new Stop(1,Color.web("#ADD8E6")));	
		return gradient;

	}
	else if(x == "Forest_Mountain") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#90EE90")),
		        new Stop(0.5,Color.web("#90EE90")),
		        new Stop(0.5, Color.web("#D3D3D3")),
		        new Stop(1,Color.web("#D3D3D3")));	
		return gradient;

	}
	else if(x == "Forest_Prairie") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#90EE90")),
		        new Stop(0.5,Color.web("#90EE90")),
		        new Stop(0.5, Color.web("#ffff00")),
		        new Stop(1,Color.web("#ffff00")));	
		return gradient;
	}
	else if(x == "Wetland_River") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#023020")),
		        new Stop(0.5,Color.web("#023020")),
		        new Stop(0.5, Color.web("#ADD8E6")),
		        new Stop(1,Color.web("#ADD8E6")));	
		return gradient;
	}
	else if(x == "Wetland_Mountain") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#023020")),
		        new Stop(0.5,Color.web("#023020")),
		        new Stop(0.5, Color.web("#D3D3D3")),
		        new Stop(1,Color.web("#D3D3D3")));	
		return gradient;
	}
	else if(x == "Wetland_Prairie") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#023020")),
		        new Stop(0.5,Color.web("#023020")),
		        new Stop(0.5, Color.web("#ffff00")),
		        new Stop(1,Color.web("#ffff00")));	
		return gradient;
	}
	else if(x == "Wetland") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#023020")),
		        new Stop(0.5,Color.web("#023020")),
		        new Stop(0.5, Color.web("#023020")),
		        new Stop(1,Color.web("#023020")));	
		return gradient;
	}
	else if(x == "Prairie") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#ffff00")),
		        new Stop(0.5,Color.web("#ffff00")),
		        new Stop(0.5, Color.web("#ffff00")),
		        new Stop(1,Color.web("#ffff00")));	
		return gradient;
	}
	else if(x == "Mountain") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#D3D3D3")),
		        new Stop(0.5,Color.web("#D3D3D3")),
		        new Stop(0.5, Color.web("#D3D3D3")),
		        new Stop(1,Color.web("#D3D3D3")));	
		return gradient;
	}
	else if(x == "River") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#ADD8E6")),
		        new Stop(0.5,Color.web("#ADD8E6")),
		        new Stop(0.5, Color.web("#ADD8E6")),
		        new Stop(1,Color.web("#ADD8E6")));	
		return gradient;
	}
	else if(x == "Forest") {
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
		        new Stop(0, Color.web("#90EE90")),
		        new Stop(0.5,Color.web("#90EE90")),
		        new Stop(0.5, Color.web("#90EE90")),
		        new Stop(1,Color.web("#90EE90")));	
		return gradient;
	}
	
	
	return null;
	
}






public static String StartingWildlifeToken(int x) {
	String tile = player.getHabitat(x);
	System.out.println(tile);
	if(tile == "Mountain") {
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
    	return animal1.toString();

	}
		if(tile == "Forest") {
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
        	return animal1.toString();

		}
	        if(tile == "Prairie") {
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
	        	return animal1.toString();

	        }
	        if(tile == "River") {
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
	        	return animal1.toString();

	        }
	        if(tile == "Wetland") {
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
	        	return animal1.toString();

	        }
		
	
	
	return "";


}



public static String randomhab() {
	

	
	
	
	
	
	return "";
	
	
}



























public void setPlayerCount(int x) {
    // TODO Auto-generated method stub
	playercount = x;
}











}

