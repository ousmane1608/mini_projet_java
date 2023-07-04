package exo5;

import exo3.RobotPollueur;
import monde.Monde;

public class PollueurSauteur extends RobotPollueur {
    private int deltax;
    public PollueurSauteur(int x, int y, Monde m,int deltax) {
        super(x, y, m);
        this.deltax=deltax;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void parcourir() {
        while(getPosx()<getM().getNbL()-1){
                if (getPosy()<getM().getNbC()-1) {
                    polluer();
                    vaEn(getPosx()+1,getPosy()+deltax);
                }
                else{
                    vaEn(getPosx(),0);
                }
            
        }
        throw new UnsupportedOperationException("Unimplemented method 'parcourir'");
    }

    

}
