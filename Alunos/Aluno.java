
package Alunos;

import java.util.ArrayList;
import java.util.HashMap;

import Disciplinas.Disciplina;


//ADMINISTRADOR

public class Aluno {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();
    
    public Aluno(String nome) {
        this.nome = nome;
        this.id = proximoId++;
    }
   

   // private Disciplina disciplinas = new Disciplina();
    public int getId() {
        return id;
    }
   

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
   
    
  
   
    public String getNome() {
        return nome;
    }

  
    //public Disciplina getDisciplinas() {
   //     return disciplinas;
   // }

 

}