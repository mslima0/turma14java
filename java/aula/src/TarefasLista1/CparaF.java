package aula;

import java.util.Scanner;

public class CparaF //Celsius para Farenheit
{
	public static void main (String []args)
	{

	Scanner leia = new Scanner (System.in);

	double valorCelsius, valorFahrenheit;
	
	System.out.println("Digite a tempuratura aqui: ");
	valorFahrenheit= leia.nextDouble();
	valorCelsius = (valorFahrenheit - 32) * 5/1.8;
	System.out.println("A temperatura em Celsius é:" + (Math.round(valorCelsius + 1))); //gostaria de acrescentar "ºC"
	}	
}


