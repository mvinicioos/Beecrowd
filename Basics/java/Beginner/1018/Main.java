import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int values[] 	= {100, 50, 20, 10, 5, 2, 1};
		int notes[] 	= {0, 0, 0, 0, 0, 0, 0};
		int input, saveInput;

		input = scanner.nextInt();
		saveInput = input;

		if(input > 0 && input < 1000000){
			for(int i = 0; i < values.length; i++){
				int rest = (input - (input % values[i])) / values[i];
				notes[i] = rest;
				input -= rest*values[i];
			}

			System.out.println(saveInput);
			for(int i = 0; i < notes.length; i++){
				System.out.println(String.format("%d nota(s) de R$ %.2f", notes[i], (double)values[i]));
			}
		}
	}
}