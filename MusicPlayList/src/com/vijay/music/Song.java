package com.vijay.music;

public class Song {
   String sName;
   double duration;
   
   
public Song(String sName, double duration) {
	this.sName = sName;
	this.duration = duration;
}

public String getsName() {
	return sName;
}


public double getDuration() {
	return duration;
}

@Override
public String toString() {
	return "Song [sName=" + sName + ", duration=" + duration + "]";
}


  
}
