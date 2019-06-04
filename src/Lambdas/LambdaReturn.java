package Lambdas;

public class LambdaReturn 
{
	public static void main(String[] args) 
	{	
		int a=10;
		int b=20;
		Interf i =(x,y)-> {return x*y;};

		System.out.println(i.product(a, b));
	}
}

interface Interf
{
public int product(int a,int b);
}