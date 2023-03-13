import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int segundo   = 1;
        final int minuto    = 60 * segundo;
        final int hora      = 60 * minuto;
        int tempo, h, m, s;

        tempo = scanner.nextInt();
        scanner.close();

        h       = (tempo - (tempo % hora)) / hora;
        tempo   = (tempo % hora);
        m       = (tempo - (tempo % minuto)) / minuto;
        tempo   = (tempo % minuto);
        s       = tempo;

        System.out.printf("%d:%d:%d\n", h, m, s);
        

    }
}
