package org.arr;

public class Aprog {
	
	private void sample(Object...a) {
    for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
	public static void main(String[] args) {
		
		Aprog a=new Aprog();
		a.sample("ramesh",10,"sathish",30,"mohan",50,60.25,"ravi",1234567789l);
		
	}

}
