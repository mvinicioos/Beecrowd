import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, soma;

        //Pegando os valores;
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        //Efetuando a soma
        soma = a + b;

        //Imprimindo os valores
        System.out.printf("SOMA = %d\n", soma);
        

    }
}
