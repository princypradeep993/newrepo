package InterfaceExample;

public class Interface2 implements Interface1
{

	public static void main(String[] args)
	{
		Interface2 obj1=new Interface2();//object creation
		Interface1 obj=new Interface2();//refrence creation
		obj.display();
		obj1.show();
		
		

	}
	public void show()
	{
		System.out.println("child");
	}

	@Override
	public void display() {
		System.out.println("parent");
	}

}
