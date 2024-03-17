import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Alunos.Aluno;
import Alunos.GerenciarAlunos;
import Objetos.Disciplinas;

public class Main {
    public static void main(String[] args) {

        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Scanner teclado = new Scanner(System.in);
      
        for (int i = 0; i < 2; i++) {
            System.out.println("Insira o nome do aluno:");
            String nome = teclado.next(); 
            Aluno aluno = gerenciarAlunos.adicionarAluno(nome);
            System.out.println("Aluno adicionado: " + aluno.getNome()); 
        }
           

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println(gerenciarAlunos.getListaDeAlunos());
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("Aluno:");
            System.out.println(gerenciarAlunos.getAluno(teclado.next()));




          


       

      





    }
}
