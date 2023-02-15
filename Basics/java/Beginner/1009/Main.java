import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;



class Main{
	public static void main(String args[]){
		String name;
		double salary, solds, finalSalary;
		Scanner scanner = new Scanner(System.in);

		scanner.useLocale(Locale.US);

		//Get values
		name 	= scanner.next();
		salary 	= scanner.nextDouble();
		solds 	= scanner.nextDouble();
		
		finalSalary = salary + (0.15 * solds);

		System.out.println(String.format("TOTAL = R$ %.2f", finalSalary));
		
	}
}