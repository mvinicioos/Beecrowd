# 1021

## Observação
Apesar do exercício 1021 já constar como resolvido, o vídeo deu problema. Portanto, como esse exercício possui uma peculiaridade, achei interessante refazê-lo.

## Descrição
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

## Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

## Solução
    Esse exercício é semelhante ao problema das cédulas que ja foi feito, 1018 se não me engano. 

    Solução 1
    Apesar dessa solução passar por todos os testes,
    temos um erro de 100%. Poderia ser pela perda de dados na conversão na hora de imprimir, mas
    eu havia encontrado um caso teste que falha.
    Aparentemente o Beecrowd deve ter encontrado outros.

    Para o caso 3.01 o algoritmo, por algum motivo
    não resolve. No debug é possível ver a seguinte situação:

        Durante as iterações 5, 6 e 11 que são as iterações válidas para entrar no teste do laço, a iteração 11 que chega com o valor 0.01 é ignorada.

        Valor 3.01
        
        iteração 5:
            resto = 1.01
            valorUtilizado = 1x cédula 2
            valorTotal = 1.01
        
        iteração 6:
            resto = 0.01
            valorUtilizado = 1x moeda 1 real
            valorTotal = 0.01
        
        iteração 11: (ignorada)
            resto = 0.00
            valorUtilizado = 1x moeda 1 centavo
            valorTotal = 0.0

        Repararar na iteração i = 11



    1. teste se valor de entrada é maior ou igual à cédula
       1. calcula o resto da divisão
       2. remove o resto do total
       3. quantas vezes a cédula cabe nesse valor?
       4. o total passa a ser o resto

    Portanto a solução alternativa foi:
    2. seprara a parte inteira da decimal
    3. Calcular quais cédular totalizam a  decomposição do valor inteiro
    4. somar o possível 1 real que resta das cédulas na parte decimal
    5. repetir o passo 3 para a parte decimal

## Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: **Utilize ponto (.) para separar a parte decimal.**

## Exemplos
#### Exemplo 1
    576.73

    NOTAS:
    5 nota(s) de R$ 100.00
    1 nota(s) de R$ 50.00
    1 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    1 nota(s) de R$ 5.00
    0 nota(s) de R$ 2.00
    MOEDAS:
    1 moeda(s) de R$ 1.00
    1 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    2 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    3 moeda(s) de R$ 0.01

#### Exemplo 2
    4.00

    NOTAS:
    0 nota(s) de R$ 100.00
    0 nota(s) de R$ 50.00
    0 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    0 nota(s) de R$ 5.00
    2 nota(s) de R$ 2.00
    MOEDAS:
    0 moeda(s) de R$ 1.00
    0 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    0 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    0 moeda(s) de R$ 0.01

#### Exemplo 3
    91.01

    NOTAS:
    0 nota(s) de R$ 100.00
    1 nota(s) de R$ 50.00
    2 nota(s) de R$ 20.00
    0 nota(s) de R$ 10.00
    0 nota(s) de R$ 5.00
    0 nota(s) de R$ 2.00
    MOEDAS:
    1 moeda(s) de R$ 1.00
    0 moeda(s) de R$ 0.50
    0 moeda(s) de R$ 0.25
    0 moeda(s) de R$ 0.10
    0 moeda(s) de R$ 0.05
    1 moeda(s) de R$ 0.01