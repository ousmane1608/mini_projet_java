package exo3;
import exo2.Robot;
import monde.Monde;

/**
 * La classe abstraite "RobotPollueur" est une sous-classe de "Robot" et représente un robot pollueur dans un monde donné.
 */
abstract public class RobotPollueur extends Robot {

    /**
     * Constructeur de la classe "RobotPollueur" avec des coordonnées spécifiées.
     *
     * @param x Position en abscisse du robot pollueur
     * @param y Position en ordonnée du robot pollueur
     * @param m Référence vers le monde dans lequel se trouve le robot pollueur
     */
    public RobotPollueur(int x, int y, Monde m) {
        super(x, y, m);
    }

    /**
     * Constructeur de la classe "RobotPollueur" avec des coordonnées aléatoires.
     *
     * @param m Référence vers le monde dans lequel se trouve le robot pollueur
     */
    public RobotPollueur(Monde m) {
        super(m);
    }

    /**
     * Méthode qui permet au robot pollueur de polluer la case sur laquelle il se trouve.
     */
    public void polluer() {
        m.metPapierGras(posx, posy);
    }
}
