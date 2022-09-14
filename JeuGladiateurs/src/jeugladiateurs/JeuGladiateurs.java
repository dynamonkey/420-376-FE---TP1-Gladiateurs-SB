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
    do {    
        tour.afficheTour();
        int ini1 = personnageA.getInitiative();
        int ini2 = personnageB.getInitiative();
            for (int i = 100; i > 0; i--) {
                if (i == ini1 && personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
                    personnageA.frapperPersonnage(personnageB);
                }
                if (i == ini2 && personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
                    personnageB.frapperPersonnage(personnageA);
                }
            }
        if (personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
            affichage.afficherSeparateurInfosPerso();
            personnageA.setNewInitiativeRandom();
            personnageB.setNewInitiativeRandom();
            personnageA.afficherInfosPersonnage();
            personnageB.afficherInfosPersonnage();
        }
        tour.augmenteTour();
        affichage.afficherSeparateurDeTour();
    } while (Personnage.getWin());    
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
