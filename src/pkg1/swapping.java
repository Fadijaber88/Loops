package pkg1;

import java.util.Scanner;

public class swapping 
{
	public void method(int a, int b)
	{
		a =a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value afer swapped "+a);
		System.out.println("B value after swapped "+b);
	}
	public static void main(String[] args) 
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Please enter a value of a");
		int a =ref.nextInt();
		System.out.println("Please enter a value of b");
	    int b =ref.nextInt();
		
		System.out.println("A value before swapped "+a);
		System.out.println("B value before swapped "+b);
		
		swapping m=new swapping();
		m.method(a, b);
	}
}