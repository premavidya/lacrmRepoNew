package com.lacrm.api.genericutility;

import java.util.Random;

public class JavaUtility {

	
	public int getRandomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(1000);
		 
	}
}
