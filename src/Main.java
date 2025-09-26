public class Main {
    public static void main(String[] args) {
        // Création de quelques animaux avec le constructeur
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);

        // Création du zoo
        Zoo myZoo = new Zoo("Zoo Esprit", "Tunis", 10);

        // Exemple d'affichage des animaux
        System.out.println("=== Affichage avec displayAnimal() ===");
        lion.displayAnimal();
        System.out.println("------");
        crocodile.displayAnimal();
        System.out.println("------");
        elephant.displayAnimal();

        System.out.println("\n=== Affichage avec toString() ===");
        System.out.println(lion);       // appelle automatiquement toString()
        System.out.println(crocodile);
        System.out.println(elephant);

        // Affichage des infos du Zoo
        System.out.println("\n=== Infos du Zoo avec displayZoo() ===");
        myZoo.displayZoo();

        System.out.println("\n=== Infos du Zoo avec toString() ===");
        System.out.println(myZoo);      // appelle automatiquement toString()
    }
}
