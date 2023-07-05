package exo4;

import exo3.RobotPollueur;
import monde.Monde;

/**
 * La classe "PollueurToutDroit" est une sous-classe de "RobotPollueur" et représente un robot pollueur se déplaçant tout droit dans un monde donné.
 */
public class PollueurToutDroit extends RobotPollueur {

    /**
     * Constructeur de la classe "PollueurToutDroit" avec une colonne de départ spécifiée.
     *
     * @param m          Référence vers le monde dans lequel se trouve le robot pollueur
     * @param colDepart  Colonne de départ du robot pollueur
     */
    public PollueurToutDroit(Monde m, int colDepart) {
        super(0, colDepart, m);
    }

    /**
     * Méthode qui représente le parcours du robot pollueur tout droit. Il se déplace de haut en bas dans chaque colonne et pollue chaque case qu'il traverse.
     */
    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            vaEn(i, posy);
            polluer();
        }
    }
}
