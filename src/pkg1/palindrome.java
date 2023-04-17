package pkg1;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		int reversd=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a value ");
		int n = s.nextInt();
		int num=n;
		
		while(n!=0)
		{
			int rem=n%10;
			reversd= reversd*10+rem;
			n=n/10;
		}
		if(num==reversd)
		{
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not palindrome");
		

    }
}
