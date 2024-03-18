package Disciplinas;
import java.util.HashMap;
import java.util.Map;

import Admin.GerenciarProfessores;
import Professores.PanelProfessor.Professor;

//ADMINISTRADOR
public class Disciplina {

//Cada Disciplina vai ter seu professor! Inlcuede
//Cada Disciplina vai ter sua nota!

public Disciplina(String materia) {
    this.materia = materia;
}



    private String materia;
    private Professor professor;
    
   

    public void setProfessor(Professor professor) {
       
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
 
    public String getNome() {
        return this.materia;
    }




}
