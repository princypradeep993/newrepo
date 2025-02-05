package InterfaceExample;

public class MultipleChild  implements MultipleA,MultipleB
{
	public static void main(String[] args)
	{
		MultipleChild obj=new MultipleChild();
		obj.draw();
		obj.print();
		obj.show();

	}
	
	
	
	
public void draw()
	
{
	System.out.println("show");	
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("print");
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

}
