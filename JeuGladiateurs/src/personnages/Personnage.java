package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //CONSTRUCTEUR
    
        public Personnage(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.valeurMaxAttaque = valeurMaxAttaque;
        this.valeurDefense = valeurDefense;
        this.initiative = initiative;
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;
    }
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    //[GETTER][SETTER]
    
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }
    
    public int getInitiative() {
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n" + getNom());
        System.out.println("Attaque : " + getValeurMaxAttaque());
        System.out.println("Defense : " + getValeurDefense());
        System.out.println("Points de vie : " + getPointsDeVie());
        System.out.println("Iniciative : " + getInitiative());
        if (getPointsDeVie() > 0) {
            System.out.println("Statut : Vivant");
        }
        else
        {
            System.out.println("Statut s: Mort");
        }
        
    }

    private int attaqueCalcul() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = getValeurMaxAttaque();
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int frappe = attaqueCalcul();
        int degats = frappe - personnageCible.getValeurDefense();
        if (degats < 0) {
            degats = 0;
        }
        System.out.println("\n" + getNom() + " attaque avec une puissance de : " + frappe);
        System.out.println(personnageCible.getNom() + " a une defense de:  " + personnageCible.getValeurDefense());
        System.out.println("Les degats sont donc de : " + degats);
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
