import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int dia = 1;
        final int mes = 30 * dia;
        final int ano = 365;
        int totalDias, qtdAnos, qtdMeses, qtdDias, resto;

        totalDias = scanner.nextInt();
        scanner.close();

        //Calculando a quantidade de anos
        resto       = totalDias % ano;
        qtdAnos     = (totalDias - resto) / ano;
        totalDias   = resto;

        //Calculando a quantidade de meses
        resto       = totalDias % mes;
        qtdMeses    = (totalDias - resto) / mes;
        totalDias   = resto;

        //O restante são os dias
        qtdDias = resto;

        System.out.printf("%d ano(s)\n", qtdAnos);
        System.out.printf("%d mes(es)\n", qtdMeses);
        System.out.printf("%d dia(s)\n", qtdDias);
        
    }
}
