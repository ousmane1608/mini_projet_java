package exo5;

import exo3.RobotPollueur;
import monde.Monde;

public class PollueurSauteur extends RobotPollueur {
    private int deltax;
    public PollueurSauteur( Monde m,int colDepart,int deltax) {
        super(0, colDepart, m);
        this.deltax=deltax;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
          if (i%2==0) {
                if (posy<m.getNbC()) {
                    vaEn(i, posy);
                    polluer();
                    posy+=deltax;
                }
            }
           else {
                if (posy<m.getNbC()) {
                    vaEn(i, posy);
                    polluer();
                }
                else{
                    posy=0;
                    vaEn(i, posy);
                    polluer();
                }
            } 
        }
}
}
