package exo2;
import monde.Monde;
import java.util.Random;

/**
 * La classe abstraite "Robot" représente un robot dans un monde donné.
 */
abstract public class Robot {

    protected int posx; // Position en abscisse du robot
    protected int posy; // Position en ordonnée du robot
    protected Monde m; // Référence vers le monde dans lequel se trouve le robot

    /**
     * Constructeur de la classe "Robot" avec des coordonnées spécifiées.
     *
     * @param x Position en abscisse du robot
     * @param y Position en ordonnée du robot
     * @param m Référence vers le monde dans lequel se trouve le robot
     */
    public Robot(int x, int y, Monde m) {
        if (x < m.getNbL() && y < m.getNbC()) {
            this.posx = x;
            this.posy = y;
            this.m = m;
        } else {
            System.out.println("** Impossible de sortir de ce monde !! **");
        }
    }

    /**
     * Constructeur de la classe "Robot" avec des coordonnées aléatoires.
     *
     * @param m Référence vers le monde dans lequel se trouve le robot
     */
    public Robot(Monde m) {
        this((new Random().nextInt(m.getNbL())), new Random().nextInt(m.getNbC()), m);
    }

    /**
     * Déplace le robot vers les coordonnées spécifiées.
     *
     * @param i Nouvelle position en abscisse du robot
     * @param j Nouvelle position en ordonnée du robot
     */
    public void vaEn(int i, int j) {
        if (i < m.getNbL() && j < m.getNbC()) {
            posx = i;
            posy = j;
        } else {
            System.out.println("Vous ne pouvez pas sortir du monde !");
        }
    }

    /**
     * Méthode abstraite qui représente le parcours du robot.
     */
    public abstract void parcourir();

    /**
     * Retourne la position en abscisse du robot.
     *
     * @return Position en abscisse du robot
     */
    public int getPosx() {
        return posx;
    }

    /**
     * Retourne la position en ordonnée du robot.
     *
     * @return Position en ordonnée du robot
     */
    public int getPosy() {
        return posy;
    }

    /**
     * Retourne la référence vers le monde dans lequel se trouve le robot.
     *
     * @return Référence vers le monde du robot
     */
    public Monde getM() {
        return m;
    }
}
