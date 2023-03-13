import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, maiorAB, maior;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        maiorAB = (a + b + Math.abs(a - b)) / 2;

        if(maiorAB > c){
            maior = maiorAB;
        }else{
            maior = c;
        }

        System.out.printf("%d eh o maior\n", maior);
        
    }
}
