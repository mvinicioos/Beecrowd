import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

class Main{
	public static void main(String args[]){
		double g1, g2, g3, average;
		double w1 = 2, w2 = 3, w3 = 5;
		Scanner scanner = new Scanner(System.in);

		scanner.useLocale(Locale.US);
		
		g1 = scanner.nextDouble();
		g2 = scanner.nextDouble();
		g3 = scanner.nextDouble();

		average = (w1*g1 + w2*g2 + w3*g3)/(w1+w2+w3);

		System.out.println(String.format("MEDIA = %.1f", average));

	}
}