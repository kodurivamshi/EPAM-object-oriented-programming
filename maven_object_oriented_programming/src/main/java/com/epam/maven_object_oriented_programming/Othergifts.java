package com.epam.maven_object_oriented_programming;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.epam.maven_object_oriented_programming.NewYearGifts;

public class Othergifts extends NewYearGifts {
	@Override
	public  void Giftssetter(String[] giftArray) {
		int frequency=0; 
		for(String gift:giftArray) {
			if(gift==null)
				break;
			if(!(gift.contains("candie")) && !(gift.contains("candies")) && !(gift.contains("candy")) && !(gift.contains("choco")) && !(gift.contains("chocolates")) && !(gift.contains("chocolate")))
				frequency++;
		}
		super.GiftDeatilssetter("Other Gifts",frequency);
	}

	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
	}
}
