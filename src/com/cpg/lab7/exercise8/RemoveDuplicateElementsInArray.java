package com.cpg.lab7.exercise8;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicateElementsInArray {

	public int[] modifyArray(int arr[])
	{
		TreeSet<Integer>set=new TreeSet<>();
	    for(int i=0;i<arr.length;i++)
	    {
		   set.add(arr[i]);
	    }
	    int i=0;
		int output[]=new int[set.size()];
		Iterator<Integer> itr=set.descendingIterator();
		while(itr.hasNext())
		{
			output[i++]=itr.next();
		}
		
		return output;
	       
	}
}
