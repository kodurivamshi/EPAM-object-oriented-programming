package com.epam.maven_object_oriented_programming;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.epam.maven_object_oriented_programming.NewYearGifts;


public class Chocolate extends NewYearGifts{
	@Override
	public  void Giftssetter(String[] giftArray) {
		int frequency=0; 
		List<String> gifts=(List<String>) Arrays.asList(giftArray);
		frequency=Collections.frequency(gifts, "chocolate");
		frequency+=Collections.frequency(gifts, "choco");
		frequency+=Collections.frequency(gifts, "chocolates");
		super.GiftDeatilssetter("chocolates",frequency);
	}

	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
	}
}
