package monde;
public class Monde
{
    private int nbL;
    private int nbC;
    private boolean Mat[][];
  
    public Monde()
    {
        this.nbL=10;
        this.nbC=10;
        this.Mat=new boolean[10][10];
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Mat[i][j] = false;
            }
        }
    }
    public Monde(int nbl,int nbc)
    {
        this.nbL=nbl;
        this.nbC=nbc;
        this.Mat=new boolean[nbL][nbC];
    }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nbL; i++) {
                for (int j = 0; j < nbC; j++){
                    if (Mat[i][j]==true) {
                        sb.append("o"); // Papier gras présent
                    } else{
                        sb.append("."); // Aucun papier gras
                    }
                }
            sb.append("\n"); // Passage à la ligne
            }
            return sb.toString();
        }
// – metPapierGras(inti;	intj) :	met	un	papier	gras	dans	la	case	(i;	j).
// – prendPapierGras(inti;	intj) :	enlève	le	papier	gras	de	la	case	(i;	j).
// – estSale(inti;	intj)	:	teste	si	la	case	(i,	j)	a	un	papier	gras.
// – nbPapiersGras() :	qui	rend	le	nombre	de	papier	gras	dans	le	monde.
    public void metPapierGras(int i,int j){
        Mat[i][j]=true;
    }
    public void prendrePapierGras(int i,int j){
        if(estSale(i,j)){
            Mat[i][j]=false;
        }
        
    }
    public boolean estSale(int i,int j){
        boolean response=false;
        if(Mat[i][j]==true){
            response=true;
        }
        return response;
    }
    public int nbPapiersGras(){
        int i,j;
        int nbPapierGras=0;
        for(i=0;i<nbL;i++){
            for (j = 0; j < nbC; j++) {
               if(estSale(i, j)){
                nbPapierGras++;
               }
            }
        }
        return nbPapierGras;
    }

      public boolean[][] getMat() {
        return Mat;
    }
    public int getNbC() {
        return nbC;
    }
    public int getNbL() {
        return nbL;
    }
    public void setMat(boolean[][] mat) {
        Mat = mat;
    }
    public void setNbC(int nbC) {
        this.nbC = nbC;
    }
    public void setNbL(int nbL) {
        this.nbL = nbL;
    }
}