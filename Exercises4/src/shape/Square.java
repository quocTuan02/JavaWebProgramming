package shape;

public class Square extends Rectangle{
    public boolean checkSquare(Coordinates a, Coordinates b, Coordinates c, Coordinates d){
        if (checkRectangle(a,b,c,d)){
            if (length(vector(a,b))==length(vector(b,c))) {
                return true;
            }
            if (length(vector(a,c))==length(vector(c,d))){
                return true;
            }
            if (length(vector(a,d))==length(vector(d,c))){
                return true;
            }
        }
        return false;
    }

}
