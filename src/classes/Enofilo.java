/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Alan
 */
public class Enofilo {
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String uf;
    private String cep;
    private int codigoEnofilo;
    private static int auxCodigoEnofilo;

    public Enofilo(String nomeCompleto, String cpf, String endereco, String uf, String cep) {
        this.nomeCompleto = nomeCompleto;
        this.cep = cep;
        this.cpf = cpf;
        this.endereco = endereco;
        this.uf = uf;
        this.codigoEnofilo = Enofilo.gerarCodigoEnofilo();
    }

    public Enofilo(String nomeCompleto, String cpf, String endereco, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.uf = uf;
        this.codigoEnofilo = this.gerarCodigoEnofilo();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public int getCodigoEnofilo() {
        return codigoEnofilo;
    }
    
    private static int gerarCodigoEnofilo(){
        auxCodigoEnofilo+= 1;
        return auxCodigoEnofilo;
    }
}
