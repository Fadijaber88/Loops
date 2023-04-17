package pkg1;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int result =0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter anyy number");
		int n=sn.nextInt();
		int num=n;
		while(num!=0)
		{
			int rem =num%10;
			result = result + rem * rem * rem;
			num=num/10+0;
		}
		
		if (n==result) 
		{
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Numbr is not Armstrong:");
	}

}
