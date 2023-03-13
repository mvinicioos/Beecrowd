import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int consumo = 12;
        int velocidade, tempo, distancia;
        double litros;

        tempo = scanner.nextInt();
        velocidade = scanner.nextInt();
        scanner.close();

        distancia = velocidade * tempo;
        litros = (double)distancia / (double)consumo;

        System.out.printf("%.3f\n", litros);
        
    }
}
