package br.com.generation.polimorfismoeheranca;



public class TestaAnimais {

	public static void main(String[] args) {
		
		
		
		 Cachorro cachorro1 = new Cachorro();
		 
		 cachorro1.nome = "Scoob";
		 cachorro1.idade = 9;
         cachorro1.som = "auu auu";		 
         cachorro1.DeveCorrer = true;
         
         System.out.println("Nome: " + cachorro1.nome);
         System.out.println("Idade: " + cachorro1.idade);
         System.out.println("Som: " + cachorro1.som);
         System.out.println("Corre? " + cachorro1.DeveCorrer);
         System.out.println();
         
         Cavalo cavalo1 = new Cavalo();
         
         cavalo1.nome = "Faísca";
         cavalo1.idade = 12;
         cavalo1.som = "relincha";		 
         cavalo1.DeveCorrer = true;
         
         System.out.println("Nome: " + cavalo1.nome);
         System.out.println("Idade: " + cavalo1.idade);
         System.out.println("Som: " + cavalo1.som);
         System.out.println("Corre? " + cavalo1.DeveCorrer);
         System.out.println();
         
         Preguiça preguica1 = new Preguiça();
         
         preguica1.nome = "ai ai";
         preguica1.idade = 60;
         preguica1.som = "aaaaaaahhhh";		 
         preguica1.SubirEmArvore = true;
         
         System.out.println("Nome: " + preguica1.nome);
         System.out.println("Idade: " + preguica1.idade);
         System.out.println("Som: " + preguica1.som);
         System.out.println("Sobe em arvore? " + preguica1.SubirEmArvore);
		 		 

	}

}
