import java.util.Scanner;

class Main{
    public static void main(String[] args){
        final double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        String linha, linhaSplit[];
        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        //Entrada de dados
        linha = scanner.nextLine();
        scanner.close();

        //Split dos dados
        linhaSplit = linha.split(" ");

        //Atribuição dos dados
        a = Double.parseDouble(linhaSplit[0]);
        b = Double.parseDouble(linhaSplit[1]);
        c = Double.parseDouble(linhaSplit[2]);

        //Cálculo das áreas
        areaTriangulo = (a * c)/2;
        areaCirculo = pi * (c*c);
        areaTrapezio = ((a+b)*c)/2;
        areaQuadrado = b*b;
        areaRetangulo = a * b;

        //Saída dos dados
        System.out.printf("TRIANGULO: %.3f\n",  areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n",    areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",   areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n",   areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n",  areaRetangulo);
        
    }
}
