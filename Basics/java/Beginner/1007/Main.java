import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int a, b, c, d, difference;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();

		difference = (a*b) - (c*d);
		System.out.println(String.format("DIFERENCA = %d", difference));
	}
}