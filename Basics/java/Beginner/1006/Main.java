import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;
        final double peso1 = 2.0;
        final double peso2 = 3.0;
        final double peso3 = 5.0;

        //Setando a entrada de dados em ponto flutuante
        //para o padrão US
        sc.useLocale(Locale.US);

        //Entrada de dados
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        sc.close();

        //Calculando a média
        media = (peso1*n1 + peso2*n2 + peso3*n3) / (peso1 + peso2 + peso3);

        //Imprimindo a média
        System.out.printf("MEDIA = %.1f\n", media);
        
    }
}
