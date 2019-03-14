package shape;

public class Triangle extends Coordinates{

    public boolean checkTriangle(Coordinates a, Coordinates b, Coordinates c){
        if ((vector(a,b).x) / (vector(b,c).x) != (vector(a,b).y) / (vector(b,c).y)){
            return true;
        }
        return false;
    }

}
