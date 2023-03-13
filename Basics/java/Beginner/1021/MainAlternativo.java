import java.util.Scanner;
import java.util.Locale;

/**
 * A solução poderia ser realizada com apenas 3 vetores
 * contínuos, porém, em algum momento do vídeo poderia ficar
 * uma leitura difícil.
 */

class MainAlternativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorEntrada = 0;
        int valorInteiro, valorDecimal;
        int[] valoresInteiros = {
            100, 50, 20, 10, 5, 2
        };
        int[] valoresDecimais = {
            100, 50, 25, 10, 5, 1
        };

        int[] valoresInteirosUsados = {
            0, 0, 0, 0, 0, 0
        };

        int[] valoresDecimaisUsados = {
            0, 0, 0, 0, 0, 0
        };

    
         String[] modeloValoresInteiros = {
            "100.00", "50.00", "20.00", "10.00", "5.00", "2.00"
         };
         String[] modeloValoresDecimais = {
            "1.00", "0.50", "0.25", "0.10", "0.05", "0.01"
         };


        scanner.useLocale(Locale.US);
        valorEntrada = scanner.nextDouble();
        scanner.close();
        
        //Separando a parte inteira
        valorInteiro = (int)valorEntrada;

        //Separando a parte decimal
        valorDecimal = (int)(valorEntrada*100 - valorInteiro*100);
        
        /*
         * O seguinte bloco percorre todos valores
         * contabilizando quanto de cada um contém
         * dentro do valor informado.
         * 
         * Cada vez que um valor está contido dentro 
         * do valor total, esse valor é removido
         * do valor total.
         */
        //Para inteiros
        for(int i = 0; i < valoresInteiros.length; i++){
            if(valorInteiro >= valoresInteiros[i]){
                //Execução do algoritmo
                int resto = valorInteiro % valoresInteiros[i];
                valoresInteirosUsados[i] = (int)((valorInteiro - resto) / valoresInteiros[i]);
                valorInteiro = resto;
            }
        }
        /**
         * Soma a parte restante dos inteiros aos decimais,
         * pois não existe a cédula de 1 real, sendo assim,
         * qualquer valor que contenha a unidade 1, terá sobras.
         */
        valorDecimal += valorInteiro * 100;

        //Para decimais
        for(int i = 0; i < valoresDecimais.length; i++){
            if(valorDecimal >= valoresDecimais[i]){
                //Execução do algoritmo
                int resto = valorDecimal % valoresDecimais[i];
                valoresDecimaisUsados[i] = (int)((valorDecimal - resto) / valoresDecimais[i]);
                valorDecimal = resto;
            }
        }
        
        System.out.println("NOTAS:");
        for(int i = 0; i < valoresInteiros.length; i++){
            System.out.printf("%d nota(s) de R$ %s\n", valoresInteirosUsados[i], modeloValoresInteiros[i]);
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < valoresDecimais.length; i++){
            System.out.printf("%d moeda(s) de R$ %s\n", valoresDecimaisUsados[i], modeloValoresDecimais[i]);
        }
    }
}