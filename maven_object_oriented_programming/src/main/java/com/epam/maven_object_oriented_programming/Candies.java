package com.epam.maven_object_oriented_programming;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.epam.maven_object_oriented_programming.NewYearGifts;

public class Candies extends NewYearGifts{
	@Override
	public  void Giftssetter(String[] giftArray) {
		// TODO Auto-generated method stub
		int frequency=0; 
		List<String> gifts=(List<String>) Arrays.asList(giftArray);
		frequency=Collections.frequency(gifts, "candie");
		frequency+=Collections.frequency(gifts, "candies");
		frequency+=Collections.frequency(gifts, "candy");
		super.GiftDeatilssetter("candies",frequency);
	}

	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
		// TODO Auto-generated method stub
		
	}

}
