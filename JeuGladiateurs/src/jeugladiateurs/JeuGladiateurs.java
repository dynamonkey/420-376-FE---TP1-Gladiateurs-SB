package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage personnage1 = new Personnage("Bob le malchanceux", 70, 15, 15, 15);
    Personnage personnage2 = new Personnage("Igor l'empaleur", 100, 25, 5, 30);
    Personnage personnageA = new Personnage();
    Personnage personnageB = new Personnage();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        //copie pour combattant actif
    personnageA.setActiveFighter(personnage1);
    personnageB.setActiveFighter(personnage2);
    
    personnageA.afficherInfosPersonnage();
    personnageB.afficherInfosPersonnage();
    
    affichage.afficherDebutCombat();
    
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    tour.afficheTour();
    personnageA.setNewInitiativeRandom();
    personnageB.setNewInitiativeRandom();
    int ini1 = personnage1.getInitiative();
    int ini2 = personnage2.getInitiative();
        for (int i = 100; i != 0; i--) {
            if (i == ini1) {
                personnageA.frapperPersonnage(personnageB);
            }
            else if (i == ini2) {
                personnageB.frapperPersonnage(personnageA);
            }
        }
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
