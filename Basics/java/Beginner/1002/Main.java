import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;


class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		final double pi = 3.14159;
		double r;
		DecimalFormat decimalFormat = new DecimalFormat("0.####");
		
		scanner.useLocale(Locale.US);
		r = scanner.nextDouble();

		
		System.out.println(String.format("A=%.4f", pi*r*r));

	}
}