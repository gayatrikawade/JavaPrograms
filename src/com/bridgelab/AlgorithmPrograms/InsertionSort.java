package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		String[] stringArray = Utility.stringarrayInput();
		System.out.println("Unsorted string array:");
		/*for(String s: stringArray);
		{
		
			System.out.print(s + " ");
		}*/
		int length = stringArray.length;
        System.out.println("Sorted string array by Insertionsort:");
        Utility.insertionSort(stringArray, length);
	}

}
