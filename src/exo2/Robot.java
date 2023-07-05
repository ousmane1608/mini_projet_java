package exo2;
import monde.Monde;
import java.util.Random;	
abstract public class Robot{
    protected int posx;
    protected int posy;
    protected Monde m;
   
    public Robot(int x,int y,Monde	m){
        if (x<m.getNbL() && y<m.getNbC()) {
            this.posx=x;
            this.posy=y;
            this.m=m;
        }
        else{
            System.out.println("**impossible de sortir de ce monde!! **");
        }
        
    }
    public Robot(Monde m){
        this((new Random().nextInt(m.getNbL())), new Random().nextInt(m.getNbC()), m);
    }
    // – vaEn(int	i,	int	j) :	se	déplace	en	(i,	j)
    public void vaEn(int i,int j){
        if(i<m.getNbL() && j<m.getNbC()){
            posx=i;
            posy=j; 
        }
        else{
            System.out.println("vous ne pouvez pas sortir du monde!");
        } 
    }
    public abstract void parcourir();
     public int getPosx() {
        return posx;
    }
    public int getPosy() {
        return posy;
    }
    public Monde getM() {
        return m;
    }
}