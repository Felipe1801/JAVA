package br.com.generation.operadoreslogicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05OperadoresLogicos {
	//Fun��o inicio 
		public static void main(String[] args) {
			Locale.setDefault(new Locale("en", "US"));
			/*
			 *   Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	respectivamente.
			 */
			
			Scanner leia = new Scanner(System.in);
			
		    double nota1, nota2, nota3, media;
		    System.out.println("Digite o valor da nota 1: ");
		    nota1 = leia.nextDouble();
		    System.out.println("Digite o valor da nota 2: ");
		    nota2 = leia.nextDouble();
		    System.out.println("Digite o valor da nota 3: ");
		    nota3 = leia.nextDouble();
	        media = (nota1*2 + nota2*3 + nota3*5) /10;
		    System.out.println("A sua m�dia final �: " + media );
		    leia.close();
		}
		
		
		
		}


