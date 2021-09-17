package Helloworld;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
	
		int x;
		int y;
		int sum;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter X : ");
		x = myObj.nextInt();
		System.out.println("Enter Y : ");
		y = myObj.nextInt();
		myObj.close();
		sum = x + y;
		System.out.println("Sum is " +sum);
	}
	
}
