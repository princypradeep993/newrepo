package Inheritance;

public class Multilevelchild extends Multilevelparentb
{
	public void display2()
	{
		System.out.println("childclass");
	}
		public static void main(String args[])
		{
		Multilevelchild obj=new Multilevelchild();
		obj.display2();
		obj.display1();
		obj.display();
}
	}

