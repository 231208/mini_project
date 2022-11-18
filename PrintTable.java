package com.demo1;

import java.util.Scanner;

public class PrintTable 
{

	public static void main(String[] args) 
	{
										//Number n for which we have to print the muliplication table. 
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Number :");
										//reading a number whose table is to be print
	int num=sc.nextInt();
	System.out.print("Enter Range :");
										//reading a number whose table is to be print
	int range=sc.nextInt();
	int i=1;
										//while loop starts from 1 and execute upto the range.
	while (i<=range)
	{
										//print table of the enterd number upto the range.
		System.out.println(num+"*"+i+"="+num*i);
										//increments the value of i by 1
	i++;
		
	}
	

}

}
