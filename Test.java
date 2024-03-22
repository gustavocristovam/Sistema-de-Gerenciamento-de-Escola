import java.util.Scanner;

import Admin.GerenciarAlunos;
import Admin.GerenciarDisciplinas;
import Admin.GerenciarProfessores;
import Professores.PanelProfessor.GerenciarAlunosNotas;

public class Test {
       
        
       
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
  alunos.addAluno("Henrique");

  alunos.addDisciplinaAluno(1, disciplinas.getObjetDisciplina(1));
  alunos.addDisciplinaAluno(1, disciplinas.getObjetDisciplina(2));
  alunos.addDisciplinaAluno(1, disciplinas.getObjetDisciplina(3));
  alunos.addDisciplinaAluno(2, disciplinas.getObjetDisciplina(1));
  alunos.addDisciplinaAluno(2, disciplinas.getObjetDisciplina(2));
  alunos.addDisciplinaAluno(2, disciplinas.getObjetDisciplina(3));
  alunos.addDisciplinaAluno(3, disciplinas.getObjetDisciplina(1));
  alunos.addDisciplinaAluno(3, disciplinas.getObjetDisciplina(2));




  //teste


System.out.println(disciplinas.getDisciplina(1));



        }
    }
    

