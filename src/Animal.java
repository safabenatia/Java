public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Setters
    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Family: " + family);
        System.out.println("Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Family: " + family + ", Mammal: " + isMammal;
    }

    // ⚡ Méthode pour comparer deux animaux (pour éviter les doublons)
    public boolean equals(Animal a) {
        return this.name.equalsIgnoreCase(a.getName())
                && this.family.equalsIgnoreCase(a.getFamily());
    }
}
