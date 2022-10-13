package banco.rh;

import banco.Conta;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private Date dataNascimento;

    public Pessoa(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public abstract String dizerOi();

    public Pessoa() { }

    public double somar(int a, double b) {
        return a + b;
    }

    public double somar(double x, int y) {
        return x + y*10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
