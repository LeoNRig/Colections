package com.example.colections.teste;

public class Pessoa {
    private String nome = "";
    private int idade = 0;

    public void salvarTelefone(String... telefones){
        for (String telefone : telefones){
            System.out.println("Salvando telefone: " +telefone);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
