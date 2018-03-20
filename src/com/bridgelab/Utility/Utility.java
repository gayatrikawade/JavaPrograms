package com.bridgelab.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import com.bridgelab.Datastructure.MyLinkedList;
import com.bridgelab.Datastructure.MyQueue;
import com.bridgelab.Datastructure.MyStack;

public class Utility {
	static Scanner scanner = new Scanner(System.in);	
	public static  int integerinput()
	{
		return scanner.nextInt();
	}
	public static String stringinput()
	{
		return scanner.next();
	}
	public static double doubleinput()
	{
		return scanner.nextDouble();
		
	}
	public static long longinput()
	{
		return scanner.nextLong();
		
	}
	public static boolean booleaninput()
	{
		return scanner.nextBoolean();
		
	}
	public static char charinput()
	{
		return scanner.next().charAt(0);
		
	}
	
		public static void flipcoin(int no_of_times)
		{
			
			int head=0;
			int tail=0;
			
			for(int i=0; i<=no_of_times; i++)
			{
				if(Math.random()<0.5)
				{
					head++;
				}	
				else
				{
				    tail++;
				}
			}

			double headpercent = head*100/no_of_times;
			double tailpercent = 100-headpercent;
			
			System.out.println("The percentage of head is----------" + headpercent);
			System.out.println("The percentage of tail is----------" + tailpercent);	
		}
		

	     public static void leapyear(String year)
	     {
		 int length = year.length();
	     int year1 = 0;
		 if(length==4)
	       {
	    	   year1 = Integer.parseInt(year);
	    	   Boolean isLeap = (((year1 % 4 == 0) && (year1 % 100 != 0)) ||
	    	            (year1 % 400 == 0));
	    	   if(isLeap)
	    	   {
	    		   System.out.println("Its Leap Year");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("It is not leap year");
	    	   }
	       }
	       else
	       {
	    	   System.out.println("Please enter proper input");
	       }
	    }
	    
	    public static void powertwo(int number)
	    {
	    	int i;
	    	int num = 0;
			if(number<=31)
			{
			for( i=1;i<=number;i++)
			{
				num = (int) Math.pow(2, i);
				System.out.println(num);
				
			}
			
				
			}
	    }
	 
       public static void harmonicseries(int number)
       {
    	double sum = 0.0;
   		for(int i=1;i<=number; i++)
   		{
   			sum = sum +(double) 1/i;	
   		}
   		System.out.println("The nth harmonic value is:" + sum);     
       }
       
       public static void primefactor(int number)
       {
    	while(number%2==0)
   		{
   			System.out.println(2);
   			number/= 2;
   		}
   		   int number1=number/2;
           for(int i=3; i<number1; i+=2)
           {
           	while(number%i==0)
           	{
           		System.out.println(i);
           		number = number/i;
           	}
           }
           if(number>2)
           {
           	System.out.println(number);
           }
       }
       
     
	public static void stringreplace(String inputstring) 
	{
		  String string = "Hello <<username>>, How are you ?";
   	      int strlength = inputstring.length();
          if(strlength>=3)
          {
          	System.out.println(string.replace("<<username>>", inputstring));
       
          }
          else
          {
          	System.out.println("Please enter username having atleast 3 characters");
          }
		
	}
       
	public static void couponumbers(int numbers)
	{
		int randomCount = 0;
		TreeSet<Object> al = new TreeSet<>();
		for(int i=1;i<=numbers; i++ )
		{
			long randomNumber = Utility.generateRandomNumber();
			al.add(randomNumber);
			randomCount++;
		}
		System.out.println(al);
		System.out.println(randomCount);
	}
       
       
       public static int generateRandomNumber()
       {
    	   Random random = new Random();
    	   random.nextInt(10000000);
    	   return random.nextInt(10000000);
       }
       
       public static void integerarray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    int array[][] = new int[10][10];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.integerinput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       public static void doubleArray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    double array[][] = new double[10][10];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.doubleinput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       public static void booleanArray()
       {
    	    System.out.println("Enter the NUmber of rows for array:");
    		int rows = Utility.integerinput();
    		System.out.println("Enter the NUmber of columns for array:");
    		int columns = Utility.integerinput();
    	    boolean array[][] = new boolean[rows][columns];
    	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");
    	    for(int i=0;i<rows; i++)
    	    {
    		   for(int j=0;j<rows; j++) 
    		   {
    			   array[i][j] = Utility.booleaninput();
    		   }
    	   }
    	 System.out.println("The array is");
    	 PrintWriter pw = new PrintWriter(System.out);
    	   for(int i=0;i<rows; i++)
    	   {
    		   for(int j=0;j<rows; j++) 
    		   {
    			  pw.print(array[i][j] + " ");
    			  pw.flush();
    		   }
    		   System.out.println();
    	   }
    	   
       }
       
      public static void arraytriplet(int size)
      {
    	  int i,j,k;
    	  boolean found = false;
    	  int[] arr = new int[size];
    	  int length = arr.length;
    	  System.out.println("Enter the array element");
    	 
    	  for( i=0;i<size;i++)
    	  {
    		  arr[i] = Utility.integerinput();
    	  }
    	  for(i=0;i<(length-2);i++)
    	  {
    		  for(j=i+1;j<(length-1);j++)
    		  {
    			  for(k=j+1;k<length;k++)
    			  {
    				  if(arr[i]+arr[j] + arr[k] ==0)
    				  {
    					  System.out.println("Triplet is:");
    					  System.out.print(arr[i]);
    					  System.out.print(" ");
    					  System.out.print(arr[j]);
    					  System.out.print(" ");
    					  System.out.print(arr[k]);
    					  System.out.println();
    					  found = true;
    					  
    				  }
    				  
    			  }
    		  }
    	  }
    	 if(found==false)
    	 {
    		 System.out.println("Triplet not present");
    	 }
    	  
      }
       
       
       public static void gambler(int stack,int goals,int no_of_times ) {
       
   		int wins = 0;
   		int loss =0;
   		double winpercent = 0.0;
   		double losspercent = 0.0;
   		
   	    if(stack>=0 && stack<=goals)
   	    {
   	    	for(int i=0; i<no_of_times; i++)
   	    	{
   	    	
   	    	if(Math.random()>0 && Math.random()<0.5)
   	    	{
   	    		loss++;
   	    	}
   	    	
   	    	else if(Math.random()>0.5 && Math.random()<1)
   	    	{
   	    		wins++;
                                             	    	}
   	    	}
   	    	System.out.println("The number of wins" + wins);
   	    	
   	    	winpercent = wins*100/no_of_times;
   	    	losspercent = 100-winpercent;
   	    	System.out.println("Wins Percentage:" + winpercent);
   	    	System.out.println("Loss Percentage:" + losspercent);
   	    }  
       }
       
       public static void distance(Double x,Double y)
       {
    	   double result =  Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    	   System.out.println("The result is:" + result);
    	   
       }
       
       public static void stringpermutation(String string)
       {
    	   char arr[] = new char[0];
    	   
       }
       
       public static void windchill(double temperature,double velocity)
       {
    	   double windchill = 0.0;
    	   if(temperature<=50 && velocity<=120 && velocity>=3)
    	   {
    		   windchill = 35.75 + (0.6215*temperature)+(((0.427*temperature)-35.75)*Math.pow(velocity, 0.16));
        	   System.out.println("The windchill is as follows:" + windchill);

    	   }
    	   else
    	   {
    		   System.out.println("Please enter valid input");
    	   }
       }
       
       
       public static void quadratic(double a, double b, double c)
       {
    	   double root1=0.0;
    	   double root2=0.0; 
    	   double delta = ((b*b) - (4*a*c));
    	   if(delta>0)
    	   {
    	   root1 = ((-b) +(Math.sqrt(delta)))/(2*a);
    	   root2 = ((-b) -(Math.sqrt(delta)))/(2*a);
    	   }
    	   System.out.println("Root values are:" + root1 +"and" + root2);
    	   
       }
       
       
       
       public static void permute(String inputstring,int first, int last)
       {
    	   if(first == last)
    	   {
    		   System.out.println(inputstring);
    	   }
    	   else
    	   {
    		   for(int i = first; i<=last; i++)
    		   {
    		   inputstring = Utility.swap(inputstring,first,i);
    		   Utility.permute(inputstring, first +1, last);//control check
    		   inputstring = Utility.swap(inputstring,first,i);	   
    		   }
    	   }
    	   
       }
       
       public static String swap(String inputstring,int first,int i)
       {
    	   char temp;
    	   char arr[] = inputstring.toCharArray();
    	   temp = arr[first];
    	   arr[first] = arr[i];
    	   arr[i] = temp;
		   return String.valueOf(arr);
    	   
       }
       
       
       
       public static boolean isAnagram(String inputstring1, String inputstring2)
       {
    	   int length1 = inputstring1.length();
    	   int length2 = inputstring2.length();
    	   if(length1 != length2)
    	   {
    		  return false;
    	   }
    	   else
    	   {
    	   String s1 = inputstring1.replaceAll("//s","");
    	   String s2 = inputstring2.replaceAll("//s","");
    	   
    	   char Array1[] = s1.toLowerCase().toCharArray();
    	   char Array2[] = s2.toLowerCase().toCharArray();
    	   
    	   Arrays.sort(Array1);
    	   Arrays.sort(Array2);
    	   
    	    boolean flag=Arrays.equals(Array1, Array2);
    	   return flag;
    	   
    	   }	   
       }
       
        public static ArrayList<String> primenumbers()
        { 
        	int i;
            int j;
            int flag = 0;
            ArrayList<String> al = new ArrayList<String>();
            al.add(Integer.toString(2));
            al.add(Integer.toString(3));
           for(i=1;i<=1000; i++)
           {
        	 for(j=2;j<=i/2;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 flag = 0;
        			 break;
        			 
        		 }
        		 flag=1;
        		 
        	 }
        	 if(flag==1)
        	 {
               al.add(Integer.toString(i));
        	 }
        	 
         }
       	return al;
        }
        
        
        public static void isanagrams(ArrayList<String> al)
        {
          int n =al.size() ;
          String[] liststring = new String[n];
          liststring = al.toArray(liststring);
        
          System.out.println();
          System.out.println();
          System.out.println("The prime anagram are as follows:");
          for(int i=0;i<n ; i++)
          {
       	   for(int j=i+1;j<n; j++)
       	   {
       		   if(isAnagram(liststring[i],liststring[j]))
       			   System.out.println(liststring[i]+"-->"+liststring[j]);
       	   }
          
        }
        }
        
        
        public static void palindrome(ArrayList<String> al)
        {
        	 int n =al.size() ;
             String[] liststring = new String[n];
             liststring = al.toArray(liststring);
           
           System.out.println("The prime numbers which are palindrome are as follows:");
           for(int i=0;i<n ; i++)
           {
        	   if(isPalindrome(liststring[i]))
        	   {
        		   System.out.println(liststring[i]);
        	   }
           }
	
        }
//        for(String s:al)
//        {
//        System.out.println(s);	
//        }
//        
//           int n =al.size() ;
//           String[] liststring = new String[n];
//           liststring = al.toArray(liststring);
//         
//           System.out.println();
//           System.out.println();
//           System.out.println("The primeanagram are as follows:");
//           for(i=0;i<n ; i++)
//           {
//        	   for(j=i+1;j<n; j++)
//        	   {
//        		   if(isAnagram(liststring[i],liststring[j]))
//        			   System.out.println(liststring[i]+"-->"+liststring[j]);
//        	   }
//           }
//           
//           System.out.println();
//           System.out.println();
//           System.out.println("The prime numbers which are palindrome are as follows:");
//           for(i=0;i<n ; i++)
//           {
//        	   if(isPalindrome(liststring[i]))
//        	   {
//        		   System.out.println(liststring[i]);
//        	   }
//           }
//	
//           
//           
//        }
//        
       
        public static boolean isPalindrome(String str)
        {
        	String rev = "";
        	
        	int length = str.length();
        
            for ( int i = length - 1; i >= 0; i--)
            {
               rev = rev + str.charAt(i);
              
            }
            boolean flag = str.equals(rev);
            if(flag==true)
            {
            return flag;
            }
			return false;
            
        }
        
       public static long startTime = 0;
       public static long stopTime = 0;
       
       public static void start()
       {
    	   startTime = System.currentTimeMillis();
       }
       
       
       public static void stop()
       {
    	   stopTime = System.currentTimeMillis();
       }
       
        public static void getElapsedtime()
        {
        	long elapsedTime = (stopTime - startTime)/1000;
        	System.out.println("The elapsed time is:" + elapsedTime +"sec");
        }
        
        public static Integer[] integerarrayInput()
        {   
        	
        	System.out.println("Enter the length of array :");
        	int length = Utility.integerinput();
        	Integer[] array = new Integer[length];
        	System.out.println("Enter the elemnts in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.integerinput();
        	}
        	System.out.println();
			return array;
        }
        
        public static String[] stringarrayInput()
        {   
        	System.out.println("Enter the length of array :");
        	int length = Utility.integerinput();
        	String[] array = new String[length];
        	System.out.println("Enter the elements in the array:");
        	
        	for(int i=0;i<=length-1;i++)
        	{
        		array[i] = Utility.stringinput();
        	}
			return array;
        }
        
		public static <T extends Comparable<T>>  int binarySearch(T[] items, T key, int first, int last) {
			
			while(first<=last)
			{
			int mid = (first+last)/2;
			if(key.compareTo(items[mid]) > 0)
			{
				return binarySearch(items,key,mid+1,last);
			}
			if(key.compareTo(items[mid]) < 0)
			{
				return binarySearch(items,key,first,mid-1);
			}
			
			else
			
			return mid;
			}
		
			return -1;	
		}
		
		public static <T extends Comparable<T>> void bubbleSort(T[] array)
		{
			int i,j;
			T temp = null;
			int arraylength = array.length;
			for(i=0;i<arraylength;i++)
			{
				for(j=1;j<(arraylength-i);j++)
				{
					if(array[j-1].compareTo(array[j]) > 0)	
					{
						temp	 = array[j-1];
						array[j-1] = array[j];
						array[j] =  temp ;
					}
				}
			}
			
			 for(T k : array){
		            System.out.print(k + "  ");
		       
		        
		    }
			 System.out.println();
			
		}
		
		public static <T extends Comparable<T>> void insertionSort (T[] array, int length) 
		  {
		    int i, j;
		    T temp;
		    for (i= 1; i< length; i++)
		    {
		      temp = array[i];
		      for (j = i; j > 0 && array[j- 1].compareTo(temp) > 0; j--)
		      {
		        array[j] = array[j - 1];
		      }
		      array[j] = temp;
		    }
		    
		    for(T k : array)
		    {
	            System.out.print(k + " ");        
	        } 
		    System.out.println();
		  }
		
		public static <T> void printArray(T[] array)
		{
			for(T t: array)
			{
				System.out.print(t);
			}	
		}
		public static String[] readFile(String filePath)
		{
			String words[] = {};
			ArrayList<String> lines = new ArrayList<String>();
			String line, temp[] = {};
			BufferedReader bufferedReader;
			FileReader file;
			try 
			{
				file = new FileReader(filePath);
				bufferedReader = new BufferedReader(file);
				while ((line = bufferedReader.readLine()) != null) 
				{
					temp = line.split(" ");
					for (int i = 0; i < temp.length; i++)
					{
						lines.add(temp[i]);

					}
				}
				words = lines.toArray(new String[lines.size()]);
				bufferedReader.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return words;
		}
		
		static int notecount=0 ;
		public static void vendingmachine(int amount)
		{
		int note = 0;
		int notecount = 0;	
			if(amount >= 1000)
			{
				note = amount/1000;
				notecount=notecount+note;
				amount = amount%1000; 
		     	System.out.println("The notes of Rs.1000 are:"+note);
			}
			if(amount >= 500)
			{
				note= amount/500;
				notecount=notecount+note;
				amount = amount%500;
				System.out.println("The notes of Rs.500 are:"+note);
			}
			if(amount >= 100)
			{  
				note = amount/100;
				notecount=notecount+note;
				amount = amount%100;
				System.out.println("The notes of Rs.100 are:"+note);
			}
			if(amount >= 50)
			{
				note = amount/50;
				notecount=notecount+note;
				amount = amount%50;
				System.out.println("The notes of Rs.50 are:"+note);
			}
			if(amount >= 10)
			{
				note = amount/10;
				notecount=notecount+note;
				amount = amount%10;
				System.out.println("The notes of Rs.10 are:"+note);
			}
			if(amount >= 5)
			{
				note = amount/5;
				notecount=notecount+note;
				amount = amount%5;
				System.out.println("The notes of Rs.5 are:"+note);
			}
			if(amount >= 2)
			{
				note = amount/2;
				notecount=notecount+note;
				amount = amount%2;
				System.out.println("The notes of Rs.2 are:"+note);		
			}
			if(amount >= 1)
			{
				note = amount/1;
				notecount=notecount+note;
				amount = amount%1;
				System.out.println("The notes of Rs.1 are:"+note);
			}
			System.out.println("Minimum number of notes required:" + notecount);	
		}
		
		
		
		
		
		
		public static void temperatureConversionCelsiusToFahrenheit() 
		{
			System.out.print("Enter the temperature in Celsius:");
		    double celsiusT = Utility.doubleinput();
			double fahrenheitT = (celsiusT * 9/5) + 32;
			System.out.print("The temperaure value in Fahrenheit will be:" + fahrenheitT);
		}
		
		public static void temperatureConversionFahrenheitToCelciue()
		{
			System.out.print("Enter the temperature in Fahrenheit:");
		    double fahrenheitT = Utility.doubleinput();
			double celsiusT = (fahrenheitT - 32) * 5/9;
			System.out.print("The temperaure value in Celsius will be:" + celsiusT);
		}
		
		
		
		public static void monthlypayment(double principal,double rateofinterset,double year )
		{
			 double n = 12*year;
			 double r = rateofinterset/(12*100);
			 double payment = (principal*r)/(1-(Math.pow((1+r), -n)));
			 System.out.println("The compound interest will be:" + payment);
			 
		}
		
		public static void toBinary(int decimal)
		{ 
			
			System.out.println("Enter the number of bits:");
			int numberofbits = Utility.integerinput();
			
			
			int[] binary = new int[numberofbits];
			int index = 0;
			while(numberofbits>0)
			{
				binary[index++] = decimal%2;
				decimal= decimal/2;
				numberofbits--;
				
			}
			for(int i=index-1;i>=0;i--)
			{
			    System.out.print(binary[i]);
			}
		}
		
		
		
		public static void squrt(double number)
		{
		    double number1 = number;
			double epsilon = 1E-15;
			while(Math.abs(number1-number/number1) > epsilon*number1)
			{
				number1 = (number/number1+ number1)/2.0;

			}
			System.out.println(number1);

		}
		
        public static void swapnibbles(int decimal)
        {
        	System.out.println("Enter the number of bits:");
        	int numberofbeats = Utility.integerinput();
        	int binary[]  = new int[ numberofbeats];
        	int index = 0;
        	while(numberofbeats>0)
        	{
        		binary[index++] = decimal%2;
        		decimal = decimal/2;
        		numberofbeats--;
        	}
        	System.out.println();

        	String s ="";
        	for(int i=index-1;i>=0;i--)
        	{
               s += binary[i];
        	}
        	System.out.println(s);
        	int length = s.length();
        	String string1 = s.substring(0, length/2);
        	String string2 = s.substring(length/2, length);
        	String string3 = string2 + string1;
        	System.out.println(string3);
        	int decimalnumber = Integer.parseInt(string3,2);
        	System.out.println(decimalnumber);
        }
		
		public static int search(int low, int high)
		{
			if((high-low) == 0)
			
				return high;
			
			int mid = (high + low)/2;
			System.out.println("Is your number between" + " "+low + " "+"to" +" "+ mid +"?(true/false)");
		    boolean	yes = Utility.booleaninput();
			if(yes)
			{
				return search(low, mid);

			}
			
	        else
			{
				return search(mid+1 , high);
			
			}
			
			
			
		}
		
		
		public static int dayOfweek(int day,int month,int year)
		{
	
			int y = year - (14 - month) / 12;
			int x = y + y/4 - y/100 + y /400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d= (day + x + 31*m/ 12) %7;
			return d;
			
		}
		
		static  String[] board = new String[9];
		static String turn;
		
		public static void tictactoe()
		{
			String winner = null;
			turn = "X";
		  Utility.populateBoard();
		  
		  
		  System.out.println("Lets play tic toc toe game");
		  System.out.println("-----------------------------------");
		  Utility.printBoard();
		  System.out.println("X's will play first,Enter the slot number to play");
		
		  
		  while(winner==null)
		  {
			  int numberinput;
			  try
			  {
				  numberinput =Utility.integerinput();
			  if(!(numberinput > 0 && numberinput <= 9))
			  {
				  System.out.println("Invalid input; please enter correct slot number");
				  continue;
			  }
			  }
			  catch (InputMismatchException e)
			  {
				  System.out.println("Invalid input; please enter correct slot number");
				  continue;
			  }
			  if (board[numberinput-1].equals(String.valueOf(numberinput))) {
					board[numberinput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					}
					printBoard();
					winner = checkwinner();
				} else {
					System.out.println("Slot already taken; re-enter slot number:");
					continue;
				}
		  }
			  if (winner.equalsIgnoreCase("draw")) 
			  {
					System.out.println("It's a draw! Thanks for playing.");
			  }
			  else 
				{
					System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
				}
		  		  
		}
		
		

		public static String checkwinner()
		{
		   
		   for(int i=0;i<8;i++)
		   { 
			   String line = null;
			   
			switch (i) 
			{
			case 0:
				   line = board[0] +board[1] +board[2];
			       break;
			case 1:
				   line = board[3] +board[4] +board[5];
			       break;
			case 2:
				   line = board[6] +board[7] +board[8];
			       break;
			case 3:
				   line = board[0] +board[3] +board[6];
			       break;
			case 4:
				   line = board[1] +board[4] +board[7];
			       break;
			case 5:
				   line = board[2] +board[5] +board[8];
			       break;
			case 6:
				   line = board[0] +board[4] +board[8];
			       break;
			case 7:
				   line = board[2] +board[4] +board[6];
			       break;
			} 
			
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}

		   }
		   for (int a = 0; a < 9; a++) {
				if (Arrays.asList(board).contains(String.valueOf(a+1))) {
					break;
				}
				else if (a == 8) return "draw";
			}

			System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
			return null;
		}   	   
		   
		   
		public static void populateBoard()
		{
		      for( int i=0; i<9; i++)
		   {
			board[i] = String.valueOf(i+1);  
		   }
		}
		
		public static void printBoard()
		{
		   System.out.println("/---|---|---\\");
		   System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		   System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
		   System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
		   System.out.println("/---|---|---\\");    	   
		}  
    	   

		 public static <T> void writeFile(String filepath,MyLinkedList<T> list)
		 {
			 try
			 {
			 FileWriter file = new FileWriter(filepath);
			 BufferedWriter bw = new BufferedWriter(file);
			 String data = list.toString();
			 System.out.println(data);
			
		       bw.write(data);
		       bw.flush();
		      // bw.newLine();
			 
			 bw.close();
			 System.out.println("Data Saved");
			 }
			 catch (Exception e) {
				// TODO: handle exception
			}
			 
		 }
		public static boolean isMatchingPair(char character1, char character2)
		    {
		       if (character1 == '(' && character2 == ')')
		         return true;
		      
		       else
		         return false;
		    }
    	   
    	 public static boolean isParanthesesBalance(String expression)
    	 {
    		 MyStack stack = new MyStack();
    		 char ch;
    		 for(int i=0;i<expression.length();i++)
    		 {
    			 ch= expression.charAt(i);
    			 
    			 if(ch=='(' )
    			 {
    				 stack.push(ch);
    			 }
    			 if ( ch == ')')
    	          {
    	              /* If we see an ending parenthesis without 
    	                 a pair then return false*/
    	             if (stack.isEmpty())
    	               {
    	                   return false;
    	               } 
    	      
    	            
    	             else if ( !isMatchingPair(stack.pop(), ch) )
    	               {
    	                   return false;
    	               }    		 
    	 }
   } 
    		 if (stack.isEmpty())
       return true; 
     else
       {   
           return false;
       } 
		 
		 
    	 }
    	 
    	 
		public static void insertCharacter(String inputstring, ArrayDeque<Character> array) 
		{
			for(int i=0; i<inputstring.length(); i++)
			{
				array.addLast(inputstring.charAt(i));
			}
			
			
		}
    	 
		public static String popCharacter(ArrayDeque<Character> array,String reverse)
		{
			while(!array.isEmpty())
			{
				reverse = reverse +  array.removeLast();
			}
			return reverse;
			
			
		}
		
		
		 public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		        if  (year % 400 == 0) return true;
		        return false;
		    }
		 
		 
		 public static void printCalender(int month,int year)
		 {
			 String[] months =  {
                        ""   ,                    
                     "January", "February", "March",
                     "April", "May", "June",
                     "July", "August", "September",
                     "October", "November", "December"
                  };

            int[] days = {0,  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (month == 2 && isLeapYear(year)) days[month] = 29;
            
           System.out.println("   " + months[month] + " " + year);
           System.out.println("S  M  T  W  Th  F  S  ");
           int d = dayOfweek(1, month, year);
            for(int i=0; i<d; i++)
			{
				System.out.print("   ");
			}
			for (int i = 1; i <=days[month]; i++) 
			{
			    System.out.printf("%2d ",i);
			    if (((i + d) % 7 == 0) || (i == days[month])) 
			    {
			    	System.out.println();
			    }
			    	
			}
			}
		 
		  public static void print(int month, int year)
		    {
		     int totalNoOfDays = 0;
		     String[] months =  {
		                      "",                              
		                      "January", "February", "March",
		                      "April", "May", "June",
		                      "July", "August", "September",
		                      "October", "November", "December"
		                   };
		         
		    MyQueue date = new MyQueue();
		    date.enque(31); 
		    date.enque(28); 
		    date.enque(31); 
		    date.enque(30); 
		    date.enque(31); 
		    date.enque(30); 
		    date.enque(31); 
		    date.enque(31); 
		    date.enque(30); 
		    date.enque(31); 
		    date.enque(30); 
		    date.enque(31); 
	    
             for(int j=0; j<month;j++)
             {
              totalNoOfDays =date.deque();
             }
    
          
             if (month == 2 && isLeapYear(year)) 
             {
             totalNoOfDays = 29;
             }
             
              System.out.println("   " + months[month] + " " + year);
              System.out.println("S  M  T  W  Th  F  S  ");
              int d = dayOfweek(1, month, year);
             for(int i=0; i<d; i++)
		    {
		     System.out.print("   ");
		    }
		    for (int i = 1; i <= totalNoOfDays; i++) 
		    {
		        System.out.printf("%2d ",i);
		        if (((i + d) % 7 == 0) || (i == totalNoOfDays)) 
		        {
		         System.out.println();
		        }
		         
		    }	 
		    } 
		  
		  
		  public static void printstack(int month, int year)
		    {
			 MyStack stack1,stack2;
		     int totalNoOfDays = 0;
		     String[] months =  {
		                      "",                              
		                      "January", "February", "March",
		                      "April", "May", "June",
		                      "July", "August", "September",
		                      "October", "November", "December"
		                   };
		         
		     stack1 = new MyStack();
		     stack1.push(31);
		     stack1.push(28);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		     stack1.push(30);
		     stack1.push(31);
		   
	    
           for(int j=0; j<month;j++)
           {
            totalNoOfDays =stack1.pop();
           }
  
        
           if (month == 2 && isLeapYear(year)) 
           {
           totalNoOfDays = 29;
           }
           
            System.out.println("   " + months[month] + " " + year);
            System.out.println("S  M  T  W  Th  F  S  ");
            int d = dayOfweek(1, month, year);
           for(int i=0; i<d; i++)
		    {
		     System.out.print("   ");
		    }
		    for (int i = 1; i <= totalNoOfDays; i++) 
		    {
		        System.out.printf("%2d ",i);
		        if (((i + d) % 7 == 0) || (i == totalNoOfDays)) 
		        {
		         System.out.println();
		        }
		         
		    }	 
		    } 
		  
		  public static ArrayList<Integer> primenumbers1()
		  {
			    int i;
	            int j;
	            int flag = 0;
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            
	           for(i=1;i<1000; i++)
	           {
	        	 for(j=2;j<=i/2;j++)
	        	 {
	        		 if(i%j==0)
	        		 {
	        			 flag = 0;
	        			 break;
	        			 
	        		 }
	        		 flag=1;
	        		 
	        	 }
	        	 if(flag==1)
	        	 {
	               list.add(i);
	        	 }
	           }
			return list;
		  }
		  
		  
//		  public static int primecount()
//		  {
//			   
//			    int i;
//	            int j;
//	            int flag = 0;
//	            int count=0;
//	            int number1=0;
//	            int number2=100;
//	            while(number2<=1000)
//	            {
//	           for(i=number1;i<=number2; i++)
//	           {
//	        	 for(j=2;j<=i/2;j++)
//	        	 {
//	        		 if(i%j==0)
//	        		 {
//	        			 flag = 0;
//	        			 break;
//	        			 
//	        		 }
//	        		 flag=1;
//	        		 
//	        	 }
//	        	 if(flag==1)
//	        	 {
//	              count++;
//	        	 }
//	        	
//			 
//		  }
//	              
//	             
//	            }
//				return count;
//			
//
//		  }
//		  
		 
//		public static int[][] create2DArray() 
//		{
//			 int array[][] = new int[10][];
//			  for(int i=0;i<10;i++)
//			  {
//				  int m = Utility.primecount();
//				  System.out.println(m);
//				  array[i] = new int[m];
//			  }
//			  return array;
//		}
//		
		
		  
		 public static void print2Darray(ArrayList<Integer> list)
         {   
			 int[][] prime = new int[10][]; 
			 Iterator< Integer> it = list.iterator();
			 int block = 100;
			 int i=0;
			 int j =0;
			 while(it.hasNext())
			 {	 
						 prime[i][j]= it.next();
						 System.out.print(prime[i][j] + " ");
						 if(prime[i][j]<block)
						 {
							 i++;
							 j=0;
							 block=block+100;
						 }
						 
					 }
					 System.out.println();
				 }
					 
			 
			 

         
		 
		 public static int primeanagramcount(ArrayList<String> al)
	        {
			  System.out.println("Enter the first element of the range:");
			  int number1 = Utility.integerinput();
			  System.out.println("Enter the second element of the range:");
			  int number2 = Utility.integerinput();
			
	          int size =al.size() ;
	          String[] liststring = new String[size];
	          liststring = al.toArray(liststring);
	          int count =0;
	          int n=Integer.parseInt(liststring[number1]);
	          int m =Integer.parseInt(liststring[number2]);
	          System.out.println(m +"n "+n);
	           
	          for(int i=number1;i<=number2 ; i++)
	          {
	       	   for(int j=i+1;j<=number2; j++)
	       	   {
	       		   if(isAnagram(liststring[i],liststring[j]))
	       		   {
	       			   count++;
	       			   System.out.println(liststring[i] + "--" + liststring[j]);
	       			   System.out.println();
	       		   }
	       			  
	       	   }
	          
	        }
	      
			return count;
	        }
		 
		 
		 public static void anagramqueue(ArrayList<String> al)
	        {
	          int n =al.size() ;
	          String[] liststring = new String[n];
	          liststring = al.toArray(liststring);
	          MyQueue queue = new MyQueue();
	          System.out.println();
	          System.out.println();
	          System.out.println("The primeanagram are as follows:");
	          
	          for(int i=0;i<n ; i++)
	          {
	       	   for(int j=i+1;j<n; j++)
	       	   {
	       		   if(isAnagram(liststring[i],liststring[j]))
	       		   {
	       			   queue.enque(liststring[i]);
	       			   queue.enque(liststring[j]);
	       		   }
	       	   }
	       	   
	          
	        }
	          queue.print();
	          
	        }
//		 
//		 public static String[][] create2DArray1() 
//			{
//				 String array[][] = new String[10][];
//				  for(int i=0;i<10;i++)
//				  {
//					  int m = Utility.primecount();
//					  array[i] = new String[m];
//				  }
//				  return array;
//			}
//			  
//		
//		 
//		 public static void printanagram2Darray(String[][] prime,ArrayList<String> al)
//		 {     
//			  int n =al.size() ;
//	          String[] liststring = new String[n];
//	          liststring =  al.toArray(liststring);
//	          Iterator<String> it = al.iterator();
//	          while(it.hasNext())
//		      {
//				
//	          for(int i=0;i<n ; i++)
//	          {
//	       	   for(int j=i+1;j<n; j++)
//	       	   {
//	       		   if(isAnagram(liststring[i],liststring[j]))
//	       		   {
//					 for( i=0;i<10;i++)
//					 { 
//						 for( j=0;j<prime[i].length;j++)
//						 { 
//							
//							
//								 prime[i][j]=liststring[i];
//								 //prime[i][j]=liststring[j];
//								 System.out.print(prime[i][j] + " ");
//				       		   
//						 }
//						 System.out.println();
//					 }
//						 
//				 }
//	       		}
//	       		   
//	       		   
//	       		   
//	       	   }
//	          
//	          }
//				 
//	       				
//	    			 
//	        }
//	       	   
//      
//          
		 
		 
//		 public static void print2Darray1(ArrayList<Integer> list)
//	       {
//				 Iterator< Integer> it = list.iterator();
//			       MyStack stack = new MyStack();
//
//				 while(it.hasNext())
//				 {
//					 for(int i=0;i<10;i++)
//					 {
//						 for(int j=0;j<list.size();j++)
//						 {
//							
//							 System.out.print(prime[i][j] + " ");
//						 }
//						 System.out.println();
//					 }
//						 
//				 }
//		 
//		 public static void printprimeanagram(String[] liststring)
//		 {
//			int length = liststring.length;
//			for(int i= 0; i<length;i++)
//			{
//				for(int j=i+1;j<length;j++)
//				{
//				  if(isAnagram(liststring[i], liststring[j]))
//				  {
//					  liststring[i][j]= 
//				  }
//				}
//			}
//		 }
//		 
		 
		 public static void anagramstack(ArrayList<String> al)
	        {
	          int n =al.size() ;
	          String[] liststring = new String[n];
	          liststring = al.toArray(liststring);
	          MyStack stack = new MyStack();
	          System.out.println();
	          System.out.println();
	          System.out.println("The primeanagram are as follows:");
	          for(int i=0;i<n ; i++)
	          {
	       	   for(int j=i+1;j<n; j++)
	       	   {
	       		   if(isAnagram(liststring[i],liststring[j]))
	       		   {
	       			   stack.push(liststring[i]);
	       			   stack.push(liststring[j]);
	       		   }
	       	   }
	       	   
	          
	        }
	          stack.show();
	          
	        }
		 
		
		
		
         
}		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

