package projeto011;

import java.util.ArrayList;
public class Projeto011 {

   private String nome;
   private ArrayList hobby;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList hobby) {
        this.hobby = hobby;
    }

    
   
   public String toString(){
    return "\nNome:" + this.nome + "\nHobby:" + this.hobby;   
   }
    
}
