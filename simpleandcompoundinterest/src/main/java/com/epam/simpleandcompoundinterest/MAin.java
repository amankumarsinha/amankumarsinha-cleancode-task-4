package com.epam.simpleandcompoundinterest;
import java.util.*;

public class MAin {

	public static void main(String args[])
	{
		double principle;
		float rate,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount");
		principle=sc.nextDouble();
		System.out.println("enter rate of interest");
		rate=sc.nextFloat();
		System.out.println("enter time period");
		time=sc.nextFloat();
		System.out.println("choose---> ");
		System.out.println("1.Simple interest \n2.Compound interst");
		int ch=sc.nextInt();
		si_ci i=new si_ci();
		switch(ch)
		{
		case 1: 
			System.out.println("simple interst on sum "+principle+" with rate "+rate+" and time "+time+"years is\t"+i.simple(principle, rate, time)+"ruppes");
	         break;
		case 2:    
			System.out.println("compund interst on sum "+principle+" with rate "+rate+" and time "+time+"years is\t"+i.compound(principle, rate, time)+"ruppes");
		    break;
		    default:System.out.println("invalid choice");
		}
		
		
				
	}
}
