package model;

import java.time.LocalDate;

public class Cliente {

    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimento;

    public Cliente(String nome, String cpf, LocalDate DATANASCIMENTO) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = DATANASCIMENTO;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
