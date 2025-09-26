public class Animal {
    String family , name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    void displayAnimal(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Family: "+family);
        System.out.println("Mammal: "+isMammal);

    }
    @Override
    public String toString(){
        displayAnimal();
        return  "Name: "+name + ", Age: "+age + ", Family: "+family + ", Mammal: "+isMammal   ;
    }
}
