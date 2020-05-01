package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		double preco;
		int quantidade;

		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Preço: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println("\nDados do produto: " + produto);
		System.out.print("\nEntre com o número de produtos a serem adicionados no estoque: ");
		quantidade = sc.nextInt();
		produto.adicionaProdutos(quantidade);
		System.out.println("\nAtualização de dados: " + produto);
		System.out.print("\nEntre com o número de produtos a serem removidos no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println("\nAtualização de dados: " + produto);
		sc.close();
	}

}
