/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Suporte
 */
public class Pessoa {

    String nome;
    String corCabelo;
    String bioTipo;
    int idade;

    void imprimaDadosdePessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cor do cabelo: " + corCabelo);
        System.out.println("Biotipo: " + bioTipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcorCabelo() {
        return corCabelo;
    }

    public void setcorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getbioTipo() {
        return bioTipo;
    }

    public void setbioTipo(String bioTipo) {
        this.bioTipo = bioTipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
