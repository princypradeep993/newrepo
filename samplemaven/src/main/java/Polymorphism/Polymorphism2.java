package Polymorphism;

public class Polymorphism2 extends Polymorphism1 {
	public void display(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
super.display(59, 65);
	}

	public static void main(String[] args) {
	Polymorphism2 obj=new Polymorphism2();
	obj.display(20,40);
	// TODO Auto-generated method stub

	}

}
