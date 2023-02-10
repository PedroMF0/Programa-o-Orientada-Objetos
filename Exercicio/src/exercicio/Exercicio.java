package exercicio;

public class Exercicio {
    public static void main(String[] args) {
        Funcionario fi = new Funcionario();
        
        fi.nome = "Carla";
        fi.salarioBase = 6327.30;
        //invocando método com retorno esem argumento
        
        fi.dobraSalario();
        //invocando metodo sem retrono e com argumento
        
        fi.descontarSalario(0);
        //invocando metodo com retrono e com argumento
        
        double ferias = fi.calcularFerias();
        //invocando metodo com retrono e com argumento
        
        double horasExtras = fi.calcularHorasExtras(15);
        
        //exibindo informações na tela
        System.out.printf("Olá, " + fi.nome + " seu salario é: %.2f" , fi.salarioBase);
        System.out.printf("\nO valor de suas férias é de: %.2f" , ferias);
        System.out.printf("\nO valor de suas horas extras é de: %.2f" , horasExtras);
        
        
        fi.dobraSalario();
        System.out.println("\nOlá, " + fi.nome + " seu salário é de " + fi.dobraSalario);
    }
}
