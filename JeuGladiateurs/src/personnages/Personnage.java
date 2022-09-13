package personnages;

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
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
