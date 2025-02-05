package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorArraylist {

	public static void main(String[] args) {
		ArrayList<String>S=new ArrayList<String>();
		S.add("RED");
		S.add("GREEN");
		S.add("WHITE");
		S.add("BLACK");
		S.add("BLUE");
		Iterator it=S.iterator();
		
	while(	it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
