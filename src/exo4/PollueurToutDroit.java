package exo4;

import exo3.RobotPollueur;
import monde.Monde;

public class PollueurToutDroit extends RobotPollueur{
     private int colDepart;
    public PollueurToutDroit(Monde m,int colDepart) {
        super(0, colDepart, m);
        //TODO Auto-generated constructor stub
    }
    // public PollueurToutDroit(Monde m,int colDepart){
    //     super(m);
    //     this.colDepart=colDepart;
    // }
    @Override
    public void parcourir(){
        int i;
        for(i=0;i<getM().getNbL();i++){
            vaEn(i, colDepart);
            polluer();    
        }
    }

  
    
    
}