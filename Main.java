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
 
  professores.addProfessor("Raimundo"); // ID = 1
  professores.addProfessor("Vanessa"); //ID = 2
  professores.addProfessor("Pedro"); //ID = 3

  disciplinas.addDisciplina("Eletiva");
  disciplinas.addDisciplina("Portugues");
  disciplinas.addDisciplina("Matématica");

  //GET OBJETO PROFESSOR PELO NOME
  disciplinas.setDisciplinaProfessor(1, professores.getObjetProfessor(1));
  disciplinas.setDisciplinaProfessor(2, professores.getObjetProfessor(2));
  disciplinas.setDisciplinaProfessor(3, professores.getObjetProfessor(3));


  alunos.addAluno("Andressa");
  alunos.addAluno("Alexendro");
  alunos.addAluno("Fernando");
  

  alunos.addDisciplinaAluno(1, disciplinas.getObjetDisciplina(1));
  alunos.addDisciplinaAluno(1, disciplinas.getObjetDisciplina(3));
  alunos.addDisciplinaAluno(2, disciplinas.getObjetDisciplina(2));
  alunos.addDisciplinaAluno(2, disciplinas.getObjetDisciplina(3));
  alunos.addDisciplinaAluno(3, disciplinas.getObjetDisciplina(1));
  alunos.addDisciplinaAluno(3, disciplinas.getObjetDisciplina(2));
  
  //Andressa =  Eletiva, Matématica
  //Alexandro = Portugues, Matematica
 //Fernando = Eletiva, Portugues
 
       int sair = 0;

       
    do {
        
       System.out.println("SELECIONE UMA OPÇÃO:");
       System.out.println("1 - ADMIN");
       System.out.println("2 - PROFESSOR");
       System.out.println("3 - SAIR");
       switch (teclado.next()) {
        
        case "1":
        //ADMIN
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
                    System.out.println("3 - INFORMAÇÕES ALUNO");
                    System.out.println("4 - LISTAR ALUNOS");
                    System.out.println("5 - SAIR");
                    switch (teclado.next()) {
                        case "1":
                        //ALUNOS
                            clearConsole();
                            System.out.println("Insira o nome do aluno(a) a ser adicionado:");
                            String alunoString = teclado.next();
                            
                                alunos.addAluno(alunoString);
                                System.out.println("Insirir disciplinas desse aluno: (true/false)");
                                if (teclado.nextBoolean()) {
                                    clearConsole();
                                    List<Integer> arrayDisciplinas = new ArrayList<>();
                                    System.out.println(disciplinas.getDisciplinasList());
                                    int materia;
                                do {
                            
                                    System.out.print("Insira os ID da matérias: (Sair = 0)");
                                    materia = teclado.nextInt();
                                    if (materia == 0) {
                                        break;
                                    }
                                    arrayDisciplinas.add(materia);
                                   
                                } while (true);
                                for (int item : arrayDisciplinas) {
                                    alunos.addDisciplinaAluno(alunos.filterIdForName(alunoString), disciplinas.getObjetDisciplina(item));
                                }
                                
                            
                                  
                                }

                            break;
                        case "2":
                            clearConsole();
                            System.out.println(alunos.getListaDeAlunos());
                            System.out.println("Insira o ID do aluno(a) a ser removido:");
                            int idAluno = teclado.nextInt();
                            if(alunos.existAluno(idAluno)) {
                                alunos.removeAluno(idAluno);
                            } else {
                                System.out.println("ALUNO NÃO ENCONTRADO!");
                            }
                            break;
                        case "3":
                            clearConsole();
                            System.out.println(alunos.getListaDeAlunos());
                            System.out.println("Insira o ID do aluno(a) para informações:");
                            idAluno = teclado.nextInt();
                            if(alunos.existAluno(idAluno)) {
                                System.out.println(alunos.getAluno(idAluno));
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
                    System.out.println("3 - INFORMAÇÕES PROFESSOR");
                    System.out.println("4 - LISTAR PROFESSORES");
                    System.out.println("5 - SAIR");
                    switch (teclado.next()) {
                        case "1":
                        //PROFESSORES
                            clearConsole();
                            System.out.println("Insira o nome do professor(a) a ser adicionado:");
                            String professorString = teclado.next();
                            //if (!professores.existProfessor(professorString)) { //NÃO EXISTE PROFESSOR
                                professores.addProfessor(professorString);
                           // } else {
                               
                           // }
                            break;
                        case "2":
                            clearConsole();
                            System.out.println(professores.listarProfessor());
                            System.out.println("Insira o ID do professor(a) a ser removido:");
                            int IdProfessor = teclado.nextInt();
                            if(professores.existProfessor(IdProfessor)) {
                                professores.removerProfessor(IdProfessor);
                            } else {
                                System.out.println("PROFESSOR NÃO ENCONTRADO!");
                            }
                            break;
                        case "3":
                            clearConsole();
            
                            System.out.println(professores.listarProfessor());
                            System.out.println("Insira o ID do professor(a) para informações:");
                            IdProfessor = teclado.nextInt();
                            if(professores.existProfessor(IdProfessor)) {
                                System.out.println(professores.infoProfessor(IdProfessor));
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
                         //DISCIPLIAS
                    clearConsole();
                    System.out.println("SELECIONE UMA OPÇÃO:");
                    System.out.println("1 - ADICIONAR DISCIPLINA");
                    System.out.println("2 - REMOVER DISCIPLINA");
                    System.out.println("3 - ATRIBUIR PROFESSOR A DISCIPLINA");
                    System.out.println("4 - LISTAR DISCIPLINAS");
                    System.out.println("5 - SAIR");
                    switch (teclado.next()) {
                        case "1":
                            clearConsole();
                            System.out.println("Insira o nome da disciplina a ser adicionado:");
                            String disciplinaString = teclado.next();
                           // if (!disciplinas.existDisciplina(disciplinaString)) {
                                disciplinas.addDisciplina(disciplinaString);
                            //} else {
                               
                           // }
                            break;
                        case "2":
                         clearConsole();
                         System.out.println(disciplinas.getDisciplinasList());
                         System.out.println("Insira o ID da disciplina a ser removida:");
                         int idDisciplina = teclado.nextInt();
                         if (disciplinas.existDisciplina(idDisciplina)) {
                            disciplinas.removeDisciplina(idDisciplina);
                         } else {
                            System.out.println("DISCIPLINA INEXISTENTE!");
                         }
                            break;    
                        case "3":
                        clearConsole();
                        System.out.println(disciplinas.getDisciplinasList());
                        System.out.println(professores.listarProfessor());
                        System.out.print("Insira o ID da máteria:");
                        int idMateria =  teclado.nextInt();
                        System.out.print("Insira o ID do professor(a):");
                        int idProfessor =  teclado.nextInt();
                        //System.out.println("Adicionado na disciplina " +  dString + " o Professor: " + pString);
                        if(disciplinas.existDisciplina(idMateria)) {
                            if (professores.existProfessor(idProfessor)) {
                                disciplinas.setDisciplinaProfessor(idMateria, professores.getObjetProfessor(idProfessor));
                                System.out.println("SUCESSO!");
                                System.out.println(disciplinas.getDisciplinasList());
                            } else {
                                System.out.println("ERROR: Professor(a) não encontrada!");
                            }
                           
                        } else {
                            System.out.println("ERROR: Matéria não encontrada!");
                        }
                            break;

                        case "4":
                        clearConsole();
                            System.out.println(disciplinas.getDisciplinasList());
                            break;
                        default:
                            break;
                    }
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
        //PROFESSOR
        System.out.println("Insira seu ID Professor(a): ");
            int idProfessor = teclado.nextInt();
        if(professores.existProfessor(idProfessor)) { // VERIFICAR INTEGRIDADE DO PROFESSOR!
            clearConsole();
            GerenciarAlunosNotas notasGerenciar = new GerenciarAlunosNotas();
            System.out.println("                                                 Bem-vindo " + professores.filterProfessor(idProfessor).getNome());

            //Sistema para filtar entre todas as disciplinas uma disciplina que tenha o Object professor igual idProfessor
               
            Disciplina professoDisciplina = disciplinas.getProfessorOfDisciplina(idProfessor);
            System.out.println("ID: " + professoDisciplina.getId() + " Disciplina: " + professoDisciplina.getNome());
            System.out.println("-======================================================================================================================-");
            
                System.out.println(notasGerenciar.getAlunosAndNotas(professoDisciplina.getId()));
           
            System.out.println("1- ATRIBUIR NOTA ALUNO(a):");
            System.out.println("ID do aluno:");
            int aluno = teclado.nextInt();
            System.out.println("Nota do aluno:");
            int nota = teclado.nextInt();
            notasGerenciar.setAlunoNota(aluno, nota, professoDisciplina);
            clearConsole();
            System.out.println(notasGerenciar.getAlunosAndNotas(professoDisciplina.getId()));

        } else {
            System.out.println("Professor inexistente!");
        }
      
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
