package Helloworld;
import java.util.Scanner;

public class B {
	private void Add() {
		int x,y,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number : ");
		x = sc.nextInt();
		System.out.println("Enter your Secont number : ");
		y = sc.nextInt();
		sc.close();
		sum = x + y;
		System.out.println("Sum is : " +sum);
	}
	public void Print2() {
		Add();
		System.out.println("Print class B Print2");
	}
	public static void ShowPrint() {
		System.out.println("ShowPrint is Runing");
	}

}
