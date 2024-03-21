package Professores.PanelProfessor;
import Disciplinas.Disciplina;

public class Professor {

    private static int proximoId = 1;
    private int id;
    private String nome = "Default";
   
    public Professor(String nome) {
        this.nome = nome;
        this.id = proximoId++;
    }

    public int getId() {
        return id;
    }
       
    public String getNome() {
        return this.nome;
    }


  

}
