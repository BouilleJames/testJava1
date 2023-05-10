//import java.util.Scanner;
import transport.Voiture;
import transport.Moto;

public class App {

    public static void main(String[] args) {
        Voiture mavoiture = new Voiture("Renault", "Grise", 4);
        Moto mamoto = new Moto("Honda", "Noir", 2);
        afficher(mavoiture,mamoto);
    }

    public static void afficher(Voiture mavoiture,Moto mamoto) {
        System.out.println("Ce vehicule est une " + mavoiture.getmMarque() + " ,est de couleur " + mavoiture.getmCouleur()
                + " et a " + mavoiture.getmNbRoues() + " roues");
        System.out.println("Ce vehicule est une " + mamoto.getmMarque() + " ,est de couleur " + mamoto.getmCouleur()
                + " et a " + mamoto.getmNbRoues() + " roues");
        // System.out.println("la marque est : " + g.getmMarque() + " de couleur : " +
        // g.getmCouleur());

    }
}
