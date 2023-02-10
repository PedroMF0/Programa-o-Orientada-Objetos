package exercicio;
public class Funcionario {

    public String nome;
    public double dobraSalario;
    public double salarioBase;
    //sem retorno e sem argumento
    
    public void dobraSalario(){
    this.dobraSalario = this.salarioBase*2;
    }
    //com retorno e sem argumento
    
    public double calcularFerias(){
        return this.salarioBase *1.33;
    }
    //sem retrono e com argumento
        
    public void descontarSalario(double valor){
        this.salarioBase = this.salarioBase - valor;
    }
    //com retorno e com argumento
    
    public double calcularHorasExtras(double totalHoras){
        return this.salarioBase/220 * 2 * totalHoras;
    }
}
    
