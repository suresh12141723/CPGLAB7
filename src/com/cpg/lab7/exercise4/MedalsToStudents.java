package com.cpg.lab7.exercise4;

import java.util.HashMap;
import java.util.Map;

public class MedalsToStudents 
{
  public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm)
  {
	  HashMap<Integer,String> output=new HashMap<Integer,String>();
	  for(Map.Entry<Integer,Integer> me:hm.entrySet())
	  {
		  if(!output.containsKey(me.getKey()))
		  {
			 if(me.getValue()>=90)
			 {
				 output.put(me.getKey(), "Gold");
			 }
			 else if(me.getValue()>=80 && me.getValue()<90)
			 {
				 output.put(me.getKey(), "Silver");
			 }
			 else if(me.getValue()>=70 && me.getValue()<80)
			 {
				 output.put(me.getKey(),"Bronze");
			 }
		  }  
	  }
	  return output;
  }
}
