package com.cpg.lab7.exercise5;

import java.util.Arrays;

public class SecondSmallestElement 
{
  public int getSecondSmallestElement(int arr[])
  {
	  Arrays.sort(arr);
	  return arr[1];
  }
}
