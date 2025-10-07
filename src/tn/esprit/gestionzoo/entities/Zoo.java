package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages;
    private Animal[] animals;
    private int animalCount;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        setCity(city);
        this.nbrCages = (nbrCages <= 25) ? nbrCages : 25;
        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    // Setters avec validations
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide !");
        this.name = name;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty())
            throw new IllegalArgumentException("La ville ne peut pas être vide !");
        this.city = city;
    }

    // Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("❌ Impossible d'ajouter " + animal.getName() + ": le zoo est plein !");
            return false;
        }

        // Vérifier les doublons
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("⚠️ L'animal " + animal.getName() + " existe déjà !");
                return false;
            }
        }

        animals[animalCount++] = animal;
        System.out.println("✅ " + animal.getName() + " ajouté au zoo !");
        return true;
    }

    // Afficher les animaux
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("=== Liste des animaux dans le zoo " + name + " ===");
            for (int i = 0; i < animalCount; i++) {
                System.out.println((i + 1) + ". " + animals[i]);
            }
        }
    }

    // Rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) return i;
        }
        return -1;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("❌ Animal introuvable : " + animal.getName());
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println("✅ " + animal.getName() + " a été supprimé du zoo.");
        return true;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        else if (z2.animalCount > z1.animalCount) return z2;
        else return null;
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
