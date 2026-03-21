------------------------------------------------------------------------------------------------------------
Desafio 1 - Verificação de Vogal ou Consoante em Java

Faça um programa em Java que verifique se uma letra digitada é uma vogal ou consoante.
O programa deverá seguir as seguintes regras

  - Solicitar ao usuário que insira uma letra.
  - Verificar se o caractere inserido é uma letra do alfabeto.
  - Caso o usuário tenha inserido um caractere válido ( ou seja, uma letra do alfabeto), o programa
    deverá identificar e informar se essa letra é uma vogal ou uma consoante.
  - Caso o usuário insira um valor inválido (como números, símbolos ou mais de um caractere), o programa
    deverá exibir uma mensagem de erro, informando que a entrada é inválido e pedindo para que ele insira
    apenas uma letra
------------------------------------------------------------------------------------------------------------

Desafio 2 - Faça um Programa que leia um número e exiba o dia correspondente da semana.
  
  O programa deverá seguir as seguintes regras:
  
  Solicitar ao usuário que insira um número de 1 a 7.
  O programa deve exibir o dia da semana correspondente ao número
  inserido, conforme a tabela abaixo:
  
  1 - Domingo
  2 - Segunda-feira
  3 - Terça-feira
  4 - Quarta-feira
  5 - Quinta-feira
  6 - Sexta-feira
  7 - Sábado
  
  Caso o usuário insira um número fora desse intervalo (ou seja, um
  número menor que 1 ou maior que 7), o programa deverá
  exibir a mensagem "Valor inválido", indicando que o número
  não corresponde a um dia da semana.
  
  O programa deve garantir que a entrada seja um número válido.
  
  Se o usuário inserir um valor que não seja numérico (como
  letras ou símbolos), o programa deve exibir uma
  mensagem de erro apropriada.
------------------------------------------------------------------------------------------------------------

  Desafio 3 - Faça um Programa que peça uma nota, entre zero e dez.
  
   O programa deverá seguir as seguintes regras:
  
   - Solicitar ao usuário que insira uma nota entre 0 e 10.
   - Verificar se o valor inserido é válido, ou seja, se está dentro
     do intervalo de 0 a 10, incluindo os extremos.
   - Se o valor inserido for inválido (menor que 0, maior que 10 ou não for numérico),
     o programa deverá exibir uma mensagem de erro e continuar pedindo a nota
     até que o usuário insira um valor válido.
   - Quando um valor válido for inserido, o programa deverá encerrar e exibir
     uma mensagem confirmando a nota válida inserida.
------------------------------------------------------------------------------------------------------------

   Desafio 4 - Faça um Programa que leia uma quantidade indeterminada de
   números positivos e conte quantos deles estão nos
   seguintes intervalos:
  
   [0-25]
   [26-50]
   [51-75]
   [76-100]
  
   O programa deverá seguir as seguintes regras:
  
   - Solicitar que o usuário insira números positivos.
   - Classificar cada número inserido dentro dos intervalos acima.
   - A entrada de números deve continuar até que o usuário
     insira um número negativo.
   - Ao inserir um número negativo, a leitura deve ser
     encerrada, e o programa deve exibir a contagem de
     números em cada intervalo.
   - Se o usuário inserir um número maior que 100, ele será
     ignorado e não contará para nenhum dos intervalos.
   - Ao final, exibir quantos números pertencem a cada um dos intervalos.
------------------------------------------------------------------------------------------------------------

Desafio 5 - Faça um Programa que leia um vetor de 10 números reais e os
   mostre na ordem inversa.
  
   O programa deve seguir as seguintes regras:
  
   - Solicitar que o usuário insira 10 números reais.
   - Armazenar os números inseridos em um vetor (ou lista).
   - Após o usuário inserir todos os 10 números, o programa deve
     exibir os números na ordem inversa em que foram inseridos.
   - Certificar-se de que os números podem ser reais (incluindo
     números com casas decimais).
------------------------------------------------------------------------------------------------------------

Desafio 6 - Faça um Programa que leia 20 números inteiros e
   armazene-os num vetor.
  
   O programa deve seguir as seguintes regras:
  
   - Solicitar que o usuário insira 20 números inteiros.
   - Armazenar todos os números em um vetor principal.
   - Separar os números pares e armazená-los em um vetor chamado PAR.
   - Separar os números ímpares e armazená-los em um vetor chamado IMPAR.
  
   Após o usuário inserir os 20 números, o programa deve exibir os três vetores:
   - O vetor principal contendo todos os números inseridos.
   - O vetor PAR contendo apenas os números pares.
   - O vetor IMPAR contendo apenas os números ímpares.
------------------------------------------------------------------------------------------------------------

Desafio 7 - Faça um Programa que peça as quatro notas de 10 alunos,
   calcule e armazene num vetor a média de cada aluno e
   imprima o número de alunos com média maior ou igual a 7.0.
  
   O programa deve seguir as seguintes regras:
  
   - Solicitar que o usuário insira quatro notas para cada um dos 10 alunos.
   - Calcular a média de cada aluno e armazená-la num vetor.
   - Contar quantos alunos têm média maior ou igual a 7.0.
   - Ao final, exibir a quantidade de alunos com média maior ou igual a 7.0.
------------------------------------------------------------------------------------------------------------

Desafio 8 - Construa uma função que receba uma data no formato DD/MM/AAAA e
   devolva uma string no formato D de mêsPorExtenso de AAAA.
  
   Se a data for inválida (por exemplo, se o mês ou o dia não existirem), a
   função deverá retornar NULL.
  
   A função deve considerar os meses por extenso como: "Janeiro", "Fevereiro", etc.
------------------------------------------------------------------------------------------------------------

Desafio 9 - Faça um Programa que leia 2 strings e informe:
  
   - O conteúdo de cada string seguido do seu comprimento.
   - Se as duas strings possuem o mesmo comprimento.
   - Se as duas strings possuem o mesmo conteúdo.
  
   O programa deve seguir as seguintes regras:
  
   1. Solicitar ao usuário que insira duas strings.
   2. Para cada string, exibir o conteúdo e o comprimento.
   3. Verificar se as strings têm o mesmo comprimento e
      se possuem o mesmo conteúdo.
   4. Exibir se elas têm o mesmo comprimento e se são
      iguais ou diferentes no conteúdo.
------------------------------------------------------------------------------------------------------------

  Desafio 10. Leonardo o Pescador comprou um microcomputador para
   controlar o rendimento diário de seu trabalho.
  
   Sempre que ele traz um peso de peixes maior que o estabelecido pelo
   regulamento de pesca do estado de São Paulo (50 quilos),
   ele deve pagar uma multa de R$ 8,00 por quilo excedente.
  
   O programa deve seguir as seguintes regras:
  
   - Solicitar que o usuário insira o peso total de peixes pescados em quilos.
   - Se o peso for maior que 50 quilos, calcular o excesso e o valor da multa.
   - Armazenar a quantidade de quilos excedentes na variável excesso.
   - Armazenar o valor da multa na variável multa (R$ 8,00 por quilo excedente).
   - Exibir o peso total, o excesso (se houver) e o valor da multa (se houver).
------------------------------------------------------------------------------------------------------------

