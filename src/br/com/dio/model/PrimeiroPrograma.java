package br.com.dio.model;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de animal:");
        String tipoAnimal = scan.nextLine();

        System.out.println("Digite o nome do animal:");
        String nomeAnimal = scan.nextLine();

        System.out.println("Digite a cor do animal:");
        String corAnimal = scan.nextLine();

        System.out.println("Digite idade do animal:");
        Integer idadeAnimal = scan.nextInt();


        Animal animal = new Animal();
        animal.setTipoAnimal(tipoAnimal);
        animal.setNome(nomeAnimal);
        animal.setCor(corAnimal);
        animal.setIdade(idadeAnimal);

        System.out.println(animal);

    }
}
