import java.util.Scanner;
import java.util.Locale;

class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int idFuncionario, horas;
            double valorHora, salario;

            //Entradade dados padrão US
            scanner.useLocale(Locale.US);

            //Entrada de dados
            idFuncionario   = scanner.nextInt();
            horas           = scanner.nextInt();
            valorHora       = scanner.nextDouble();
            scanner.close();

            //Cálculo do salário
            salario = (double)horas * valorHora;

            System.out.printf("NUMBER = %d\n", idFuncionario);
            System.out.printf("SALARY = U$ %.2f\n", salario);
            
        }
}
