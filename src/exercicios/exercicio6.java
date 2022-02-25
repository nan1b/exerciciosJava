package exercicios;

import java.util.Scanner;

public class exercicio6 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x1, x2, y1, y2, eixoX, eixoY;
		double distancia;
		System.out.println("Digite os valores 1 e 2 do eixo X: ");
		x1 = ler.nextInt();
		x2 = ler.nextInt();
		
		System.out.println("Digite os valores 1 e 2 do eixo Y: ");
		y1 = ler.nextInt();
		y2 = ler.nextInt();
		
		eixoX = (int) Math.pow((x2-x1), 2);
		eixoY = (int) Math.pow((y2-y1), 2);
		distancia = Math.sqrt((eixoX + eixoY));
		
		System.out.println("A distância entre os pontos foi de: " + distancia);
	}
}
