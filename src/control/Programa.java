package control;

import model.Curso;
import model.Aluno;

public class Programa {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setCodigo("123");
        curso1.setNome("Engenharia de pesca");

        Curso curso2 = new Curso();
        curso2.setCodigo("456");
        curso2.setNome("Moda");

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula("534543");
        aluno1.setNome("Bruno");

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula("5345323243");
        aluno2.setNome("Cauan");

        Aluno aluno3 = new Aluno();
        aluno3.setMatricula("53232324434543");
        aluno3.setNome("Leticia");

        //Se a classe eh via colecao, usa o metodo add
        curso1.addAluno(aluno1);
        curso2.addAluno(aluno2);
        curso2.addAluno(aluno3);

        //Se a classe eh via atributo, usa o metodo "set"
        aluno1.setCurso(curso1);
        aluno2.setCurso(curso2);
        aluno3.setCurso(curso2);
    }
}
