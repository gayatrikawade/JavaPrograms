/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeAnagram2DArray {

	public static void main(String[] args) 
	{
	System.out.println();
     ArrayList<Integer> list = Utility.findPrimes();	
     Utility.printAnagram2Darray(list);
	}

}
