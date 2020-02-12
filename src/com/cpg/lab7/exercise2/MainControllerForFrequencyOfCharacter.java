package com.cpg.lab7.exercise2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MainControllerForFrequencyOfCharacter 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of character array length:");
		int n=scan.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		FrequencyOfCharacters foc=new FrequencyOfCharacters();
	  Map<Character,Integer> lhm=foc.countCharacter(arr);
	  
	  Iterator<Map.Entry<Character,Integer>> itr=lhm.entrySet().iterator();
	  System.out.print("[");
	    while(itr.hasNext())
	    {
	    	Map.Entry<Character, Integer>entry=itr.next();
	    	System.out.print("\'"+entry.getKey()+"\':"+entry.getValue()+" ,");
	    }
	    System.out.println("]");
		scan.close();
	}

}
