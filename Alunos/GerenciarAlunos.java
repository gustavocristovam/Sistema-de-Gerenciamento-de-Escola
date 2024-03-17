package Alunos;
import java.util.ArrayList;

public class GerenciarAlunos {
    
   
    private ArrayList<Aluno> alunolist = new ArrayList<>();
    


public StringBuilder getListaDeAlunos() {
        StringBuilder text = new StringBuilder("Lista de alunos: ");
       for (Aluno aluno : alunolist) {
           
           text.append(aluno.getNome()).append(": ");
       }

   
       return text;
      }

   public Aluno adicionarAluno(String nome) {
        Aluno aluno = new Aluno(nome);
        alunolist.add(aluno);
        return aluno;
    }

    


public void removeAluno(String nome) {
    for (Aluno aluno : alunolist) {
            if(aluno.getNome().equals(nome)) {
                alunolist.remove(aluno);
            } else {
                System.out.println("FALSE!");
            }
    }
}

}