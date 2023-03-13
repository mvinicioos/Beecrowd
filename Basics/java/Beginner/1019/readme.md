# 1018
Leia um valor inteiro, que é o **tempo de duração em segundos** de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

## Entrada
O arquivo de entrada contém um valor inteiro N.

## Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

## Solução
    Entrada:
        tempo (segundos)
        segundo = 1
        minuto = 60 * segundo
        hora = 60 * minuto

        conversões:
            mesma lógica das cédulas?

            horas = (tempo - (tempo % hora)) / hora
            tempo = (tempo % hora)
            minutos = (tempo - (tempo % minuto)) / minuto
            tempo = (tempo % minuto)
            segundos = tempo

## Exemplos
#### Exemplo 1
- 556
    - 0:9:16
