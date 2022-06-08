package br.com.generation.lacosderepeticao;

public class LacosDeRepeticaoExercicio01 {

	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
		 */
        int contador = 0;
		for(int i = 1000; i <= 1999; i++) {
			if(i%11 == 5) {
				System.out.println( i );
				contador++;
			}
		}
		System.out.println("Existem " + contador + " Números de 1000 a 1999 que quando divididos por 11 obtemos o resto 5 ");
	}

}
