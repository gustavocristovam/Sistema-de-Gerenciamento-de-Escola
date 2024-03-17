package Alunos;
import java.util.ArrayList;

public class GerenciarAlunos {
    
   
    private ArrayList<Aluno> alunolist = new ArrayList<>();
    


public StringBuilder getListaDeAlunos() {
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
    StringBuilder texto = new StringBuilder("Informações: \n  \n" + //
                "");
    for (Aluno aluno : alunolist) {
        if (aluno.getNome().equals(nome)) {
           // texto.append( "Nome: " + aluno.getNome() + " \n \n" + aluno.getDisciplinas().listarNotas());
            return texto;
        }
    }
    return null;
    
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


public void removeAluno(String nome) {
    for (Aluno aluno : alunolist) {
            if(aluno.getNome().equals(nome)) {
                alunolist.remove(aluno);
                aluno = null;
            } else {
                System.out.println("FALSE!");
            }
    }
}

}