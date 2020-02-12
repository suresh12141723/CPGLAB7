package com.cpg.lab7.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainControllerForSortHashMap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		 int n=scan.nextInt();
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("Enter Any number to map:");
			 hm.put(i, scan.nextInt());
		 }
		 SortHashMap obj=new SortHashMap();
		 List<Integer> output=obj.getValues(hm);
		 System.out.println(output);
		scan.close();

	}

}
