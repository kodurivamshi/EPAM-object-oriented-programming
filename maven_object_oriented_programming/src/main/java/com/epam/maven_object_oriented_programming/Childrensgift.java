package com.epam.maven_object_oriented_programming;

import java.util.Scanner;

public class Childrensgift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Children New year gifts:(At last press cntrl+Z at end of gifts list)\n");
		String[] gifts=new String[100];
		int index=0;
		while(input.hasNextLine()) {
			gifts[index]=input.nextLine();
			index++;
		}
		/*for(index=0;index<gifts.length;index++) {
			System.out.println(gifts[index]+"\n");
		}*/
		System.out.println("\n\n****-->NEW YEAR's GIFTS<---****\n\n");
		Candies candy=new Candies();
		candy.Giftssetter(gifts);
		System.out.println(candy.Giftsgetter()+"\n");
		
		Chocolate choco=new Chocolate();
		choco.Giftssetter(gifts);
		System.out.println(choco.Giftsgetter()+"\n");
		
		Othergifts other=new Othergifts();
		other.Giftssetter(gifts);
		System.out.println(other.Giftsgetter());
		
		int length=0;
		for(String s:gifts)
			if(s!=null)
				length++;
		System.out.println("\n\nTotal Number of NEW YEAR's GIFTS = "+length);
	}

}
