package pkg1;

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) 
	{
		int n=1;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number");
		int num=s.nextInt();
		
		
		for (int i=1;i<=num;i=i+1)
		{
			n=n*i;
		}
		System.out.println("Factorial number of"+num+" is "+n);
	}

}
