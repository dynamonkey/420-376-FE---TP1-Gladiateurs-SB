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
public class Mirmillon extends Personnage{
    String classeCombat;
    
    public Mirmillon(String classeCombat, String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative){
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
        this.classeCombat = classeCombat;
    }
    
    @Override
    public void setNewInitiativeRandom(){
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        setInitiative(nombreAleatoire);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPointsDeVie() > 0) {
            
            System.out.println("\nRapide comme il est, " + this.getNom() + " attaque une deuxieme fois!");
            super.frapperPersonnage(personnageCible);
            System.out.println("");
        }
        else{
            System.out.println(this.getNom() + " Tranche la tête de " + personnageCible.getNom());
        }
            
    }
    
    @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
	System.out.println("Classe : " + this.classeCombat);
    }
            
}
