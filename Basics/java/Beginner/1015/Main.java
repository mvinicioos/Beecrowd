import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha1, linha2, l1[], l2[];
        double[] pontoA = {0, 0};
        double[] pontoB = {0, 0};
        double distancia;

        //Lendo as linhas
        linha1 = scanner.nextLine();
        linha2 = scanner.nextLine();
        scanner.close();

        //Quebrando as linha para separar os dados
        l1 = linha1.split(" ");
        l2 = linha2.split(" ");

        //Atribuindo os dados da coordenada A
        pontoA[0] = Double.parseDouble(l1[0]);
        pontoA[1] = Double.parseDouble(l1[1]);

        //Atribuindo os dados da coordenada B
        pontoB[0] = Double.parseDouble(l2[0]);
        pontoB[1] = Double.parseDouble(l2[1]);

        //Calculando a distância
        distancia = Math.sqrt(Math.pow(pontoB[0] - pontoA[0], 2) + Math.pow(pontoB[1] - pontoA[1], 2));

        System.out.printf("%.4f\n", distancia);
        
    }
}
