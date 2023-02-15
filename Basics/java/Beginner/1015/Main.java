import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String args[]){
		double x1, y1, x2, y2, distance;
		String line1, line2, arrLine1[], arrLine2[];
		Scanner scanner = new Scanner(System.in);

		//Get lines
		line1 = scanner.nextLine();
		line2 = scanner.nextLine();

		//Broke lines
		arrLine1 = line1.split(" ");
		arrLine2 = line2.split(" ");

		x1 = Double.parseDouble(arrLine1[0]);
		y1 = Double.parseDouble(arrLine1[1]);
		x2 = Double.parseDouble(arrLine2[0]);
		y2 = Double.parseDouble(arrLine2[1]);

		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

		System.out.println(String.format("%.4f", distance));

	}
}