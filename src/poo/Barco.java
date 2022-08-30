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
public class Barco {

    String tipo;
    String cor;
    String material;
    int qtdPessoas;
    
    void imprimeDadosdoBarco(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Cor: "+cor);
        System.out.println("Material: "+material);
        System.out.println("Quantidade de pessoas: "+qtdPessoas);
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo (String tipo){
        this.tipo=tipo;
    }
    public String getCor(){
        return cor;
    }
    
    public void setCor (String cor){
        this.cor=cor;
    }
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial (String material){
        this.material=material;
    }
    public int getqtdPessoas(){
        return qtdPessoas;
    }
    
    public void setqtdPessoas (int qtdPessoas){
        this.qtdPessoas=qtdPessoas;
    }
}
