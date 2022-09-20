/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author ETI
 */
public class Retiaire extends Personnage{
        String classeCombat;
    
    public Retiaire(String classeCombat, String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative){
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
        this.classeCombat = classeCombat;
    }
    
        @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
	System.out.println("Classe : " + this.classeCombat);
    }
}
