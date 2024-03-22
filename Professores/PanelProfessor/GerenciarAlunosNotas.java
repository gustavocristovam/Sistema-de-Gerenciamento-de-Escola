package Professores.PanelProfessor;

import java.util.ArrayList;

import Admin.GerenciarAlunos;
import Alunos.Aluno;
import Disciplinas.Disciplina;

public class GerenciarAlunosNotas extends GerenciarAlunos {

    private ArrayList<Aluno> alunolist = getArrayList();
    

    public StringBuilder getAlunosAndNotas(int materia) {
        StringBuilder txt = new StringBuilder();
        txt.append("ID :  NOME:  NOTA:\n");
        
        for (Aluno aluno : alunolist) {
            ArrayList<Disciplina> disciplinas = aluno.getListArrayList();
            
           
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getId() == materia) {
                     txt.append(aluno.getId() + " : " + aluno.getNome() + " : " +disciplina.getNota() + "\n");
                   
                }
            }
        }
        
        return txt;
    }

    
    
    public void setAlunoNota(int aluno,int nota, Disciplina disciplina) {
       Aluno alunoObject = filterAluno(aluno);
       ArrayList<Disciplina> disciplinas = alunoObject.getListArrayList();
       for (Disciplina disciplinaAluno : disciplinas) {
            if(disciplinaAluno.equals(disciplina)) {
                    disciplinaAluno.setNota(nota);
            }
       }
      
    }

}
