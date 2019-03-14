package shape;

public class IsoscelesTriangle  extends Triangle{
    public boolean checkIsosceles(Coordinates a, Coordinates b, Coordinates c){
        if (checkTriangle(a, b, c)){
            if (length(vector(a,b))==length(vector(b,c))){
                return true;
            }
            if (length(vector(a,c))==length(vector(b,c))){
                return true;
            }
            if (length(vector(a,b))==length(vector(a,c))){
                return true;
            }
        }
        return false;
    }
}
