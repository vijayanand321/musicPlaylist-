package com.vijay.music;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Play {

	public static void play(LinkedList<Song> list) {
		Scanner s=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
	   ListIterator<Song> li=list.listIterator();
		if(list.size()==0)System.out.println("this playlist has no song");
		else {
			System.out.println("now playing"+li.next().toString());
			menu();
		}
		while (!quit) {
			int action=s.nextInt();
			switch (action) {
			case 0:
				quit=true;
				break;
			case 1:
//				if(!forward) {
//					if(li.hasNext()) li.next();
//					forward=true;
//				}
				if(li.hasNext()) {
					System.out.println("now playing"+li.next().toString());
				}
				else {
					System.out.println("no songs more");
					forward =true;
				}
				break;
				
			case 2:
//				if(forward) {
//					if(li.hasPrevious())li.previous();
//					forward=false;
//				}
				if(li.hasPrevious()) {
					System.out.println("now playing"+li.previous().toString());
				}else {
					System.out.println("this is first song");
					forward=false;
				}
				break;
				
			case 3:
				if(forward) {
				if(li.hasPrevious()) {
					System.out.println("now playing"+li.previous().toString());
					forward=false;
				}else {
					System.out.println("we are at start of list");
				}
				}else {
					if(li.hasNext()) {
						System.out.println("now playing"+li.next().toString());
						forward =true;
					}else {
						System.out.println("we are the end of list");
					}
				}
				break;
				
			case 4: printList(list);
			break;
			
			case 5:
				menu();
				break;
				
			case 6 :
				if(list.size()>0) {
					li.remove();
					if(li.hasNext()) {
						System.out.println("now playing "+li.next().toString());
						
					}else {
						if(li.hasPrevious()) {
							System.out.println("now playing"+li.previous().toString());
						}
					}
				}
				
			default:
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("press 0 to quit\n"+"press 1 to play next\n"+"press 2 to play previous\n"
	+"press 3 to replay\n"+"press 4 to see all songs\n"+"press 6 to delete current song");
		
	}
	
	public static void printList(LinkedList<Song> list) {
		Iterator<Song> i=list.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
