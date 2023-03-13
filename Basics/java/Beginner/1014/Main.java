import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia;
        double gasto, media;

        //Setando o locale para o padrão US
        scanner.useLocale(Locale.US);

        distancia   = scanner.nextInt();
        gasto       = scanner.nextDouble();
        scanner.close();

        media = distancia / gasto;

        System.out.printf("%.3f km/l\n", media);
        
    }
}
