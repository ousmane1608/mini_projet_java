package exo6;

import exo2.Robot;
import monde.Monde;

public class RobotNettoyeur extends Robot {
    public RobotNettoyeur(Monde m){
        super(0, 0,m);
    }
    public void nettoyer(){
        m.prendrePapierGras(posx,posy);
    }
    @Override
    public void  parcourir() {
         for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                // Parcours de gauche à droite
                for (int j = 0; j <m.getNbC(); j++) {
                    vaEn(i, j);
                    nettoyer();
                }
            } else {
                // Parcours de droite à gauche
                for (int j = m.getNbC() - 1; j >= 0; j--) {
                    vaEn(i, j);
                    nettoyer();
                }
            }
        }
    }
}
