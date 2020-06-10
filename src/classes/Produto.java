/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Janise
 */
public abstract class Produto {
    private int codigoProduto;
    private int quantidadeEstoque; 
    private String nome;
    private String tipo;
    private float valorUnidade;
    private int quantidadeCarrinho;
    static int auxCodigoProduto;

    public Produto(String tipo, String nome, int quantidadeEstoque,float valorUnidade) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
        this.tipo = tipo;
        this.valorUnidade = valorUnidade;
        this.codigoProduto = Produto.gerarCodigoProduto();
        this.quantidadeCarrinho = 0;
    }

    public Produto(String tipo, String nome, int quantidadeCarrinho) {
        this.nome = nome;
        this.tipo = tipo;
        this.codigoProduto = Produto.gerarCodigoProduto();
        this.valorUnidade = 1;
        this.quantidadeCarrinho = 0;
    }
    
    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeCarrinho() {
        return quantidadeCarrinho;
    }

    public void setQuantidadeCarrinho(int quantidadeCarrinho) {
        this.quantidadeCarrinho = quantidadeCarrinho;
    }
    
    private static int gerarCodigoProduto(){
        auxCodigoProduto+= 1;
        return auxCodigoProduto;
    }
    
    abstract void alterarEstoque(int quantidade);
}
