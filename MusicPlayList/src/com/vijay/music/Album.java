package com.vijay.music;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
   private String name;
   private String artist;
   private ArrayList<Song> song;
   
public Album(String name, String artist) {
	this.name = name;
	this.artist = artist;
	this.song = new ArrayList<Song>();
}

public boolean findSong(String sName) {
	for(Song checkSong:song) {
		if(checkSong.getsName().equals(sName)) return true;
	}
	return false;
}

public boolean addSong(String sName ,double duration) {
	if(findSong(sName)==false) {
		song.add(new Song(sName, duration));
		System.out.println("song successfully added");
		return true;
	}
	else {
		System.out.println("song already exist");
		return false;
	}
}

public boolean addToList(int trackNum,LinkedList<Song> list) {
	int index=trackNum-1;
	if(index>0 && index<= this.song.size()) {
		list.add(this.song.get(index));
		return true;
	}
	System.out.println("this album doesn't have song with tracknum"+trackNum);
	return false;
}

public boolean addToList(String sName,LinkedList<Song> list) {
	for(Song checkSong:this.song) {
		if(checkSong.getsName().equals(sName)) {
			list.add(checkSong);
			return true;
		}
	}
	System.out.println("this album doesn't have song with name"+sName);
	return false;
}   
}
