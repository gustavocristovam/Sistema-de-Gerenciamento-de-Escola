import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
        Aluno miguel = new Aluno("Miguel");
        Disciplinas miguel_Disciplinas = new Disciplinas();

        miguel.setDisciplinas(miguel_Disciplinas);

        Professor renata = new Professor("Renata", );
       
     


    System.out.println("Aluno " + miguel.getNome());
       
    System.out.println(miguel.getDisciplinas().listMaterias());



    }
}
