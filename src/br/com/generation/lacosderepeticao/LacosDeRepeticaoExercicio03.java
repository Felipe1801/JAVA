package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio03 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
		 */
		
		int idade = 0, menos21 = 0, mais50 = 0;
		Scanner in = new Scanner(System.in); //solicita�ao de input
		while (idade != -99) { //condi��o de repeti�ao
			System.out.println("Informe sua idade: ");
			idade = in.nextInt(); //recebe a idade do usuario
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			if(idade > 50) {
				mais50++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 �: " + menos21);
		System.out.println("O total de pessoas com mais de 50 � : " + mais50);
	}

}
