
package Alunos;

import Objetos.Disciplinas;



public class Aluno {

    private String nome;
    private Disciplinas disciplinas = new Disciplinas();

   
    public Aluno(String nome) {
        this.nome = nome;
    }
  
   
    public String getNome() {
        return nome;
    }

  
    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

 

}