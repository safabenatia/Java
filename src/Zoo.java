public class Zoo {
    private String name;
    private String city;
    private final int nbrCages; // ✅ constante
    private Animal[] animals;
    private int animalCount;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = (nbrCages <= 25) ? nbrCages : 25; // maximum 25 cages
        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    // 🟢 Méthode 10 : ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("❌ Impossible d'ajouter " + animal.getName() + ": le zoo est plein !");
            return false;
        }

        // Vérifier que l’animal n’existe pas déjà
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("⚠️ L'animal " + animal.getName() + " existe déjà dans le zoo !");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println("✅ " + animal.getName() + " ajouté au zoo !");
        return true;
    }

    // 🟢 Méthode 11 : afficher les animaux
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("=== Liste des animaux dans le zoo ===");
            for (int i = 0; i < animalCount; i++) {
                System.out.println((i + 1) + ". " + animals[i]);
            }
        }
    }

    // 🟢 Méthode 11 suite : recherche d’un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i; // retourne l’indice
            }
        }
        return -1; // non trouvé
    }

    // 🟢 Méthode 13 : supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("❌ Animal introuvable : " + animal.getName());
            return false;
        }

        // Décaler les éléments du tableau vers la gauche
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println("✅ " + animal.getName() + " a été supprimé du zoo.");
        return true;
    }

    // 🟢 Méthode 15 : vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // 🟢 Méthode 16 : comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount)
            return z1;
        else if (z2.animalCount > z1.animalCount)
            return z2;
        else
            return null; // même nombre d'animaux
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}
