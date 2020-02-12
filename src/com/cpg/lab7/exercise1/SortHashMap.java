package com.cpg.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {

	public List<Integer> getValues(HashMap<Integer,Integer> hm)
	{
		List<Integer> ll=new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer> me:hm.entrySet())
		{
			ll.add(me.getValue());
		}
		Collections.sort(ll);
		return ll;
	}
}
