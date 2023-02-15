import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int x, y, prod;

		x = scanner.nextInt();
		y = scanner.nextInt();

		System.out.println(String.format("PROD = %d", x*y));

	}
}