package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    // Getters
    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    // Setters avec validations
    public void setFamily(String family) {
        if (family == null || family.isEmpty())
            throw new IllegalArgumentException("La famille de l'animal ne peut pas être vide !");
        this.family = family;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide !");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("L'âge de l'animal ne peut pas être négatif !");
        this.age = age;
    }

    public void setMammal(boolean mammal) { isMammal = mammal; }

    // Affichage simple
    public void displayAnimal() {
        System.out.println("Name: " + name + ", Age: " + age +
                ", Family: " + family + ", Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age +
                ", Family: " + family + ", Mammal: " + isMammal;
    }

    // Comparer deux animaux (pour éviter doublons)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal a = (Animal) o;
        return name.equalsIgnoreCase(a.name) && family.equalsIgnoreCase(a.family);
    }
}
