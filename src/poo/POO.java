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
public class POO {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setnumPortas(4);
        meuCarro.setPlaca("ASDA-1232");
        meuCarro.setTipo("Gol");
        
        meuCarro.imprimeDadosdoCarro();

        
        Pessoa Pessoa = new Pessoa();
        
        Pessoa.setIdade(17);
        Pessoa.setNome("Guilherme");
        Pessoa.setbioTipo("Bombado");
        Pessoa.setcorCabelo("Castanho");
        
        Pessoa.imprimaDadosdePessoa();
        
        Barco barco = new Barco();
        
        barco.setCor("Azul");
        barco.setMaterial("Madeira");
        barco.setqtdPessoas(2);
        barco.setTipo("Canoa");
        
        barco.imprimeDadosdoBarco();
    }
    
}
