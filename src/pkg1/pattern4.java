package pkg1;

public class pattern4 
{
	public static void main(String[] args) 
	{
		int rc=5;
		for(int i=1;i<=rc;i=i+1)
		{
			for(int j=i;j<=rc-1;j=j+1)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=i;y=y+1)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rc;i=i+1)
		{
			for(int y=1;y<=i;y=y+1)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=rc-1;j=j+1)
			{
				System.out.print("*");
				System.out.print(" ");
					
			}
			System.out.println();

		
		}

	}
}
