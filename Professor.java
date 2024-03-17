import Objetos.Disciplinas;

public class Professor {
    String nome;
    String disciplina;


   


    public Professor(String nome, String disciplina) {
        Disciplinas listaDisciplinas = new Disciplinas();
        this.nome = nome;
        if (listaDisciplinas.existMateria(disciplina)) {
        this.disciplina = disciplina;
        } else {
            this.disciplina = "NÃO ENCONTRADO!";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getDisciplina() {
        return this.disciplina;
    }


  

}
