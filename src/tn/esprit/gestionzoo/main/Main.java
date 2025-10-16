package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        // --- TEST ZOO CLASS ---
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);

        Zoo zoo1 = new Zoo("Zoo Esprit", "Tunis", 3);
        Zoo zoo2 = new Zoo("Zoo Ariana", "Ariana", 5);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(crocodile);
        zoo1.addAnimal(elephant);
        zoo1.addAnimal(lion2); // doublon

        System.out.println();
        zoo1.displayAnimals();

        zoo1.removeAnimal(crocodile);
        zoo1.displayAnimals();

        zoo2.addAnimal(new Animal("Canidae", "Fox", 3, true));
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);

        System.out.println("\nComparaison des zoos :");
        if (biggerZoo == null)
            System.out.println("Les deux zoos ont le même nombre d’animaux.");
        else
            System.out.println("Le zoo avec le plus d’animaux est : " + biggerZoo);

        // --- TEST HERITAGE ---
        Aquatic aquatic = new Aquatic("Fish", "Nemo", 2, false, "Sea");
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 30.0f);
        Terrestrial terrestrial = new Terrestrial("Elephantidae", "Elephant", 10, true, 4);

        // Affichage
        System.out.println("\n=== Heritage test ===");
        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);

        // Test des méthodes swim()
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
