package aula;

import java.util.Scanner;

public class tarefa1Exercicio1 
{
	//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

public static void main (String []args) 

	{
	Scanner leia = new Scanner (System.in);
	int dia, mes, ano, resposta;
	System.out.println("Digite o dia do seu anivers�rio:");
	dia = leia.nextInt();
	System.out.println("Digite o m�s do seu anivers�rio:");
	mes = leia.nextInt();
	System.out.println("Digite o ano do seu anivers�rio:");
	ano = leia.nextInt();
	resposta = (365*ano)+(30*mes)+(dia);
	System.out.println("a sua idade em dias ser�: "+ resposta);
	}
}
