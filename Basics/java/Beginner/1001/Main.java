import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, resultado;

        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        resultado = a + b;

        System.out.printf("X = %d\n", resultado);
        
    }
}
