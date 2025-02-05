package Superkeyword;

public class Supermethodchild extends Supermethod
{
	public void display()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args)
	{
		Supermethodchild obj=new Supermethodchild();
		obj.display();
	
		// TODO Auto-generated method stub

	}

}
