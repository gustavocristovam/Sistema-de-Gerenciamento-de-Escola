import java.util.HashMap;
import java.util.Map;

public class Disciplinas {
    private String[] materias_list = {"Matemática", "Física", "Química", "História", "Geografia", "Biologia", "Língua Portuguesa", "Língua Inglesa"};
    private HashMap<String, Integer> materias = new HashMap<>() {{
        for ( String materia : materias_list) {
            put(materia, 0);
        }
       
    }};

   
  


    public StringBuilder listMaterias() {
        StringBuilder listMateriasBuilder = new StringBuilder("Suas matérias:\n");  
           
        for (Map.Entry<String, Integer> materia : materias.entrySet()) {
            listMateriasBuilder.append(materia.getKey()  +"Notas:" +  materia.getValue() +"\n" );
        }
        return listMateriasBuilder;
    }

    

}
