import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorEntrada = 0;
        double[] valores = {
            100, 50, 20, 10, 5, 2,
            1, 0.5, 0.25, 0.1, 0.5, 0.01
        };

        int[] valoresUsados = {
            0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0
        };

        /**
         * No exercício das cédulas, houve um problema
         * quanto a impressão dos valores, que, 
         * segundo o enunciado desse, deixa claro
         * a necessidade de imprimir valores decimais
         * com ponto. 
         * 
         * O Locale não muda a saída de dados, portanto
         * deve haver outra forma de mascarar essa vírgula
         * do valor decimal.
         * 
         * Sendo assim, aqui vai uma mini gambiarra para ver
         * se o exercício será aceito dessa forma
         */


         String[] modeloValores = {
            "100.00", "50.00", "20.00", "10.00", "5.00", "2.00",
            "1.00", "0.50", "0.25", "0.10", "0.05", "0.01"
         };


        scanner.useLocale(Locale.US);
        valorEntrada = scanner.nextDouble();
        scanner.close();
        

        /*
         * O seguinte bloco percorre todos valores
         * contabilizando quanto de cada um contém
         * dentro do valor informado.
         * 
         * Cada vez que um valor está contido dentro 
         * do valor total, esse valor é removido
         * do valor total.
         */
        for(int i = 0; i < valores.length; i++){
            if(valorEntrada >= valores[i]){
                //Execução do algoritmo
                double resto = valorEntrada % valores[i];
                valoresUsados[i] = (int)((valorEntrada - resto) / valores[i]);
                valorEntrada = resto;
            }
        }

        /**
         * Dados que a quantidade de cada valor
         * já estão dispostos dentro do vetor
         * valoresUsados, agora só temos que
         * imprimir os valores, de acordo com o exercício.
         * 
         * Do inicio até metade do vetor, que é onde
         * estão representadas as notas.
         * modelo de notas:
         *  5 nota(s) de R$ 100.00
         * 
         * O restante para a representação das moedas.
         * modelo de moedas:
         *  1 moeda(s) de R$ 1.00
         */
        System.out.println("NOTAS:");
        for(int i = 0; i < valoresUsados.length / 2; i++){
            System.out.printf("%d nota(s) de R$ %s\n", valoresUsados[i], modeloValores[i]);
        }

        System.out.println("MOEDAS:");
        for(int i = valoresUsados.length/2; i < valoresUsados.length; i++){
            System.out.printf("%d moeda(s) de R$ %s\n", valoresUsados[i], modeloValores[i]);
        }
        


    }
}