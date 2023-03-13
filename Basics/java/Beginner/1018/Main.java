import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, bkpValor;
        int[] cedulas = {
            100, 50, 20, 10, 5, 2, 1
        };

        int[] quantidadeCedulas = {
            0, 0, 0, 0, 0, 0, 0
        };

        valor = scanner.nextInt();
        bkpValor = valor;
        scanner.close();

        //Percorrendo as notas
        for(int i = 0; i < cedulas.length; i++){
            int resto = valor % cedulas[i];
            quantidadeCedulas[i] = (int)((valor - resto) / cedulas[i]);
            valor = resto;
        }

        //Imprimindo o resultado
        System.out.printf("%d\n", bkpValor);
        for(int i = 0; i < quantidadeCedulas.length; i++){
            //Problemas de conversão?
            //Gambiarra
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeCedulas[i], cedulas[i]);
            
        }
    }
}
