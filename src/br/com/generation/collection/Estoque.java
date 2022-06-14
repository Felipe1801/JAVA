package br.com.generation.collection;

/*
 * Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

public class Estoque {
	private double pre�o;
	private int quantidade;
	private String nome;
	private double peso;
	
	
	public Estoque(String nome,Double pre�o, int quantidade, double peso) {
		this.pre�o = pre�o;
		this.quantidade = quantidade;
		this.nome = nome;
		this.peso = peso;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Estoque [nome=" + nome + ", pre�o=" + pre�o + ", quantidade=" + quantidade + ", peso=" + peso + "]";
	}
	
	


}
