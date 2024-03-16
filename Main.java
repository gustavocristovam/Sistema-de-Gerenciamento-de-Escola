import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
        Aluno miguel = new Aluno("Miguel");
        Disciplinas miguel_Disciplinas = new Disciplinas();

        miguel.setDisciplinas(miguel_Disciplinas);

        Professor renata = new Professor("Renata", "Matemática");
       
     
        miguel.getDisciplinas().setNota("Matemática",10);

    System.out.println("Aluno " + miguel.getNome());
       
    System.out.println(miguel.getDisciplinas().listarNotas());
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n"); 

    System.out.println( renata.getNome()  + " : " +renata.getDisciplina());
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n"); 
    miguel.getDisciplinas().removeNota("Matemática",6);
    System.out.println(miguel.getDisciplinas().listarNotas());




    }
}
