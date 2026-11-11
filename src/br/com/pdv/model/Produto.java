package br.com.pdv.model;

/**
 * Responsável por definir as regras de negócio
 * dos produtos.
 */
public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private double estoque;

    /**
     * Construtor da classe Produto.
     * @param nome Nome do produto.
     * @param descricao Descrição do produto.
     * @param preco Preço do produto.
     * @param estoque Estoque do produto.
     */
    public Produto(
        String nome,
        String descricao,
        double preco,
        double estoque
    ){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getEstoque() {
        return estoque;
    }
    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
}
