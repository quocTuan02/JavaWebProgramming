package shape;

public class SquareTriangle extends Triangle {
    public boolean checkSquare(Coordinates a, Coordinates b,Coordinates c){
        if (checkTriangle(a, b, c)){
            if (((vector(a,b).x * vector(b,c).x ) + (vector(a,b).y * vector(b,c).y))==0){
                return true;
            }
            if (((vector(a,b).x * vector(a,c).x ) + (vector(a,b).y * vector(a,c).y))==0){
                return true;
            }
            if (((vector(b,c).x * vector(a,c).x ) + (vector(b,c).y * vector(a,c).y))==0){
                return true;
            }
        }
        return false;
    }

}
