package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon;
import personnages.Retiaire;
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
        Retiaire personnage3 = new Retiaire("Retiaire", "Igor l'empaleur", 100, 25, 5, 30);
        Mirmillon personnage4 = new Mirmillon("Mirmillon", "Bob le malchanceux", 70, 15, 15, 15);
        Personnage personnageA = new Personnage();
        Personnage personnageB = new Personnage();
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        //copie pour combattant actif ***(NE FONCTIONNE QUE POUR PARTIE 1 CAR N'EST PAS UN CONTENEUR FLEXIBLE LIER AU AUTRES CLASSES)***
        //personnageA.setActiveFighter(personnage1);
        //personnageB.setActiveFighter(personnage2);

        personnage3.afficherInfosPersonnage();
        personnage4.afficherInfosPersonnage();

        affichage.afficherDebutCombat();

        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        boolean fin = false;
        do {
            tour.afficheTour();
            for (int i = 0; i < 100; i++) {
                if (i == personnage3.getInitiative() && personnage3.getPointsDeVie() > 0 && personnage4.getPointsDeVie() > 0) {
                    personnage3.frapperPersonnage(personnage4);
                }
                if (i == personnage4.getInitiative() && personnage3.getPointsDeVie() > 0 && personnage4.getPointsDeVie() > 0) {
                    personnage4.frapperPersonnage(personnage3);
                }
            }
            affichage.afficherSeparateurInfosPerso();
            personnage3.setNewInitiativeRandom();
            personnage4.setNewInitiativeRandom();
            personnage3.afficherInfosPersonnage();
            personnage4.afficherInfosPersonnage();

            if (personnage3.getPointsDeVie() > 0 && personnage4.getPointsDeVie() > 0) {
                tour.augmenteTour();
                affichage.afficherSeparateurDeTour();
            }
            if (personnage3.getPointsDeVie() <= 0 || personnage4.getPointsDeVie() <= 0) {
                fin = true;
            }
        } while (fin == false);
        System.out.println("");
        affichage.afficherSeparateurDeTour();
        System.out.println("");

        affichage.afficheVictoire(personnage3, personnage4);
        // </editor-fold>
    }

}
