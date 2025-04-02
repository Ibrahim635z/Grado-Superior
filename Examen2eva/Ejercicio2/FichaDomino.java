package Examen.Ejercicio2;

public class FichaDomino {
    int x,y;

    public FichaDomino(int x,int y){

        this.x=x;
        this.y=y;
    }

    public Boolean encajar(FichaDomino f1){
        if(f1.x==x || f1.y==x || f1.x==y || f1.y==y){
            return true;
        }else{
            return false;
        }
       
    }

    @Override
    public String toString() {
        
        return "["+x+"|"+y+"]";
    }

}
