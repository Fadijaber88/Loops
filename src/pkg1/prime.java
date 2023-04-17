package pkg1;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		int F = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a value ");
		int x = s.nextInt();
		
		
		for (int i=2;i<x;i=i+1)
		{
			if (x%i==0)
			    F=1;
			System.out.println("no");
		}
		
		if (F==0)
			System.out.println("This is a prime number "+x);
		else
			System.out.println("This is not a prime number "+x);
	}
		
}
