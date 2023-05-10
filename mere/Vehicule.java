package mere;

public class Vehicule { // instance d'une classe = objet

    private String mMarque; // declaration de l'attribut de la classe
    private String mCouleur;
    private int mNbRoues;

    public Vehicule(String marque, String couleur, int nbRoues) { // constructeur
        setmMarque(marque); // attribut = argument
        setmCouleur(couleur);
        setmNbRoues(nbRoues);
    } // fin du constructeur
    
    public String getmMarque() { // methode(qui est aussi un attribut de la classe) pour recuperer la marque
        return mMarque;
    }
    public void setmMarque(String mMarque) {
        this.mMarque = mMarque;
    }
    
    public String getmCouleur() {
        return mCouleur;
    }
    public void setmCouleur(String mCouleur) {
        this.mCouleur = mCouleur;
    }
    
    public int getmNbRoues() {
        return mNbRoues;
    }
    public void setmNbRoues(int mNbRoues) {
        this.mNbRoues = mNbRoues;
    }
    // public determine que la portée est globale , que l'attribut sera accessible à l'exterieur de la classe
    // private determine que la portee est locale , attribut accessible seulement à l'interieur de la classe
}