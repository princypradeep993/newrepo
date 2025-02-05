package Inheritance;

public class childclass extends Singleparent {
public void show()
{
	System.out.println("single child");
}
	public static void main(String args[])
	{
		childclass obj=new childclass();
				obj.show();
		obj.display();
	}

}
