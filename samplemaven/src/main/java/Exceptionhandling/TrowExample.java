package Exceptionhandling;

public class TrowExample {

	public static void main(String[] args) {
		int age=12;
		if(age>18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new ArithmeticException("Age under 18"); 
		}
	}

}
