package Admin;

import java.security.PublicKey;
import java.util.ArrayList;

import Alunos.Aluno;
import Disciplinas.Disciplina;
import Professores.PanelProfessor.Professor;


//ADMINISTRADOR

public class GerenciarDisciplinas {

    private String[] materiasBasicas = {"Matemática", "Física", "Química", "História", "Geografia", "Biologia", "Língua Portuguesa", "Língua Inglesa"};


    private ArrayList<Disciplina> disciplinalist = new ArrayList<>();
// INSERIR MATERIAS BASICAS!
  /*  public GerenciarDisciplinas() {
        for (String materia : materiasBasicas) {
            Disciplina disciplina_obj = new Disciplina(materia);
            disciplinalist.add(disciplina_obj);
        }
    }  */


    private Disciplina filterDisciplina(String nome) {
        for (Disciplina disciplina : disciplinalist) {
            if (disciplina.getNome().equals(nome)) {
                return disciplina;
                
            }
        }
        return null;  
    }

    public boolean existDisciplina(String nome) {
    for (Disciplina disciplina : disciplinalist) {
        if(disciplina.getNome().equals(nome)) {
           return true;
        } 
    }
    return false;
    }

    public StringBuilder getDisciplinasList() {
        StringBuilder texto = new StringBuilder("Matérias: \n");
        for (Disciplina disciplina : disciplinalist) {
            texto.append(disciplina.getNome() + " : " + disciplina.getProfessor().getNome() + " \n" );
        }
        return texto;
    }



    public StringBuilder getDisciplina(String nome) {
        StringBuilder texto = new StringBuilder("INFORMAÇÕES: ");
        Disciplina disciplina = filterDisciplina(nome);
        texto.append("Nome: " + disciplina.getNome() + " : " + disciplina.getProfessor().getNome() + " \n");
        return texto;
    }

    public Disciplina getObjetDisciplina(String nome) {
        Disciplina disciplinar = filterDisciplina(nome);
        return disciplinar;
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


    public void setDisciplinaProfessor(String materia, Professor professor) {
        Disciplina disciplina = filterDisciplina(materia);  // FILTRAR MATERIA PELA STRING MATERIA, graças a listDisciplina que tem aqui no objeto
        disciplina.setProfessor(professor); 
    }




   
 

    


}
