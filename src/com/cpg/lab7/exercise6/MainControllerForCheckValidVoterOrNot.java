package com.cpg.lab7.exercise6;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainControllerForCheckValidVoterOrNot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Size of Array:");
     int n=scan.nextInt();
      HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
     for(int i=0;i<n;i++)
     {
    	  System.out.print("\nEnter Voter id:");
    	  int id=scan.nextInt();
    	  System.out.print("\nEnter Age of voter:");
    	  int age=scan.nextInt();
    	  hm.put(id,age);
     }
     CheckValidVoterOrNot obj=new CheckValidVoterOrNot();
     List<Integer> out=obj.votersList(hm);
     System.out.println("Final Voters:\n");
     for(int i=0;i<out.size();i++)
     {
    	 System.out.println(out.get(i));
     }
     scan.close();
	}

}
