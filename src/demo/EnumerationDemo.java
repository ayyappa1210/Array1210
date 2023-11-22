package demo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer i=e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
