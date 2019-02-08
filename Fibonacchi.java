package Fibonacchi;

public class Fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibo(5));
		System.out.println(Fibo(4));
		System.out.println(Fibo(0));
		System.out.println(Fibo(1));
		System.out.println(Fibo(11));

	}
	
	public static int Fibo(int index) 
	{
		int f0 = 0;
		int f1 = 1;
		int result = 0;
	
		if(index > 2) {
			index -=1;
			for(int i = 0; i < index; i++)
			{
				result = f0 + f1;
				f0 = f1;
				f1 = result;
			}
		}
		else if(index == 1)
		{
			result = 1;
		}
		return result;
	}

}
