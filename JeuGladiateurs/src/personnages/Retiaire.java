/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Retiaire extends Personnage{
        String classeCombat;
        Boolean filetEnMain = true;
    
    public Retiaire(String classeCombat, String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative){
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
        this.classeCombat = classeCombat;
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        
        if (filetEnMain) {
            filetEnMain = false;
            Random rand = new Random();
            int minValue = 0;
            int maxValue = 100;
            int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
            System.out.println(this.getNom() + " lance son filet.");
                if (nombreAleatoire < 11) {
                
                    personnageCible.setPointsDeVie(0);
                    System.out.println(this.getNom() + " reussi et ampale " + personnageCible.getNom() + " a la mort");
                }
                else{
                    
                    System.out.println(this.getNom() + " echoue son lancer");
                }
        }
        
        else{
            filetEnMain = true;
            System.out.println(this.getNom() + " n'a pas son filet en main, il en profite donc pour le ramasser et effectuer un coup regulier!");
            super.frapperPersonnage(personnageCible);           
        }
    }
    
        @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
	System.out.println("Classe : " + this.classeCombat);
    }
}
