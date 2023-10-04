

/**
 *
 * @author 33651
 */
package org.centrale.objet.WoE;

/** Classe Monstre
 * 
 */
public abstract class Monstre extends Creature{
    

    /**
     *Constructeur principal
     * @param ptVie Points de vie
     * @param degAtt Degats d'attaque
     * @param ptPar Points de parade
     * @param pageAtt Pourcentage de reussite d'une attaque
     * @param pagePar Pourcentage de reussite d'une parade
     * @param pos position du monstre
     */
    
    
public Monstre(int ptVie, int degAtt, int ptPar, int pageAtt, int pagePar, Point2D pos){
    super(ptVie,degAtt,ptPar,pageAtt, pagePar,pos);
}
    /**
     *Constructeur de copie
     * @param m Monstre
     */
    public Monstre(Monstre m){
        super((Creature) m);    
    }
/**
 * Constructeur par défaut
 */
    public Monstre() {
    }
    
   
   

    
}