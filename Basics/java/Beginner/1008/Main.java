import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

class Main{
	public static void main(String args[]){
		int number;
		int hours;
		float amountPerHours, salary;
		Scanner scanner = new Scanner(System.in);

		scanner.useLocale(Locale.US);

		//Get values
		number = scanner.nextInt();
		hours = scanner.nextInt();
		amountPerHours = scanner.nextFloat();


		salary = hours*amountPerHours;

		System.out.println(String.format("NUMBER = %d", number));
		System.out.println(String.format("SALARY = U$ %.2f", salary));
	}
}