package com.cpg.lab7.exercise7;


import java.util.Arrays;

public class ReverseNumberInArrayAndReturnInSortedOrder {

	public int[] getSorted(int arr[])
	{
		StringBuffer arr2[]=new StringBuffer[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr2[i]=new StringBuffer(""+arr[i]);
			arr2[i].reverse();
		 }
		 
		 int arr3[]=new int[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			arr3[i]=Integer.parseInt(arr2[i].toString()); 
		 }
		 Arrays.sort(arr3);
		 return arr3;
	}
}
