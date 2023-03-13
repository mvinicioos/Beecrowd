import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String strAceitos = "Valores aceitos";
        final String strNaoAceitos = "Valores nao aceitos";
        Scanner scanner = new Scanner(System.in);
        String strEntrada, strSaida, vetEntrada[];
        int a, b, c, d;
        
        
        //Entrada da linha de dados
        strEntrada = scanner.nextLine();

        //Quebrando a linha de dados em um vetor
        vetEntrada = strEntrada.split(" ");

        //Convertendo o vetor de dados e fazendo as devidas atribuições
        a = Integer.parseInt(vetEntrada[0]);
        b = Integer.parseInt(vetEntrada[1]);
        c = Integer.parseInt(vetEntrada[2]);
        d = Integer.parseInt(vetEntrada[3]);

        //Por principio os valores não são aceitos
        strSaida = strNaoAceitos;

        if(b > c && d > a){
            if(c + d > b + a){
                if(c > 0 && d > 0 && a % 2 == 0){
                    //Valores aceitos
                    strSaida = strAceitos;
                }
            }
        }

        System.out.println(strSaida);
        
    }
}
