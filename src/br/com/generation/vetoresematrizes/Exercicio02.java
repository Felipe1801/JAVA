package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
		 */
		
		int[] vetor = new int[10];
		int soma=0, maior=0, quantidade=0;
	    double media;
		Scanner entrada = new Scanner(System.in);
		//registra o valor do vetor
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			if(vetor[i] > maior) {
				maior = vetor[i];
				quantidade=0;
			}
			if(vetor[i] == maior) {
			quantidade++;
		}
		}
		//mostra o valor do vetor
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[1] + " | ");
		}
		media = soma / vetor.length;
		System.out.println("A media foi: " +media);
		System.out.println("A maior pontuação foi: " +maior+ ", ele apareceu " + quantidade + "vezes.");
		
	}

	}

