import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strEntrada, vetEntrada[];
        Double a, b, c, delta, x1, x2;

        //Entrada de dados
        /* strEntrada = scanner.nextLine();
        scanner.close(); */

        strEntrada = "10.0 20.1 5.1";

        //Quebrando a string de entrada em um vetor
        vetEntrada = strEntrada.split(" ");

        //Atribuindo os dados convertidos
        a = Double.parseDouble(vetEntrada[0]);
        b = Double.parseDouble(vetEntrada[1]);
        c = Double.parseDouble(vetEntrada[2]);
        
        //Calculando o delta
        delta = (b*b) - 4*a*c;

        if(delta >= 0 && a > 0){
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }else{
            System.out.println("Impossivel calcular");
        }
        
    }
}
