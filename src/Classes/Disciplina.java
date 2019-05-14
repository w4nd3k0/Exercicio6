/*Cria uma classe Disciplina. Atributos: nome, código e período. Crie um construtor
para setar todos os atributos da classe Disciplina. Crie os gets e sets. */

package Classes;


public class Disciplina {
    
    private String Nome;
    private int Codigo;
    private String Periodo;
    
    
    public String getNome(){
        return this.Nome;
    }
    
    public int getCodigo(){
        return this.Codigo;
    }
    
    public String getPeriodo(){
        return this.Periodo;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setCodigo(int c){
        this.Codigo = c;
    }
    
    public void setPeriodo(String p){
        this.Periodo = p;
    }
    
    public Disciplina(String n, int c, String p){
        setNome(n);
        setCodigo(c);
        setPeriodo(p);
    }
    
}
