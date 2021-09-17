package Helloworld;
import java.util.Scanner;

public class TypeCast16 {
	public static void main(String[] args) {
		int x ;
		
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter here");
		x = ab.nextInt();
		
		double d = x ;
		
		ab.close();
		System.out.println(x);
		System.out.println(d);
		
	}

}
