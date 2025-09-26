public class Zoo {
    String name,city;
    int nbrCages;
    Animal[] animals;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];

    }
    void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NbrCages: "+nbrCages);


    }

    @Override
    public String toString(){
        displayZoo();
        return  "Name: "+name + ", City: "+city + ", NbrCages: "+nbrCages ;
    }
}
