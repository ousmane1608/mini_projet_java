package exo7;
import exo6.RobotNettoyeur;
import monde.Monde;

public class NettoyeurDistrait extends RobotNettoyeur{
    public NettoyeurDistrait(Monde m){
        super(m);
    }
    public void parcourir(){
        int compteur=0;
         for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                // Parcours de gauche à droite
                for (int j = 0; j <m.getNbC(); j++) {
                     if(m.estSale(i, j)){
                        compteur+=1;
                        if (compteur%2!=0) {
                            vaEn(i, j);
                            nettoyer(); 
                        }
                        
                    }
                    
                }
            } else {
                // Parcours de droite à gauche
                for (int j = m.getNbC() - 1; j >= 0; j--) {
                     if(m.estSale(i, j)){
                        compteur+=1;
                        if (compteur%2!=0) {
                            vaEn(i, j);
                            nettoyer(); 
                        }
                        
                    }
                }
            }
        }
    }
}