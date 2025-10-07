package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création d’animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);

        // Création des zoos
        Zoo zoo1 = new Zoo("Zoo Esprit", "Tunis", 3);
        Zoo zoo2 = new Zoo("Zoo Ariana", "Ariana", 5);

        // Ajout d'animaux
        zoo1.addAnimal(lion);
        zoo1.addAnimal(crocodile);
        zoo1.addAnimal(elephant);
        zoo1.addAnimal(lion2); // doublon
        zoo1.addAnimal(new Animal("Giraffidae", "Girafe", 7, true)); // zoo plein

        // Affichage
        System.out.println();
        zoo1.displayAnimals();

        // Recherche
        System.out.println("\nRecherche du lion : index = " + zoo1.searchAnimal(lion));
        System.out.println("Recherche de la girafe : index = " + zoo1.searchAnimal(new Animal("Giraffidae", "Girafe", 7, true)));

        // Suppression
        zoo1.removeAnimal(crocodile);
        zoo1.displayAnimals();

        // Comparaison de zoos
        zoo2.addAnimal(new Animal("Canidae", "Renard", 3, true));
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);

        System.out.println("\nComparaison des zoos :");
        if (biggerZoo == null)
            System.out.println("Les deux zoos ont le même nombre d’animaux.");
        else
            System.out.println("Le zoo avec le plus d’animaux est : " + biggerZoo);
    }
}
