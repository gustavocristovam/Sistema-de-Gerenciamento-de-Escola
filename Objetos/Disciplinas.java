package Objetos;
import java.util.HashMap;
import java.util.Map;

public class Disciplinas {

    private String[] materias_list = {"Matemática", "Física", "Química", "História", "Geografia", "Biologia", "Língua Portuguesa", "Língua Inglesa"};
    private HashMap<String, Integer> notas = new HashMap<>() {{
        for ( String materia : materias_list) {
            put(materia, 0);
        }
       
    }};

    public boolean existMateria(String value) {
        for (String string : materias_list) {
            if (string.equals(value)) {
                return true;
            }
        }
        return false; 
    }
    
    
   
  


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


}
