package teste;
import exo4.PollueurToutDroit;
import monde.Monde;
public class TestRobots {
    public static void main(String[] args) {
        //creation d'un monde
        Monde m=new Monde(8,4);
        // System.out.println(m.toString());
        // System.out.println( m.nbPapiersGras());
        // m.metPapierGras(5, 5);
        // System.out.println(m.toString());
        // System.out.println( m.nbPapiersGras());
        PollueurToutDroit robot=new PollueurToutDroit(m,2);
        robot.parcourir();
        // System.out.println(m.toString());

    }
    
}
