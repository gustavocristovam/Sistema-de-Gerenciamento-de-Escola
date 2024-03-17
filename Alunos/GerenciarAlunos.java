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

   public Aluno adicionarAluno(String nome) {


        Aluno aluno = new Aluno(nome);
        
       adicionarAlunoLista(aluno);

        return aluno;
    }

    private void adicionarAlunoLista(Aluno aluno) {
        alunolist.add(aluno);
     }


  


public static void removeAluno() {

}
    
   





}