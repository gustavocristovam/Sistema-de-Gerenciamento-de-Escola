package Admin;
import java.util.ArrayList;

import Alunos.Aluno;
import Disciplinas.Disciplina;
import Professores.PanelProfessor.Professor;
//ADMINISTRADOR
public class GerenciarAlunos {
    
   
    private ArrayList<Aluno> alunolist = new ArrayList<>();
    

    private Aluno filterAluno(String nome) {
        for (Aluno aluno : alunolist) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            } 
        }
        return null;
    }

    public void addDisciplinaAluno(String aluno, Disciplina disciplina) {
        Aluno alunoObj = filterAluno(aluno);
        alunoObj.addDisciplina(disciplina);
    }
    
  


    public StringBuilder getListaDeAlunos(){
        StringBuilder text = new StringBuilder("Lista de alunos: ");
        for (Aluno aluno : alunolist) {
           text.append(aluno.getNome()).append(", ");
       }
       return text;
      }

   public Aluno addAluno(String nome) {
        Aluno aluno = new Aluno(nome);
        alunolist.add(aluno);
        return aluno;
    }

    
    public StringBuilder getAluno(String nome) {
    StringBuilder texto = new StringBuilder("Informações: \n  \n");
    Aluno aluno = filterAluno(nome);   
    texto.append( "Nome: " + aluno.getNome() + aluno.getListDisciplinasAluno() + " \n \n");
    return texto;
    }

   
public boolean existAluno(String nome) {
    for (Aluno aluno : alunolist) {
        if(aluno.getNome().equals(nome)) {
           return true;
        } else {
            return false;
        }

}
return false;
}


public Aluno getObjetAluno(String nome) {
    Aluno aluno = filterAluno(nome);
    return aluno;
}


public void removeAluno(String nome) {
    Aluno aluno = filterAluno(nome);   
    alunolist.remove(aluno);
    aluno = null;        
}

}