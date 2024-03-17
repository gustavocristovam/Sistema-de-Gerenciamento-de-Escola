package Disciplinas;
import java.util.HashMap;
import java.util.Map;

import Professores.GerenciarProfessores;
import Professores.Professor;

public class Disciplina {
//Cada Disciplina vai ter seu professor! Inlcuede


protected Disciplina(String materia) {
    this.materia = materia;
}



    private String materia;
    private Professor professor;


    public void setProfessor(Professor professor) {
       
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
 
    public String getNome() {
        return this.materia;
    }



    
   
  

/* 
    public StringBuilder listarNotas() {
        StringBuilder listMateriasBuilder = new StringBuilder("Suas matérias:\n  \n");  
           
        for (Map.Entry<String, Integer> materia : notas.entrySet()) {
            listMateriasBuilder.append(materia.getKey()  +" Notas: " +  materia.getValue() +"\n" );
        }
        return listMateriasBuilder;
    }

    
// ADD REMOVE ATUALIZAR NOTAS

public void setNota(String disciplina, int valor) {
        if (existMateria(disciplina)) {
            for (Map.Entry<String, Integer> map : notas.entrySet() ) {
                if (map.getKey() == disciplina) {
                    map.setValue(valor);
                }
            }
        } else {
            System.out.println("MATÉRIA INEXISTENTE!");
        }
}



public void addNota(String disciplina, int valor) {
    if (existMateria(disciplina)) {
        for (Map.Entry<String, Integer> map : notas.entrySet() ) {
            if (map.getKey() == disciplina) {
                map.setValue(map.getValue() + valor);
            }
        }
    } else {
        System.out.println("MATÉRIA INEXISTENTE!");
    }
}


public void removeNota(String disciplina, int valor) {
    if (existMateria(disciplina)) {
        for (Map.Entry<String, Integer> map : notas.entrySet() ) {
            if (map.getKey() == disciplina) {
                map.setValue(map.getValue() - valor);
            }
        }
    } else {
        System.out.println("MATÉRIA INEXISTENTE!");
    }
}
*/

}
