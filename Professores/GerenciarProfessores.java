package Professores;

import java.util.ArrayList;

public class GerenciarProfessores {
     private ArrayList<Professor> professorlist = new ArrayList<>();



     public void addProfessor(String nome) {
          Professor professor = new Professor(nome);
          professorlist.add(professor);
     }

     public void removerProfessor(String nome) {
          for (Professor professor : professorlist) {
               if (professor.getNome().equals(nome)) {
                    professorlist.remove(professor);
                    professor = null;
               }
          }
     }


     public StringBuilder listarProfessor() {
          StringBuilder texto = new StringBuilder("LISTAR PROFESSORES: \n");
          for (Professor professor : professorlist) {
               texto.append(professor.getNome());
          }
          return texto;
     }


     public StringBuilder procurarProfessor(String nome) {                 //QUANDO TIVER MAIS INFORMAÇÕES VAI SER MAIS UTIL.!
          StringBuilder texto = new StringBuilder("INFORMAÇÕES: \n");
          for (Professor professor : professorlist) {
               if(professor.getNome().equals(nome)) {
                    texto.append(professor.getNome());
               }
          }
          return texto;
     }

    public boolean existProfessor(String nome) {
          for (Professor professor : professorlist) {
               if(professor.getNome().equals(nome)) {
                    return true;
               } else {
                    return false;
               }
          }
          return false;
    }
     
}
