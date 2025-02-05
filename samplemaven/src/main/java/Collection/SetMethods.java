package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String>S=new HashSet<String>();
		S.add("red");
		S.add("green");
		S.add("blue");
System.out.println(S);
Set<String>S1=new HashSet<String>();
S1.add("Black");
S1.add("white");
S.addAll(S1);
System.out.println(S);
System.out.println(S.contains("blue"));
System.out.println(S.containsAll(S1));
System.out.println(S.isEmpty());
S.remove("green");
System.out.println(S);

S.removeAll(S1);
System.out.println(S);
System.out.println(S.size());
	}

}
