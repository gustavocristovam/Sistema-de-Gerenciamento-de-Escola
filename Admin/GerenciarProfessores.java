package Admin;

import java.util.ArrayList;

import Professores.PanelProfessor.Professor;
//ADMINISTRADOR
public class GerenciarProfessores {
     private ArrayList<Professor> professorlist = new ArrayList<>();


    public ArrayList<Professor> getProfessoresObjet() {
          return professorlist;
    }

    public Professor filterProfessor(String nome) {
          for (Professor professor : professorlist) {
               if (professor.getNome().equals(nome)) {
                    return professor;
               }
     }
     return null; 
     }

     public void addProfessor(String nome) {
          Professor professor = new Professor(nome);
          professorlist.add(professor);
     }

     public void removerProfessor(String nome) {
          Professor professor = filterProfessor(nome);
          professorlist.remove(professor);
          professor = null; 
     }


     public StringBuilder listarProfessor() {
          StringBuilder texto = new StringBuilder("LISTAR PROFESSORES: \n");
          for (Professor professor : professorlist) {
               texto.append(professor.getNome());
          }
          return texto;
     }


     public Professor getObjetProfessor(String nome) {
          Professor professor = filterProfessor(nome);
          return professor;
     }

     public StringBuilder procurarProfessor(String nome) {                 //QUANDO TIVER MAIS INFORMAÇÕES VAI SER MAIS UTIL.!
          StringBuilder texto = new StringBuilder("INFORMAÇÕES: \n");
          Professor professor = filterProfessor(nome);
          texto.append(professor.getNome());  
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
