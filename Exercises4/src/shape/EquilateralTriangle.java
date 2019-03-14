package shape;

public class EquilateralTriangle extends IsoscelesTriangle{
    public boolean checkEquilateral(Coordinates a, Coordinates b, Coordinates c){
        if (checkIsosceles(a, b, c)){
            if (length(vector(a,b))==length(vector(a,c)) && length(vector(a, b))==length(vector(b,c))){
                return true;
            }
        }
        return false;
    }
}
