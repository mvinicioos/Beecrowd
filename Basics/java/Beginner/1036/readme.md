# 1036
**Leia 3 valores de ponto flutuante** e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

## Entrada
Leia três valores de ponto flutuante (double) A, B e C.

## Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

## Solução
    Fórmula:
    delta = (b*b) - 4*a*c
    x1 = (-b + sqrt(delta)) / 2*a
    x2 = (-b - sqrt(delta)) / 2*a

    Não é possível calcular:
        a == 0
        delta < 0

## Exemplos
#### Exemplo 1
    10.0 20.1 5.1

    R1 = -0.29788
    R2 = -1.71212

#### Exemplo 2
    0.0 20.0 5.0

    Impossivel calcular

#### Exemplos 3
    10.3 203.0 5.0

    R1 = -0.02466
    R2 = -19.68408

#### Exemplo 4
    10.0 3.0 5.0

    Impossivel calcular