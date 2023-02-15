import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

class Main{
	public static void main(String args[]){
		double n1, n2, media;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		

		media = (3.5*n1+7.5*n2)/11;

		System.out.println(String.format("MEDIA = %.5f\n", media));

	}
}