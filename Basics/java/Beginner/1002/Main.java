import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        double r = 0;
        double area = 0;

        //Setando o locale
        scanner.useLocale(Locale.US);

        //Pegando os dados
        r = scanner.nextDouble();
        scanner.close();

        //Calculando a área
        area = pi*(r*r);

        //Imprimindo o resultado
        System.out.printf("A=%.4f\n", area);
        

    }
}
