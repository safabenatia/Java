import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Version avec valeurs par défaut
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Version avec saisie utilisateur
        System.out.print("Entrez le nom du zoo : ");
        zooName = input.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = input.nextInt();

        if (nbrCages > 0) {
            System.out.println(zooName + " comporte " + nbrCages + " cages");
        } else {
            System.out.println("Erreur : le nombre de cages doit être positif !");
        }

        input.close();
    }
}

