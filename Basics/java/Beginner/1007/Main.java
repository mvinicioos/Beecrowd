import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        //Pegando os valores
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        //Calculando
        diferenca = (a*b) - (c*d);

        //Imprimindo o resultado
        System.out.printf("DIFERENCA = %d\n", diferenca);
        
    }
}
