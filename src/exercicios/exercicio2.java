package exercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idadeAno, idadeDia, idadeMes;
		System.out.println("Qual a sua idade em dias?");
		idadeDia = ler.nextInt();
		
		idadeAno = idadeDia / 365;
		System.out.print("Sua idade em anos é: " + idadeAno);
		idadeMes = idadeDia / 12;
		System.out.print("\nSua idade em meses é: " + idadeMes);
	}
}
