import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        final int velocidadeX = 60;
        final int velocidadeY = 90;
        int distancia;
        double tempo;
        Scanner scanner = new Scanner(System.in);

        distancia = scanner.nextInt();
        scanner.close();

        //tempo = distancia * 2;
        tempo = ((double)distancia / ((double)velocidadeY - (double)velocidadeX)) * 60;

        System.out.printf("%d minutos\n", (int)tempo);
        

    }
}
