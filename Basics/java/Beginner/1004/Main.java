import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, produto;

        //Pegando os valores
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        //Realizando o produto
        produto = a * b;

        //Imprimindo o resultado
        System.out.printf("PROD = %d\n", produto);
        
    }
}
