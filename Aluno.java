public class Aluno{

    private String nome;
    private Disciplinas disciplinas;

   public Aluno(String nome) {
        this.nome = nome;
   }

  
   
    public String getNome() {
        return nome;
    }

  
    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }

}