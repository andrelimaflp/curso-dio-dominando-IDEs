package br.com.dio.model;


import java.util.Objects;

public class Animal {
    private String tipoAnimal;
    private String nome;
    private String cor;
    private Integer idade;

    public Animal(String tipoAnimal, String nome, String cor, Integer idade) {
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Animal() {

    }

    public String getTipoAnimal() {

        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public Integer getIdade() {

        return idade;
    }

    public void setIdade(Integer idade) {

        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(tipoAnimal, animal.tipoAnimal) && Objects.equals(nome, animal.nome) && Objects.equals(cor, animal.cor) && Objects.equals(idade, animal.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoAnimal, nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Informações sobre o animal: " +
                "\n Tipo do Animal = " + tipoAnimal + " " +
                "\n nome = " + nome + " " +
                "\n cor = " + cor + " " +
                "\n idade = " + idade + " anos ";
    }
}
