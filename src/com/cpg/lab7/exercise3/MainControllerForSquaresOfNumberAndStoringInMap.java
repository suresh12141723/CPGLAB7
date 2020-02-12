package com.cpg.lab7.exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MainControllerForSquaresOfNumberAndStoringInMap {

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		SquaresOfNumberAndStoringInMap obj=new SquaresOfNumberAndStoringInMap();
		HashMap<Integer,Integer>hm=obj.getSquares(arr);
		Iterator<Map.Entry<Integer,Integer>> itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		scan.close();

	}

}
