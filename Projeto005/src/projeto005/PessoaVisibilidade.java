/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto005;

/**
 *
 * @author 182210051
 */
public class PessoaVisibilidade {
    public String nome;
    private int idade;
    private double peso;
    
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    
}
    
