
package Alunos;

import Disciplinas.Disciplina;



public class Aluno {

    private String nome;
   // private Disciplina disciplinas = new Disciplina();

   
    protected Aluno(String nome) {
        this.nome = nome;
    }
  
   
    public String getNome() {
        return nome;
    }

  
    //public Disciplina getDisciplinas() {
   //     return disciplinas;
   // }

 

}