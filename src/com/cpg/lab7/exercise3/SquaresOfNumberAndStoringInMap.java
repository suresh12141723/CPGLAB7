package com.cpg.lab7.exercise3;

import java.util.HashMap;

public class SquaresOfNumberAndStoringInMap 
{
  public HashMap<Integer,Integer> getSquares(int input[])
  {
	  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	  
	  for(int i=0;i<input.length;i++)
	  {
		  hm.put(input[i], input[i]*input[i]);
	  }
	  return hm;
  }
}
