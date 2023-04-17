package pkg1;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		int result;
	int a=0;
	int b=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the series count of fibonacci");
	int n=s.nextInt();
	
	for(int i=0;i<=n;i=i+1)
	{
		result=a+b;
		a=b;
		b=result;
	}
	System.out.println("The answer is "+b);
	}

}
