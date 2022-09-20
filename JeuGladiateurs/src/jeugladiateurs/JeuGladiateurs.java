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
    int fin = 0;
    do {    
        tour.afficheTour();
            for (int i = 100; i > 0; i--) {
                if (i == personnageA.getInitiative() && personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
                    personnageA.frapperPersonnage(personnageB);
                }
                if (i == personnageB.getInitiative() && personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
                    personnageB.frapperPersonnage(personnageA);
                }
            }
            affichage.afficherSeparateurInfosPerso();
            personnageA.setNewInitiativeRandom();
            personnageB.setNewInitiativeRandom();
            personnageA.afficherInfosPersonnage();
            personnageB.afficherInfosPersonnage();
            
        if (personnageA.getPointsDeVie() > 0 && personnageB.getPointsDeVie() > 0) {
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
        }
        if (personnageA.getPointsDeVie() <= 0) {
            fin = 1;
        }
        if (personnageB.getPointsDeVie() <= 0) {
            fin = 2;
        }
    } while (fin == 0);
    System.out.println("");
    affichage.afficherSeparateurDeTour();
    System.out.println("");
    
    affichage.afficheVictoire(personnageA, personnageB);
    // </editor-fold>
    }

}
