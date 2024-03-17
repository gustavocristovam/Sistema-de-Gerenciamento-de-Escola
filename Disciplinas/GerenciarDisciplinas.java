package Disciplinas;

import java.security.PublicKey;
import java.util.ArrayList;

import Professores.Professor;


//CADA Discpl

public class GerenciarDisciplinas {

    private String[] materiasBasicas = {"Matemática", "Física", "Química", "História", "Geografia", "Biologia", "Língua Portuguesa", "Língua Inglesa"};


    private ArrayList<Disciplina> disciplinalist = new ArrayList<>();
// INSERIR MATERIAS BASICAS!
   public GerenciarDisciplinas() {
        for (String materia : materiasBasicas) {
            Disciplina disciplina_obj = new Disciplina(materia);
            disciplinalist.add(disciplina_obj);
        }
    }  


    private Disciplina filterDisciplina(String nome) {
        for (Disciplina disciplina : disciplinalist) {
            if (disciplina.getNome().equals(nome)) {
                return disciplina;
                
            }
        }
        return null;  
    }

    public StringBuilder getDisciplinasList() {
        StringBuilder texto = new StringBuilder("Matérias: \n");
        for (Disciplina disciplina : disciplinalist) {
            texto.append(disciplina.getNome() + " : ");
        }
        return texto;
    }



    public StringBuilder getDisciplina(String nome) {
        StringBuilder texto = new StringBuilder("INFORMAÇÕES: ");
        Disciplina disciplina = filterDisciplina(nome);
        texto.append("Nome: " + disciplina.getNome() + " : ");
        return texto;
    }

    public void addDisciplina(String nome) {
        Disciplina disciplina = new Disciplina(nome);
        disciplinalist.add(disciplina);
    }

    public void removeDisciplina(String nome) {
        Disciplina disciplina = filterDisciplina(nome);
        disciplinalist.remove(disciplina); //DELETAR OBJETO DA ARRAY
        disciplina = null; //DELETAR OBJETO
       
    }


    public void setDisciplinaProfessor(String materia, Professor professor) { //QUANDO TIVER O GERENCIAMENTO DE PROFESSOR TROCAR O OBJETO PELO NOME DO PROFESSOR!
        Disciplina disciplina = filterDisciplina(materia); 
        disciplina.setProfessor(professor);
       
    }


   
 

    


}
