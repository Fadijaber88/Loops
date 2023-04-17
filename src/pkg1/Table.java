package pkg1;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sn.nextInt();
		
		for(int i=0;i<10;i=i+1)
		{
						
			System.out.println(n+" * "+i+" = "+n*i);  
			i++;
		}
		
	}
}