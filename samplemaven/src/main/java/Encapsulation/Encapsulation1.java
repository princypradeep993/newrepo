package Encapsulation;

public class Encapsulation1 {
	private String name;
	private int age;
	public void setter(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
public void gettter()
{
	System.out.println(name+" "+age);
}
}
