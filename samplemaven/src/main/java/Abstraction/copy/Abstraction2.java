package Abstraction.copy;

public class Abstraction2 extends Abstraction1 {


	public static void main(String[] args) {
		
		Abstraction2 obj1=new Abstraction2();//reference creation
		Abstraction1 obj=new Abstraction2();//object creation
		obj.display();
		obj.print();
		obj1.show();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=4;
		int b=3;
		int c=a+b;
		System.out.println(c);
		
	}
public void show()
{
	System.out.println("show");

}
}
