import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a, b, x;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("X = " + String.valueOf(a+b));

		scanner.close();
	}
}