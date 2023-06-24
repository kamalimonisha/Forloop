package forloop;

import java.util.HashSet;
import java.util.Set;

public class forloop1 {

	public static void main(String[] args) {
		Set l = new HashSet();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		
		for(Object integer :l);
		System.out.println(l);
		

	}

}
