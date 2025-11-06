package model;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>(); //Atributo de relacionamento

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
