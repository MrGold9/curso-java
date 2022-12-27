package oo.composicao;

import java.util.ArrayList;

public class Compra 
{
	
	String cliente;
	
	//Criando uma lista que aceita apenas variáveis do 
	//mesmo tipo dos atributos da classe Item
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//Método para adicionar item na lista
	void adicionarItem(String nome, int quantidade, double preco) 
	{
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	//Adicionando o item na lista itens
	void adicionarItem(Item item) 
	{
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() 
	{
		double total = 0;
		
		for (Item item : itens)
		{
			total += item.quantidade * item.preco;
		}
		
		return total;
	}

}
