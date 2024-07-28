
public class Factorial {
	static int fact(int A)
	{
		if(A == 1) return 1;
		return A * fact(A-1);
	}
	public static void main(String[]args)
	{
		System.out.print(fact(5));
	}

}
