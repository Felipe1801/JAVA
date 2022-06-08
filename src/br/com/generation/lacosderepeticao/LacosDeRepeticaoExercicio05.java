package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio05 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
		 */
        
		Scanner digite = new Scanner(System.in);
		
		int numeroTeclado, soma;
		
		System.out.println("Digite um número do teclado: ");
		soma = digite.nextInt();
		
		
		do {
			System.out.println("Digite mais um número do teclado para continuar ou 0 para encerrar: ");
			numeroTeclado = digite.nextInt();
			soma += numeroTeclado;
		} 
		while (numeroTeclado != 0);
			
			System.out.println("Resultado da soma é: " + soma);
	}

}
