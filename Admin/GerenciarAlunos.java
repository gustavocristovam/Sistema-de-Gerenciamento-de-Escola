package Admin;
import java.util.ArrayList;

import Alunos.Aluno;
import Disciplinas.Disciplina;
import Professores.PanelProfessor.Professor;
//ADMINISTRADOR
public class GerenciarAlunos {
    
   
    private ArrayList<Aluno> alunolist = new ArrayList<>();
    

    private Aluno filterAluno(int id) {
        for (Aluno aluno : alunolist) {
            if (aluno.getId() ==  id) {
                return aluno;
            } 
        }
        return null;
    }

    public int filterIdForName(String nome) {
        for (Aluno aluno : alunolist) {
            if (aluno.getNome().equals(nome)) {
                return aluno.getId();
            } 
        }
        return -1;
    }

    public void addDisciplinaAluno(int id, Disciplina disciplina) {
        Aluno alunoObj = filterAluno(id);
        alunoObj.addDisciplina(disciplina);
    }
    
  


    public StringBuilder getListaDeAlunos(){
        StringBuilder text = new StringBuilder("Lista de alunos:\n");
        text.append("ID :  NOME: \n");
        for (Aluno aluno : alunolist) {
           text.append(aluno.getId() + " : " + aluno.getNome() + " \n");
       }
       return text;
      }

   public Aluno addAluno(String nome) {
        Aluno aluno = new Aluno(nome);
        alunolist.add(aluno);
        return aluno;
    }

    
    public StringBuilder getAluno(int id) {
    StringBuilder texto = new StringBuilder("Informações: \n  \n");
    Aluno aluno = filterAluno(id);   
    texto.append("ID: " + aluno.getId() + " " +  "Nome: " + aluno.getNome() + aluno.getListDisciplinasAluno() + " \n \n");
    return texto;
    }

   
public boolean existAluno(int id) {
    for (Aluno aluno : alunolist) {
        if(aluno.getId() == id) {
           return true;
        } 
    }
    return false;
    }


public Aluno getObjetAluno(int id) {
    Aluno aluno = filterAluno(id);
    return aluno;
}


public void removeAluno(int id) {
    Aluno aluno = filterAluno(id);   
    alunolist.remove(aluno);
    aluno = null;        
}

}