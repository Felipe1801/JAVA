package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticaoExercicio04 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
        
		 */
    
	int idade, sexo, personalidade, i=0, masculino=0, feminino=0, outros=0, calmo=0, nervoso=0, agressivo=0, mulherNervosa=0;
	int	homemAgressivo=0, outrosCalmos=0, maisQuarentaN=0, menosDezoitoC=0,numeroPessoas=0;
	Scanner in = new Scanner(System.in);		
	System.out.println("Informe o n�mero de pessoas que ser�o pesquisadas: ");
	numeroPessoas = in.nextInt();
			
	
			
	while(i < numeroPessoas) {
		System.out.println("Informe sua idade: ");
		idade = in.nextInt();
		System.out.println("Informe seu genero. \n1 - Masculino |2 - Feminino |3 - Outros");
		sexo = in.nextInt();
		switch(sexo) {
		case 1:
			masculino++;
			break;
		case 2:	
			feminino++;
			break;
		case 3:	
			outros++;
			break;
		}
		
		System.out.println("Qual seu tipo de personalidade\n1 - Calmo |2 - Nervoso|3 - Agressivo");
		personalidade = in.nextInt();
		if(personalidade == 1) {
			calmo++;
		}
		if(personalidade == 2) {
			nervoso++;
		}	
		if(personalidade == 3) {
			agressivo++;
		}
		if(sexo == 2 && personalidade ==2) {
			mulherNervosa++;
		}
		if(sexo == 1 && personalidade ==3) {
			homemAgressivo++;
		}
		if(sexo == 3 && personalidade ==1)	{
			outrosCalmos++;
		}
		if(idade > 40 && personalidade ==2) {
			maisQuarentaN++;	
		}
		if(idade < 18 && personalidade ==3) {
			menosDezoitoC++;
		}
		
		i++;
	}
	
	System.out.println(  "n�mero de pessoas calmas: " +calmo+ "\r\n"
	                   + "n�mero de mulheres nervosas: " +mulherNervosa+ "\r\n"
	                   + " n�mero de homens agressivos: " +homemAgressivo+  "\r\n"
	                   + " n�mero de outros calmos: " +outrosCalmos+  "\r\n" 
	                   + " n�mero de pessoas nervosas com mais de 40 anos: " +maisQuarentaN+ "\r\n"
	                   + " n�mero de pessoas calmas com menos de 18 anos." +menosDezoitoC ); 
	}
}
