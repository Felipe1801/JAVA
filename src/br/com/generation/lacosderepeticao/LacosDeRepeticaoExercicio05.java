package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio05 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
		 */
        
		Scanner digite = new Scanner(System.in);
		
		int numeroTeclado, soma;
		
		System.out.println("Digite um n�mero do teclado: ");
		soma = digite.nextInt();
		
		
		do {
			System.out.println("Digite mais um n�mero do teclado para continuar ou 0 para encerrar: ");
			numeroTeclado = digite.nextInt();
			soma += numeroTeclado;
		} 
		while (numeroTeclado != 0);
			
			System.out.println("Resultado da soma �: " + soma);
	}

}
