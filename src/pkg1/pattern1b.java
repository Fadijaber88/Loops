package pkg1;

public class pattern1b
{
	public static void main(String[] args) 
	{
		int num=1;
		for(int i=1;i<=4;i=i+1)
		{
			
			for(int j=1;j<=i;j=j+1)
				{
				
				System.out.print(num++);
				}
			System.out.println();
		}
		
	}

}