package Helloworld;

public class A {
	public static void main(String[] args) {
		System.out.println("Print class A");
		B obj = new B();
		obj.Print2();
		B.ShowPrint();
	}

}
