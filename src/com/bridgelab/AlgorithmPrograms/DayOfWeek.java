package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the day:");
		int day = Utility.integerinput();
		if(day<1 || day>31)
		{
			System.out.println("Day is invalid");
			System.exit(0);
		}
		System.out.println("Enter the month:");
		int month = Utility.integerinput();
		if(month<1 || month>12)
		{
			System.out.println("Month is invalid");
			System.exit(0);
		}
		System.out.println("Enter the year");
		int year = Utility.integerinput();
		String year1 = Integer.toString(year);
		if(year1.length() !=4)
		{
			System.out.println("Year in invalid");
			System.exit(0);
		}
		
		Utility.dayOfweek(day,month, year);

	}

}