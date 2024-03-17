package Disciplinas;

import java.util.ArrayList;


//CADA Discpl

public class GerenciarDisciplinas {

    private String[] materiasBasicas = {"Matemática", "Física", "Química", "História", "Geografia", "Biologia", "Língua Portuguesa", "Língua Inglesa"};


    private ArrayList<Disciplina> disciplinalist = new ArrayList<>();

    public GerenciarDisciplinas() {
        for (String materia : materiasBasicas) {
            Disciplina disciplina_obj = new Disciplina(materia);
            disciplinalist.add(disciplina_obj);
        }
    }

    public StringBuilder getDisciplinasList() {
        StringBuilder texto = new StringBuilder("M: ");
        for (Disciplina disciplina : disciplinalist) {
            texto.append(disciplina);
        }
        return texto;
    }


    public void addDisciplina(String nome) {
        Disciplina disciplina = new Disciplina(nome);
        disciplinalist.add(disciplina);
    }

    public void removeDisciplina(String nome) {
        for (Disciplina disciplina : disciplinalist) {
            if (disciplina.getNome().equals(nome)) {
                disciplinalist.remove(disciplina); //DELETAR OBJETO DA ARRAY
                disciplina = null; //DELETAR OBJETO
            }
        }
    }




   
 

    


}
