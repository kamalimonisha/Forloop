package forloop;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		ts.add(90);
		ts.add(10);
		ts.add(20);
		
		for(Integer x : ts);
		System.out.println(ts);
	}

}
