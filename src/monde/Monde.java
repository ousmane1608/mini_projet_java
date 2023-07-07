package monde;

/**
 * La classe "Monde" représente un monde virtuel avec des cases qui peuvent contenir du papier gras.
 */
public class Monde {

    private int nbL; // Nombre de lignes du monde
    private int nbC; // Nombre de colonnes du monde
    private boolean Mat[][]; // Matrice représentant l'état des cases du monde

    /**
     * Constructeur par défaut de la classe "Monde". Initialise un monde avec une taille par défaut de 10x10 et aucune case sale.
     */
    public Monde() {
        this.nbL = 10;
        this.nbC = 10;
        this.Mat = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Mat[i][j] = false;
            }
        }
    }

    /**
     * Constructeur de la classe "Monde" avec une taille personnalisée.
     *
     * @param nbl Nombre de lignes du monde
     * @param nbc Nombre de colonnes du monde
     */
    public Monde(int nbl, int nbc) {
        this.nbL = nbl;
        this.nbC = nbc;
        this.Mat = new boolean[nbL][nbC];
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du monde avec les cases propres et sales.
     *
     * @return Représentation du monde en chaîne de caractères
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (Mat[i][j] == true) {
                    sb.append("o"); // Papier gras présent
                } else {
                    sb.append("."); // Aucun papier gras
                }
            }
            sb.append("\n"); // Passage à la ligne
        }
        return sb.toString();
    }

    /**
     * Ajoute du papier gras dans la case spécifiée.
     *
     * @param i Indice de ligne de la case
     * @param j Indice de colonne de la case
     */
    public void metPapierGras(int i, int j) {
        Mat[i-1][j-1] = true;
    }

    /**
     * Enlève le papier gras de la case spécifiée si elle est sale.
     *
     * @param i Indice de ligne de la case
     * @param j Indice de colonne de la case
     */
    public void prendrePapierGras(int i, int j) {
        if (estSale(i, j)) {
            Mat[i-1][j-1] = false;
        }
    }

    /**
     * Vérifie si la case spécifiée est sale (contient du papier gras).
     *
     * @param i Indice de ligne de la case
     * @param j Indice de colonne de la case
     * @return true si la case est sale, false sinon
     */
    public boolean estSale(int i, int j) {
        return Mat[i-1][j-1];
    }

    /**
     * RenvoSuite du commentaire Javadoc pour la classe "Monde" :

    * Renvoie le nombre de cases contenant du papier gras dans le monde.
     *
     * @return Le nombre de cases contenant du papier gras
     */
    public int nbPapiersGras() {
        int nbPapierGras = 0;
        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (estSale(i+1, j+1)) {
                    nbPapierGras++;
                }
            }
        }
        return nbPapierGras;
    }

    /**
     * Retourne la matrice représentant l'état des cases du monde.
     *
     * @return La matrice des cases du monde
     */
    public boolean[][] getMat() {
        return Mat;
    }

    /**
     * Retourne le nombre de colonnes du monde.
     *
     * @return Le nombre de colonnes du monde
     */
    public int getNbC() {
        return nbC;
    }

    /**
     * Retourne le nombre de lignes du monde.
     *
     * @return Le nombre de lignes du monde
     */
    public int getNbL() {
        return nbL;
    }

    /**
     * Définit la matrice représentant l'état des cases du monde.
     *
     * @param mat La matrice des cases du monde
     */
    public void setMat(boolean[][] mat) {
        Mat = mat;
    }

    /**
     * Définit le nombre de colonnes du monde.
     *
     * @param nbC Le nombre de colonnes du monde
     */
    public void setNbC(int nbC) {
        this.nbC = nbC;
    }

    /**
     * Définit le nombre de lignes du monde.
     *
     * @param nbL Le nombre de lignes du monde
     */
    public void setNbL(int nbL) {
        this.nbL = nbL;
    }
}
