public class Main {
    public static void main(String[] args) {
        // Création d’animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true); // identique au premier

        // Création du zoo
        Zoo zoo1 = new Zoo("Zoo Esprit", "Tunis", 3);
        Zoo zoo2 = new Zoo("Zoo Ariana", "Ariana", 5);

        // Test ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(crocodile);
        zoo1.addAnimal(elephant);

        // Tentative d’ajouter un animal identique
        zoo1.addAnimal(lion2);

        // Tentative d’ajouter au-delà du nombre de cages
        Animal girafe = new Animal("Giraffidae", "Girafe", 7, true);
        zoo1.addAnimal(girafe);

        // Affichage
        System.out.println();
        zoo1.displayAnimals();

        // Test de recherche
        System.out.println("\nRecherche du lion : index = " + zoo1.searchAnimal(lion));
        System.out.println("Recherche de la girafe : index = " + zoo1.searchAnimal(girafe));

        // Test suppression
        zoo1.removeAnimal(crocodile);
        zoo1.displayAnimals();

        // Comparaison entre deux zoos
        zoo2.addAnimal(new Animal("Canidae", "Renard", 3, true));
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);

        System.out.println("\nComparaison des zoos :");
        if (biggerZoo == null)
            System.out.println("Les deux zoos ont le même nombre d’animaux.");
        else
            System.out.println("Le zoo avec le plus d’animaux est : " + biggerZoo);
    }
}
