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
   public GerenciarDisciplinas() {
        for (String materia : materiasBasicas) {
            Disciplina disciplina_obj = new Disciplina(materia);
            disciplinalist.add(disciplina_obj);
        }
    }  


    public void addDisciplina(String nome) {
        Disciplina disciplina = new Disciplina(nome); //CRIAR OBJETO
        disciplinalist.add(disciplina);
    }

   private Disciplina filterDisciplina(int id) {
        for (Disciplina disciplina : disciplinalist) {
            if (disciplina.getId() == id) {
                return disciplina;
                
            }
        }
        return null;  
    }

    public boolean existDisciplina(int id) {
    for (Disciplina disciplina : disciplinalist) {
        if(disciplina.getId() == id) {
           return true;
        } 
    }
    return false;
    }

    public StringBuilder getDisciplinasList() {
        StringBuilder texto = new StringBuilder("Matérias: \n");
        texto.append("ID : NOME : PROFESSOR \n");
        for (Disciplina disciplina : disciplinalist) {

            texto.append(disciplina.getId() + " : " +disciplina.getNome() + " : " + disciplina.getProfessor().getNome() + " \n" );
        }
        return texto;
    }



    public StringBuilder getDisciplina(int id) {
        StringBuilder texto = new StringBuilder("INFORMAÇÕES: ");
        Disciplina disciplina = filterDisciplina(id);
        texto.append("Nome: " + disciplina.getNome() + " : " + disciplina.getProfessor().getNome() + " \n");
        return texto;
    }

    public Disciplina getProfessorOfDisciplina(int idprofessor) {
        GerenciarProfessores professores = new GerenciarProfessores();
        for (Disciplina disciplina : disciplinalist) {
            if (disciplina.getProfessor().equals(professores.filterProfessor(idprofessor))) {
                return disciplina;
                
            }
        }
        return null;  
    }


    public Disciplina getObjetDisciplina(int id) {
        Disciplina disciplinar = filterDisciplina(id);
        return disciplinar;
   }

   

    public void removeDisciplina(int id) {
        Disciplina disciplina = filterDisciplina(id);
        disciplinalist.remove(disciplina); //DELETAR OBJETO DA ARRAY
        disciplina = null; //DELETAR OBJETO
       
    }


    public void setDisciplinaProfessor(int id, Professor professor) {
        Disciplina disciplina = filterDisciplina(id);  // FILTRAR MATERIA PELO ID MATERIA, graças a listDisciplina que tem aqui no objeto
        disciplina.setProfessor(professor); 
    }




   
 

    


}
