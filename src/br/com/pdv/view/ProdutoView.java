package br.com.pdv.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.pdv.model.Produto;

/**
 * Responsável pela interação com o usuário,
 * via terminal, nas operações relacionadas
 * aos produtos.
 */
public class ProdutoView {
    /**
     * Exibe as informações dos produtos.
     * 
     * @param produtos Produtos a serem exibidos.
     */
    public void exibirProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return; // encerra a execução do método
        }

        System.out.println("=== INFORMAÇÕES DOS PRODUTOS ===");

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("------------------");
        }

    }


    public Produto cadastrarProduto(Scanner scanner){
        System.out.println("=== CADASTRAR PRODUTO ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Estoque: ");
        double estoque = scanner.nextDouble();

        return new Produto(nome, descricao, preco, estoque);
    }
}
