package exo6;

import exo2.Robot;
import monde.Monde;

/**
 * La classe "RobotNettoyeur" est une sous-classe de "Robot" et représente un robot nettoyeur dans un monde donné.
 */
public class RobotNettoyeur extends Robot {

    /**
     * Constructeur de la classe "RobotNettoyeur".
     *
     * @param m Référence vers le monde dans lequel se trouve le robot nettoyeur
     */
    public RobotNettoyeur(Monde m) {
        super(0, 0, m);
    }

    /**
     * Méthode qui permet au robot nettoyeur de nettoyer la case sur laquelle il se trouve en enlevant le papier gras.
     */
    public void nettoyer() {
        m.prendrePapierGras(posx, posy);
    }

    /**
     * Méthode qui représente le parcours du robot nettoyeur. Le robot parcourt les lignes du monde en nettoyant chaque case dans un mouvement de va-et-vient.
     */
    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                // Parcours de gauche à droite
                for (int j = 0; j < m.getNbC(); j++) {
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
