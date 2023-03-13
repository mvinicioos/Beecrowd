# 1020
Leia um **valor inteiro correspondente à idade de uma pessoa em dias** e informe-a em **anos**, **meses** e **dias**

Obs.: apenas para facilitar o cálculo, considere todo **ano com 365 dias** e todo **mês com 30 dias**. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

## Entrada
O arquivo de entrada contém um valor inteiro.

## Saída
Imprima a saída conforme exemplo fornecido.

## Solução
    Semelhante ao exercício de calcular o tempo:

    dia = 1
    mes = 30
    ano = 365

    Solução pelo resto da divisão

    resto = (quantidadeDias % ano)
    total anos = (quantidade - resto) / ano
    quantidadeDias = resto

    Repetindo o processo para meses e dias

## Exemplos
#### Exemplo 1
    Entrada:
        400
    Saída:
        1 ano(s)
        1 mes(es)
        5 dia(s)

#### Exemplo 2
    Entrada
        800
    Saída
        2 ano(s)
        2 mes(es)
        10 dia(s)

#### Exemplo 3
    Entrada
        30
    Saída
        0 ano(s)
        1 mes(es)
        0 dia(s)
