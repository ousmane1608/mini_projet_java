package teste;

import exo4.PollueurToutDroit;
import exo5.PollueurSauteur;
import exo6.RobotNettoyeur;
import exo7.NettoyeurDistrait;
import monde.Monde;

public class TestRobots {

    public static void main(String[] args) {
        // **Création d'un monde**
        Monde m = new Monde();

        // Affichage de l'état initial du monde
        System.out.println("**État initial du monde **:");
        System.out.println(m.toString());
        System.out.println("**Nombre de cases contenant du papier gras **: " + m.nbPapiersGras());
        System.out.println();

        // Ajout de papier gras dans une case spécifique
        m.metPapierGras(5, 5);
        System.out.println("**Ajout de papier gras dans la case (5, 5) **:");
        System.out.println(m.toString());
        System.out.println("**Nombre de cases contenant du papier gras** : " + m.nbPapiersGras());
        System.out.println();

        // Test du robot "PollueurToutDroit"
        PollueurToutDroit robotPollueur = new PollueurToutDroit(m, 3);
        System.out.println("**Position initiale du robot pollueur tout droit** : (" + robotPollueur.getPosx() + ", " + robotPollueur.getPosy() + ")");
        System.out.println("**Parcours du robot pollueur tout droit **:");
        robotPollueur.parcourir();
        System.out.println("**Position finale du robot pollueur tout droit** : (" + robotPollueur.getPosx() + ", " + robotPollueur.getPosy() + ")");
        System.out.println("**État du monde après le parcours du robot pollueur tout droit** :");
        System.out.println(m.toString());
        System.out.println();

        // Test du robot "PollueurSauteur"
        PollueurSauteur pollueurSauteur = new PollueurSauteur(m, 5, 2);
        System.out.println("**Position initiale du robot pollueur sauteur **: (" + pollueurSauteur.getPosx() + ", " + pollueurSauteur.getPosy() + ")");
        System.out.println("**Parcours du robot pollueur sauteur **:");
        pollueurSauteur.parcourir();
        System.out.println("**Position finale du robot pollueur sauteur** : (" + pollueurSauteur.getPosx() + ", " + pollueurSauteur.getPosy() + ")");
        System.out.println("**État du monde après le parcours du robot pollueur sauteur** :");
        System.out.println(m.toString());
        System.out.println();

        // Test du robot **NettoyeurDistrait**
        NettoyeurDistrait robotNettoyeur = new NettoyeurDistrait(m);
        System.out.println("** Position initiale du robot nettoyeur distrait **: (" + robotNettoyeur.getPosx() + ", " + robotNettoyeur.getPosy() + ")");
        System.out.println("** Parcours du robot nettoyeur distrait ** :");
        robotNettoyeur.parcourir();
        System.out.println("**Position finale du robot nettoyeur distrait** : (" + robotNettoyeur.getPosx() + ", " + robotNettoyeur.getPosy() + ")");
        System.out.println("**État du monde après le parcours du robot nettoyeur distrait** :");
        System.out.println(m.toString());
        //Test du **robotNettoyeur**
        RobotNettoyeur nettoyeur = new RobotNettoyeur(m);
        System.out.println("** Position initiale du robot RobotNettoyeur ** : (" + nettoyeur.getPosx() + ", " + nettoyeur.getPosy() + ")");
        System.out.println("**vParcours du robot nettoyeur ** :");
        nettoyeur.parcourir();
        System.out.println("**Position finale du robot nettoyeur** : (" + nettoyeur.getPosx() + ", " + nettoyeur.getPosy() + ")");
        System.out.println("**État du monde après le parcours du robot nettoyeur ** :");
        System.out.println(m.toString());
    }
}
