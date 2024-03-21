import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Admin.GerenciarAlunos;
import Admin.GerenciarDisciplinas;
import Admin.GerenciarProfessores;
import Alunos.Aluno;
import Disciplinas.Disciplina;
import Professores.PanelProfessor.GerenciarAlunosNotas;
import Professores.PanelProfessor.Professor;

public class Main {

   public static void main(String[] args) {
         //ADMIN
         GerenciarDisciplinas disciplinas = new GerenciarDisciplinas();
         GerenciarProfessores professores = new GerenciarProfessores();
         GerenciarAlunos alunos = new GerenciarAlunos();
         Scanner teclado = new Scanner(System.in);

        //PROFESSORES

        GerenciarAlunosNotas panel_professor = new GerenciarAlunosNotas();
 
  professores.addProfessor("Raimundo");
  professores.addProfessor("Torrent");

  disciplinas.addDisciplina("Eletiva");
  disciplinas.addDisciplina("Portugues");

  alunos.addAluno("Andressa");
  alunos.addAluno("Alexendro");
        
  //GET OBJETO PROFESSOR PELO NOME
  disciplinas.setDisciplinaProfessor("Eletiva", professores.getObjetProfessor("Raimundo"));
  disciplinas.setDisciplinaProfessor("Portugues", professores.getObjetProfessor("Raimundo"));

  

  

       
       int sair = 0;

       
    do {
        
       System.out.println("SELECIONE UMA OPÇÃO:");
       System.out.println("1 - ADMIN");
       System.out.println("2 - PROFESSOR");
       System.out.println("3 - SAIR");
       switch (teclado.next()) {
        case "1":
             clearConsole();
            System.out.println("Insira a senha para entrar como admin:");
            if (teclado.next().equals("123")) { //SENHA SIMPLES!
                System.out.println("SELECIONE UMA OPÇÃO:");
                System.out.println("1 - GERENCIAR ALUNOS");
                System.out.println("2 - GERENCIAR PROFESSORES");
                System.out.println("3 - GERENCIAR DISCIPLINAS");
                System.out.println("4 - SAIR");
                switch (teclado.next()) {
                    case "1":
                    clearConsole();
                    System.out.println("SELECIONE UMA OPÇÃO:");
                    System.out.println("1 - ADICIONAR ALUNO");
                    System.out.println("2 - REMOVER ALUNO");
                    System.out.println("3 - PROCURAR ALUNO");
                    System.out.println("4 - LISTAR ALUNOS");
                    System.out.println("5 - SAIR");
                    switch (teclado.next()) {
                        case "1":
                        //ALUNOS
                            clearConsole();
                            System.out.println("Insira o nome do aluno(a) a ser adicionado:");
                            String alunoString = teclado.next();
                            if (!alunos.existAluno(alunoString)) { //NÃO EXISTE ALUNO
                                alunos.addAluno(alunoString);
                            } else {
                                System.out.println("JÁ EXISTE UM ALUNO COM ESTE NOME!");
                            }
                            break;
                        case "2":
                            clearConsole();
                            System.out.println("Insira o nome do aluno(a) a ser removido:");
                            alunoString = teclado.next();
                            if(alunos.existAluno(alunoString)) {
                                alunos.removeAluno(alunoString);
                            } else {
                                System.out.println("ALUNO NÃO ENCONTRADO!");
                            }
                            break;
                        case "3":
                            clearConsole();
                            System.out.println(alunos.getListaDeAlunos());
                            System.out.println("Insira o nome do aluno(a) para procurar:");
                            alunoString = teclado.next();
                            if(alunos.existAluno(alunoString)) {
                                System.out.println(alunos.getAluno(alunoString));
                            } else {
                                System.out.println("ALUNO NÃO ENCONTRADO!");
                            }
                            break;
                        case "4":
                            clearConsole();
                            System.out.println(alunos.getListaDeAlunos());
                            teclado.next();
                            break;   
                        case "5":
                            sair = 1;
                            break;
                        default:
                            sair = 1;
                            break;
                    }
                        break;
                    case "2":
                    //PROFESSORES
                    clearConsole();
                    System.out.println("SELECIONE UMA OPÇÃO:");
                    System.out.println("1 - ADICIONAR PROFESSOR");
                    System.out.println("2 - REMOVER PROFESSOR");
                    System.out.println("3 - PROCURAR PROFESSOR");
                    System.out.println("4 - LISTAR PROFESSORES");
                    System.out.println("5 - SAIR");
                    switch (teclado.next()) {
                        case "1":
                        //PROFESSORES
                            clearConsole();
                            System.out.println("Insira o nome do professor(a) a ser adicionado:");
                            String professorString = teclado.next();
                            if (!professores.existProfessor(professorString)) { //NÃO EXISTE PROFESSOR
                                professores.addProfessor(professorString);
                            } else {
                                System.out.println("JÁ EXISTE UM PROFESSOR COM ESTE NOME!");
                            }
                            break;
                        case "2":
                            clearConsole();
                            System.out.println("Insira o nome do professor(a) a ser removido:");
                            professorString = teclado.next();
                            if(professores.existProfessor(professorString)) {
                                professores.removerProfessor(professorString);
                            } else {
                                System.out.println("PROFESSOR NÃO ENCONTRADO!");
                            }
                            break;
                        case "3":
                            clearConsole();
                            System.out.println(professores.listarProfessor());
                            System.out.println("Insira o nome do professor(a) para procurar:");
                            professorString = teclado.next();
                            if(professores.existProfessor(professorString)) {
                                System.out.println(professores.procurarProfessor(professorString));
                            } else {
                                System.out.println("PROFESSOR NÃO ENCONTRADO!");
                            }
                            break;
                        case "4":
                            clearConsole();
                            System.out.println(professores.listarProfessor());
                            teclado.next();
                            break;   
                        case "5":
                            sair = 1;
                            break;
                        default:
                            sair = 1;
                            break;
                    }
                        break;
                    case "3":
                        
                        break;
                    case "4":
                    sair = 1;
                        break;
                    default:
                    sair = 1;
                        break;
                }
               
            
            }else {
                System.out.println("SENHA INCORRETA!");
                sair = 0;
                break;
            }

            break;
       case "2":
            break;
       case "3":
       sair = 1;
            break;
        default:
        sair = 1;
            break;
       }
    } while (sair == 0);
  
           
      

    

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


