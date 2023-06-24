package forloop;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		Set l = new HashSet();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		
		for(Object integer:l);
	    System.out.println(l);
	}

}
