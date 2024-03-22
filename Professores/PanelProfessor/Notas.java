package Professores.PanelProfessor;

import Alunos.Aluno;
import Disciplinas.Disciplina;

public class Notas {
    int valor; // NAO DA PARA ATRIUBUIR NOTA A DISCIPLINAS, POIS TEM QUE TER A MATERIA GLOBAL, E NAO PODE CRIAR VARIOS OBJETOS PARA CADA ALUNO!
    Disciplina disciplina;
    Aluno aluno;
}
