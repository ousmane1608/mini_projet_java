package exo7;
import exo6.RobotNettoyeur;
import monde.Monde;

/**
 * La classe "NettoyeurDistrait" est une sous-classe de "RobotNettoyeur" et représente un robot nettoyeur distrait dans un monde donné.
 */
public class NettoyeurDistrait extends RobotNettoyeur {

    /**
     * Constructeur de la classe "NettoyeurDistrait".
     *
     * @param m Référence vers le monde dans lequel se trouve le robot nettoyeur distrait
     */
    public NettoyeurDistrait(Monde m) {
        super(m);
    }

    /**
     * Méthode qui représente le parcours du robot nettoyeur distrait. Le robot nettoyeur distrait parcourt les lignes du monde et nettoie les cases sales de manière alternative.
     */
    public void parcourir() {
        int compteur = 0;
        for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                // Parcours de gauche à droite
                for (int j = 0; j < m.getNbC(); j++) {
                    if (m.estSale(i, j)) {
                        compteur += 1;
                        if (compteur % 2 != 0) {
                            vaEn(i, j);
                            nettoyer();
                        }
                    }
                }
            } else {
                // Parcours de droite à gauche
                for (int j = m.getNbC() - 1; j >= 0; j--) {
                    if (m.estSale(i, j)) {
                        compteur += 1;
                        if (compteur % 2 != 0) {
                            vaEn(i, j);
                            nettoyer();
                        }
                    }
                }
            }
        }
    }
}
