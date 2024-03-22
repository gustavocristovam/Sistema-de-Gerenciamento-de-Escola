package Admin;

import java.util.ArrayList;

import Professores.PanelProfessor.Professor;
//ADMINISTRADOR
public class GerenciarProfessores {
     private static ArrayList<Professor> professorlist = new ArrayList<>();


    public ArrayList<Professor> getProfessoresObjet() {
          return professorlist;
    }

    public Professor filterProfessor(int id) {
          for (Professor professor : professorlist) {
               if (professor.getId() == id) {
                    return professor;
               }
     }
     return null; 
     }

     public void addProfessor(String nome) {
          Professor professor = new Professor(nome);
          professorlist.add(professor);
     }

     public void removerProfessor(int id) {
          Professor professor = filterProfessor(id);
          professorlist.remove(professor);
          professor = null; 
     }


     public StringBuilder listarProfessor() {
          StringBuilder texto = new StringBuilder("LISTAR PROFESSORES: \n");
          for (Professor professor : professorlist) {
               texto.append(professor.getId() + " : " + professor.getNome() + "\n");
          }
          return texto;
     }


     public Professor getObjetProfessor(int id) {
          Professor professor = filterProfessor(id);
          return professor;
     }

     public StringBuilder infoProfessor(int id) {                 //QUANDO TIVER MAIS INFORMAÇÕES VAI SER MAIS UTIL.!
          StringBuilder texto = new StringBuilder("INFORMAÇÕES: \n");
          Professor professor = filterProfessor(id);
          texto.append(professor.getNome());  
          return texto;
     }

    public boolean existProfessor(int id) { //FILTRAR PELO ID
          for (Professor professor : professorlist) {
               if(professor.getId() == id) {
                    return true;
               } 
          }
          return false;
    }
     
}
