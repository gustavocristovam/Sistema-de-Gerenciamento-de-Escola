
package Alunos;

import java.util.ArrayList;
import java.util.HashMap;

import Disciplinas.Disciplina;


//ADMINISTRADOR

public class Aluno {

    private String nome;
    private ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();


   // private Disciplina disciplinas = new Disciplina();


   public void addDisciplina(Disciplina disciplina) {
            disciplinasAluno.add(disciplina);
   }

   public StringBuilder getListDisciplinasAluno() {
        StringBuilder texto = new StringBuilder(" \n \n Matérias: \n");
        for (Disciplina disciplina : disciplinasAluno) {
            texto.append(disciplina.getNome() + " : " + disciplina.getNota() + " \n");
        }
        return texto;
   }

   public void removeDisciplina(Disciplina disciplina) {

   }
   
    public Aluno(String nome) {
        this.nome = nome;
    }
  
   
    public String getNome() {
        return nome;
    }

  
    //public Disciplina getDisciplinas() {
   //     return disciplinas;
   // }

 

}