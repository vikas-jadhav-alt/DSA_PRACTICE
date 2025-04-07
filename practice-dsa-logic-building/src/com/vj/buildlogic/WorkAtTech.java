package com.vj.buildlogic;

import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double pi = 3.14;
		
				Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		
		double ans = ((pi*Math.pow(r,2)*h)/1000)*40;
		
		System.out.printf("%.8f%n",ans);
		System.out.printf("%.2f%n",ans);
		System.out.println(0%2); //0
		System.out.println(-1%2); //-1
		System.out.println(-16%2); //-1
		System.out.println("over");
		
		
		
	}
}

class WorkAtTech2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int max = 0;
		
		for(int i=1;i<=count;i++){
			int k = sc.nextInt();
			max = Math.max(max,k);
		}
		
		if(max%2==0)
			System.out.println("WIN");
		else
			System.out.println("LOST");
		
		
	}
}