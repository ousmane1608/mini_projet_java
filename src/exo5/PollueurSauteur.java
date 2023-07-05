package exo5;

import exo3.RobotPollueur;
import monde.Monde;

/**
 * La classe "PollueurSauteur" est une sous-classe de "RobotPollueur" et représente un robot pollueur se déplaçant en sautant dans un monde donné.
 */
public class PollueurSauteur extends RobotPollueur {

    private int deltax; // Variation de position en abscisse lors du saut

    /**
     * Constructeur de la classe "PollueurSauteur" avec une colonne de départ et une variation de position en abscisse spécifiées.
     *
     * @param m          Référence vers le monde dans lequel se trouve le robot pollueur
     * @param colDepart  Colonne de départ du robot pollueur
     * @param deltax     Variation de position en abscisse lors du saut
     */
    public PollueurSauteur(Monde m, int colDepart, int deltax) {
        super(0, colDepart, m);
        this.deltax = deltax;
    }

    /**
     * Méthode qui représente le parcours du robot pollueur en sautant. Le robot se déplace en zigzag, sautant à chaque ligne impaire et retournant à la colonne de départ lorsqu'il atteint la fin d'une ligne.
     */
    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            if (i % 2 == 0) {
                if (posy < m.getNbC()) {
                    vaEn(i, posy);
                    polluer();
                    posy += deltax;
                }
            } else {
                if (posy < m.getNbC()) {
                    vaEn(i, posy);
                    polluer();
                } else {
                    posy = 0;
                    vaEn(i, posy);
                    polluer();
                }
            }
        }
    }
}
