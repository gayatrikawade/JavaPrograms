/******************************************************************************
 
  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;
import com.bridgelab.Utility.*;

public class FlipCoin {

	public static void main(String[] args) 
	{
		
		int no_of_times;
		System.out.println("Enter the number of times to flip the coin");
		no_of_times = Utility.integerinput();
		Utility.flipcoin(no_of_times);
	}

}
