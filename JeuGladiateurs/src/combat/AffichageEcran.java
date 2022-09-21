package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("\n <<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>> \n");
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println("\n**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("\n-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnageA, Personnage personnageB) {
        if (personnageA.getPointsDeVie() > 0) {
            System.out.println(personnageA.getNom() + " gagne le combat!!!");
        }
        else{
            System.out.println(personnageB.getNom() + " gagne le combat!!!");
        }
    }
    // </editor-fold>
}
