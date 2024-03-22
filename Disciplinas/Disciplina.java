package Disciplinas;
import java.util.HashMap;
import java.util.Map;

import Admin.GerenciarProfessores;
import Professores.PanelProfessor.Professor;

//ADMINISTRADOR
public class Disciplina {

//Cada Disciplina vai ter seu professor! Inlcuede
//Cada Disciplina vai ter sua nota!
private static int proximoId = 1; // Compartilhada entre todas as instancias
private int id;
private String materia;
private Professor professor;


public Disciplina(String materia) {
    this.id = proximoId++;
    this.materia = materia;
    this.professor = new Professor("INDEFINIDO"); // NAO TEM PROFESSOR, DEIXARA INDEFINIDO!
}


public int getId() {
    return id;
}
   
public void setID(int id) {
    this.id = id;
}



    public void setProfessor(Professor professor) {
       
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }
 
    public String getNome() {
        return this.materia;
    }




}
