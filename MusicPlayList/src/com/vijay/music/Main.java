package com.vijay.music;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
private static	ArrayList<Album> albums=new ArrayList<>();
public static void main(String[] args) {
	
	Album a=new  Album("Rock", "Anirudh");
	a.addSong("edirneechal", 4.2);
	a.addSong("oodungaSangu", 4.2);
	a.addSong("whatakaruvaad", 4.2);
	a.addSong("jalabulajangu", 4.2);
	a.addSong("pakkamvandhu", 4.2);
	
	
	Album a1=new Album("Rap", "Eminem");
	a1.addSong("rapGod", 6);
	a1.addSong("slimShady", 6);
	
	albums.add(a);
	albums.add(a1);
	
	LinkedList<Song> list1=new  LinkedList<>();
	albums.get(0).addToList("edirneechal", list1);
	albums.get(1).addToList("rapGod", list1);
	
	Play.play(list1);
}
}
