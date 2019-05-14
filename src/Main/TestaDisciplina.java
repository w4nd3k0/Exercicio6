/*Crie uma classe de teste que contenha um main, crie uma disciplina, imprima
os atributos da disciplina.  */
package Main;
import Classes.Disciplina;

public class TestaDisciplina {
    
    public static void main(String[] args) {
        
        Disciplina D1 = new Disciplina("Carla", 1, "6º Periodo");
        
        System.out.println("Nome: " + D1.getNome());
        System.out.println("Código: " + D1.getCodigo());
        System.out.println("Período: " + D1.getPeriodo());
    }
    
}
