import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int x, y, sum;

		x = scanner.nextInt();
		y = scanner.nextInt();

		System.out.println(String.format("SOMA = %d", x+y));
	}
}