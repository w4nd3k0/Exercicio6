/*Cria uma classe Pessoa. Atributos: nome, endereço, telefone. Crie um construtor
para setar todos os atributos da classe Pessoa. Crie os gets e sets. */

package Classes;

public class Pessoa {
    
    private String Nome;
    private String Endereco;
    private String Telefone;
    
    public String getNome(){
        return this.Nome;
    }
    
    public String getEndereco(){
        return this.Endereco;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setEndereco(String e){
        this.Endereco = e;
    }
    
    public void setTelefone(String t){
        this.Telefone = t;
    }
    
    public Pessoa(String n, String e, String t){
        setNome(n);
        setEndereco(e);
        setTelefone(t);
    }
    
}
