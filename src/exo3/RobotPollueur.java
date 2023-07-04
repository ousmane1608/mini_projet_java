package exo3;
import exo2.Robot;
import monde.Monde;

abstract public class RobotPollueur extends Robot {

    public RobotPollueur(int x, int y, Monde m) {
        super(x, y, m);
        //TODO Auto-generated constructor stub
    }
    public RobotPollueur(Monde m){
        super(m);
    }
    public void polluer(){
        getM().metPapierGras(getPosy(), getPosx());
    }    
}
