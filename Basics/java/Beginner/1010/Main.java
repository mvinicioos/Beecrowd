import java.io.IOException;
import java.util.Scanner;


class Main{
	public static void main(String args[]){
		String 	line1, line2, l1[], l2[];
		int 	qtd1, qtd2;
		double 	v1, v2;
		Scanner scanner = new Scanner(System.in);

		//get values
		line1 = scanner.nextLine();
		line2 = scanner.nextLine();

		l1 = line1.split(" ");
		l2 = line2.split(" ");

		//Get the integers
		qtd1 = Integer.parseInt(l1[1]);
		qtd2 = Integer.parseInt(l2[1]);

		//Get the floats
		v1 = Double.parseDouble(l1[2]);
		v2 = Double.parseDouble(l2[2]);

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", qtd1*v1 + qtd2*v2));


	}
}