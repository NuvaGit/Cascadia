package player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class player extends Habitat{
	
static ArrayList<String> names = new ArrayList<String>();
static public  int playercount;
static public int CurrentPlayer = 0;
public static ArrayList<String> Score = new ArrayList(); 

/*
public static class ImageViewComparator implements Comparator<ImageView> {
    public int compare(ImageView iv1, ImageView iv2) {
        return iv1.getId().compareTo(iv2.getId());
    }
}
*/
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









public static String StartingWildlifeToken(int x) {
	String tile = player.getHabitat(x);
	System.out.println(tile);
	if(tile == "mountains") {
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
		if(tile == "forests") {
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
	        if(tile == "desserts") {
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
	        if(tile == "rivers") {
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
	        if(tile == "waters") {
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





































public void setPlayerCount(int x) {
    // TODO Auto-generated method stub
	playercount = x;
}











}

