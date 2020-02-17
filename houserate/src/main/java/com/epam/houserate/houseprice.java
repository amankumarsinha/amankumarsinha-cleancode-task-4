package com.epam.houserate;
import java.io.IOException;
import java.util.*;
public class houseprice extends choice {
	public houseprice(int n, float area) throws IOException {
		super(n, area);
		System.out.print(super.cost+"ruppees");
		
	}

	public static void main(String[] args) throws IOException
	{
	 int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the area \n");
	float area =sc.nextFloat();
	System.out.println("choose the materials\n");
	System.out.println("1.Standard materials\n");
	System.out.println("2.Above standard material\n");
	System.out.println("3.high standard material\n");
	System.out.println("4.high standard mterial and fully automated home");
	ch=sc.nextInt();
	new houseprice(ch,area);
	
	sc.close();}
	

}
