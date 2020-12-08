package aula;

import java.util.Scanner;

public class FparaC //  Fahrenheit para Celsius
{
	public static void main (String []args)
	
	{
	Scanner leia = new Scanner (System.in);
	double valorCelsius, valorFahrenheit;
	System.out.print("Digite a tempuratura aqui: ");
	valorCelsius= leia.nextDouble();
	valorFahrenheit = ( valorCelsius * (9/5) + 32);
	System.out.println("Temperatura em Fahrenheit é:" + (Math.round(valorFahrenheit + 2))); // ??? COMO ACRESCENTAR , "ºF"
    }
}
