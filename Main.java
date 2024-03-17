import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Alunos.Aluno;
import Alunos.GerenciarAlunos;
import Disciplinas.Disciplina;
import Disciplinas.GerenciarDisciplinas;
import Professores.GerenciarProfessores;
import Professores.Professor;

public class Main {

    public static void main(String[] args) {

        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Scanner teclado = new Scanner(System.in);
      
        gerenciarAlunos.addAluno("Sergio");
        gerenciarAlunos.addAluno("Andressa");
        gerenciarAlunos.getListaDeAlunos();
       //sistema
       //alunos
       int sair = 0;

       /*  ALUNOS GERENCIMENTO! 
    do {
       System.out.println("\n Selecione a opção desejada: \n");
       System.out.println("1 - PROCURAR ALUNO");
       System.out.println("2 - ADICIONAR ALUNO");
       System.out.println("3 - REMOVER ALUNO");
       System.out.println("4 - LISTAR ALUNO \n");
       System.out.println("5 - SAIR \n");
       switch (teclado.next()) {
        case "1":
        clearConsole();
        System.out.println(gerenciarAlunos.getListaDeAlunos()); 
        System.out.println("Procurar o nome do Aluno:");
        String aluno = teclado.next();
            if (gerenciarAlunos.existAluno(aluno) ) {
                clearConsole();
                System.out.println(gerenciarAlunos.getAluno(aluno));
            }
            System.out.println("\n Selecione a opção desejada: \n");
             System.out.println("1 - PROCURAR ALUNO");
             System.out.println("2 - ADICIONAR ALUNO");
             System.out.println("3 - REMOVER ALUNO");
             System.out.println("4 - LISTAR ALUNO \n");
             System.out.println("5 - SAIR \n");
            break; 
        case "2": 
        clearConsole();
         System.out.println("Adicionar o nome do Aluno:");
            aluno = teclado.next();
             if (!gerenciarAlunos.existAluno(aluno) ) {
             gerenciarAlunos.addAluno(aluno);
             } else {
                System.out.println("Esse aluno já existe!");
             }
         break;
        case "3":
       clearConsole();
       System.out.println(gerenciarAlunos.getListaDeAlunos()); 
        System.out.println("Remover Aluno:");  
        aluno = teclado.next();
             if(gerenciarAlunos.existAluno(aluno)) {
                gerenciarAlunos.removeAluno(aluno);
             } else {
                System.out.println("ALUNO NÃO ENCONTRADO!");
             }
         break;
        case "4":
        clearConsole();
               System.out.println(gerenciarAlunos.getListaDeAlunos()); 
         break;
        case "5": 
            sair = 1;
             break;   
        default:
        sair = 1;
            break;
       }
    } while (sair == 0);
  */
           
        

          

        GerenciarDisciplinas disciplinas = new GerenciarDisciplinas();
        GerenciarProfessores professores = new GerenciarProfessores();

       
        professores.addProfessor("Raimundo");
        professores.addProfessor("Torrent");
        disciplinas.addDisciplina("Eletiva");
        disciplinas.addDisciplina("Portugues");

        //GET OBJETO PROFESSOR PELO NOME
        disciplinas.setDisciplinaProfessor("Eletiva", professores.getObjetProfessor("Raimundo"));
        disciplinas.setDisciplinaProfessor("Portugues", professores.getObjetProfessor("Raimundo"));


        System.out.println( disciplinas.getDisciplinasList());
    
       
       

      





    }
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            // Verifica qual sistema operacional está sendo usado
            if (os.contains("Windows")) {
                // Se for Windows, usa o comando 'cls' para limpar o console
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Se for outro sistema operacional (UNIX/Linux/Mac), usa o comando 'clear'
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            // Se ocorrer uma exceção, imprime-a
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }
    
}


