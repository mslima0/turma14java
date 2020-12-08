package aula;

import java.util.Scanner;

public class tarefa1exercicio4 
{
	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	
	public static void main (String []args) 

	{ 
	Scanner leia = new Scanner (System.in);
	double A,B,C,D,R,S;
	System.out.println("A:");
	A = leia.nextDouble();
	System.out.println("B");
	B = leia.nextDouble();
	System.out.println("C");
	C = leia.nextDouble();
	
	R= (A+B)*(A+B);
	S= (B+C)*(B+C);
	D= (R+S)/2;
	System.out.println("O resultado é:"  + Math.round(D));
    }
}