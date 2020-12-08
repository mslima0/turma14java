package aula;

import java.util.Scanner;

public class tarefa1Exercicio1 
{
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

public static void main (String []args) 

	{
	Scanner leia = new Scanner (System.in);
	int dia, mes, ano, resposta;
	System.out.println("Digite o dia do seu aniversário:");
	dia = leia.nextInt();
	System.out.println("Digite o mês do seu aniversário:");
	mes = leia.nextInt();
	System.out.println("Digite o ano do seu aniversário:");
	ano = leia.nextInt();
	resposta = (365*ano)+(30*mes)+(dia);
	System.out.println("a sua idade em dias será: "+ resposta);
	}
}
