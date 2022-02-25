package exercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, idadeEmDia;
		System.out.println("Qual a sua idade?");
		idade = ler.nextInt();
		
		idadeEmDia = idade * 365;
		System.out.print("\nSua idade em dias é: " + idadeEmDia);
	}
}
