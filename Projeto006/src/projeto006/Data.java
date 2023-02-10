package projeto006;

/**
 *
 * @author 182210051
 */
public class Data {
    private byte dia;
    private byte mes;
    private int ano;
    
    public void setDia(byte dia){
        this.dia = dia;
    }
    public byte getDia(){
        return this.dia;
    }
    
    public void setMes(byte mes){
        this.mes = mes;
    }
    public byte getMes(){
        return this.mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
}
