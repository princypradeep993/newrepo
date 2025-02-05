package Superkeyword;

public class Childvariable extends Supervariable {
	String color="blue";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args)
	{
		Childvariable obj=new Childvariable();
		obj.display();// TODO Auto-generated method stub

	}

}
