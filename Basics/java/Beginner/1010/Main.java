import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade1, quantidade2;
        double val1, val2, total;
        String entrada1, entrada2, linha1[], linha2[];

        //Entrada dos dados
        entrada1 = scanner.nextLine();
        entrada2 = scanner.nextLine();
        scanner.close();

        //Quebrar os dados em um vetor
        linha1 = entrada1.split(" ");
        linha2 = entrada2.split(" ");

        quantidade1 = Integer.parseInt(linha1[1]);
        val1        = Double.parseDouble(linha1[2]);

        quantidade2 = Integer.parseInt(linha2[1]);
        val2        = Double.parseDouble(linha2[2]);

        //Cálculo do total
        total = ((double)quantidade1 * val1) + ((double)quantidade2 * val2);

        //Saída dos dados
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
    }
}
