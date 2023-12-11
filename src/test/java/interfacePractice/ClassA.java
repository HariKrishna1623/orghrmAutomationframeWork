package interfacePractice;

public class ClassA implements Interface {
     // below all methods from interface class 
	// in this class providing implementation for declered methods in interface

	
	
	public void add() {
		int x = 10;
		int y = 10;
		System.out.println(x + y);
	}

	public void sub() {
		int x = 10;
		int y = 10;
		System.out.println(x - y);

	}

	public void div() {
		int x = 10;
		int y = 10;
		System.out.println(x % y);
	}

}
