package pkg1;

public class debug {
	
	public int sum(int a, int b)
	{
	int c= a+b;
	System.out.println("sum result is "+c);
	return c;
	}
	
	public int sub(int a1, int a2)
	{
	int r= a1-a2;
	System.out.println("sub result is "+r);
	return r;
	}
	
	public void multi(int s1, int s2)
	{
		int result;
		result = s1 * s2;
		System.out.println("final reslt is "+result);
	}
	public static void main(String[] args)
	{
		debug ref=new debug();
	int sumresult = ref.sum(12, 2);
	int subresult = ref.sub(10, 2);
	ref.multi(sumresult, subresult);
	}
}
