import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double taxaBonus = 0.15;
        double salario, vendas;
        //Entrada de dados padrão US
        scanner.useLocale(Locale.US);

        salario = scanner.nextDouble();
        vendas  = scanner.nextDouble();
        scanner.close();

        //Cálculo salário
        salario += vendas * taxaBonus;

        //Saída dos dados
        System.out.printf("TOTAL = R$ %.2f\n", salario);
        

    }
}
