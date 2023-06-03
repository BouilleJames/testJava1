//import java.util.Scanner;   testBenoit.    retest
import transport.*;


public class App {

    public static void main(String[] args) {
        Voiture mavoiture = new Voiture("Renault", "Grise", 4);
        Moto mamoto = new Moto("Honda", "Noir", 2);
        Moto mamoto1 = new Moto("Kawasaki", "Verte", 2);
        PoidsLourd camion = new PoidsLourd("Renault", "Rouge", 6);
        afficher(mavoiture,mamoto,mamoto1,camion);
    }

    public static void afficher(Voiture mavoiture,Moto mamoto, Moto mamoto1, PoidsLourd camion) {
        System.out.println("Ce vehicule est une " + mavoiture.getmMarque() + " ,est de couleur " + mavoiture.getmCouleur()
                + " et a " + mavoiture.getmNbRoues() + " roues");
        System.out.println("Ce vehicule est une " + mamoto.getmMarque() + " ,est de couleur " + mamoto.getmCouleur()
                + " et a " + mamoto.getmNbRoues() + " roues");
        System.out.println("Ce vehicule est une " + mamoto1.getmMarque() + " ,est de couleur " + mamoto1.getmCouleur()
                + " et a " + mamoto1.getmNbRoues() + " roues");
        System.out.println("Ce Poids-Lourd est un " + camion.getmMarque() + " ,est de couleur " + camion.getmCouleur()
                + " et a " + camion.getmNbRoues() + " roues");
        // System.out.println("la marque est : " + g.getmMarque() + " de couleur : " +
        // g.getmCouleur());

    }
}
