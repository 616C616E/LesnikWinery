/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class Compra {
    private ArrayList<Produto> carrinho;
    private Enofilo consumidor;
    private float valorTotalFinal;
    private float valorTotal;
    private float valorDescontoTotal;
    private int codigoCompra;
    private static int auxCodigoCompra;

    public Compra(ArrayList<Produto> carrinho, Enofilo consumidor) {
        this.carrinho = carrinho;
        this.consumidor = consumidor;
        this.codigoCompra = Compra.gerarCodigoCompra();
    }

    public ArrayList getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList carrinho) {
        this.carrinho = carrinho;
    }

    public Enofilo getConsumidor() {
        return consumidor;
    }

    private void setConsumidor(Enofilo consumidor) {
        this.consumidor = consumidor;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorDescontoTotal() {
        return valorDescontoTotal;
    }

    private void setValorDescontoTotal(float valorDescontoTotal) {
        this.valorDescontoTotal = valorDescontoTotal;
    }
    
    public void gerarValorTotal(ArrayList<Produto> carrinho){
        float valorTotal = 0;
         for(Produto item : carrinho){
             valorTotal = (item.getQuantidadeCarrinho() * item.getValorUnidade());
         }
         float valorTotalFinal = valorTotal * this.verificarDesconto();
         this.setValorTotal(valorTotal);
         this.setValorTotalFinal(valorTotalFinal);
         this.setValorDescontoTotal((valorTotal - valorTotalFinal));
    }
    
    private static int gerarCodigoCompra(){
        auxCodigoCompra += 1;
        return auxCodigoCompra;
    }
    
    public void adicionarNoCarrinho(Produto item){
        if(this.carrinho.contains(item)){
            var index = carrinho.indexOf(item);
            carrinho.set(index, item);
        }else{
            this.carrinho.add(item);
        }
    }
    
    public void removerDoCarrinho(Produto item){
        if(this.carrinho.contains(item)){
            carrinho.remove(item);
        }
    }
    
    private float verificarDesconto(){
        for(Produto item : this.carrinho){
            if(item.getTipo().equals("espumante")){
                if(item.getQuantidadeCarrinho() >= 6){
                    return 0.88f;
                    
                }
            }else if (item.getTipo().equals("vinho")){
                if(item.getQuantidadeCarrinho() >= 6){
                    return 0.95f;
                }
            }
        }
        return 1;
    }

    public float getValorTotalFinal() {
        return valorTotalFinal;
    }

    private void setValorTotalFinal(float valorTotalFinal) {
        this.valorTotalFinal = valorTotalFinal;
    }
}
