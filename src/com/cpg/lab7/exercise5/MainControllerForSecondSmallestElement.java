package com.cpg.lab7.exercise5;

import java.util.Scanner;

public class MainControllerForSecondSmallestElement 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		SecondSmallestElement obj=new SecondSmallestElement();
		int out=obj.getSecondSmallestElement(arr);
		System.out.println("Second smallest element in array: "+out);
		scan.close();

	}

}
