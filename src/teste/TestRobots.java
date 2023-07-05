package teste;
import exo5.PollueurSauteur;
import exo6.RobotNettoyeur;
import exo7.NettoyeurDistrait;
import monde.Monde;
public class TestRobots {
    public static void main(String[] args) {
        //creation d'un monde
        Monde m=new Monde();
        // System.out.println(m.toString());
        // System.out.println( m.nbPapiersGras());
        // m.metPapierGras(5, 5);
        // System.out.println(m.toString());
        // System.out.println( m.nbPapiersGras());
        //************test pollueur tout droit********
        // PollueurToutDroit robot=new PollueurToutDroit(m,5);
        // System.out.println(robot.getPosx());
        // System.out.println(robot.getPosy());
        // robot.parcourir();
        // System.out.println(robot.getPosy());
        // System.out.println(m.toString());
        //************test pollueur sauteur********
        // RobotNettoyeur robonettoyeur=new RobotNettoyeur(m);
        // PollueurSauteur sauteur=new PollueurSauteur(m,5,2);
        // System.out.println(m.toString());
        // sauteur.parcourir();
        // System.out.println(m.toString());
        // robonettoyeur.parcourir();
        // System.out.println(m.toString());
        // *******netoyeur distrait********
        RobotNettoyeur robonettoyeur=new NettoyeurDistrait(m);
        PollueurSauteur sauteur=new PollueurSauteur(m,5,2);
        System.out.println(m.toString());
        sauteur.parcourir();
        System.out.println(m.toString());
        robonettoyeur.parcourir();
        System.out.println(m.toString());
    }
    
}
