package com.cpg.lab7.exercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckValidVoterOrNot {

	public List<Integer> votersList(HashMap<Integer,Integer> hm)
	{
		List<Integer> output=new ArrayList<>();
		for(Map.Entry<Integer,Integer> me: hm.entrySet())
		{
			if(me.getValue()>18)
				output.add(me.getKey());
		}
		return output;
	}
}
