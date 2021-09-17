package Helloworld;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		int x,y,add,sub,mult,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First NO. :");
		x = sc.nextInt();
		System.out.println("Enter your Second NO. :");
		y = sc.nextInt();
		sc.close();
		add = x + y ;
		sub = x - y ;
		mult = x * y ;
		div = x % y ;
		System.out.println("Ans : " +add);
		System.out.println("Ans : " +sub);
		System.out.println("Ans : " +mult);
		System.out.println("Ans : " +div);
	}

}
