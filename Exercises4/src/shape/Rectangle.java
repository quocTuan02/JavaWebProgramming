package shape;

public class Rectangle extends Parallelogram {
    public  double corner(Coordinates a,Coordinates b){
        // cos=
        double corner =(a.x*b.x + a.y*b.y) /
                (length(a) * length(b));
        return corner ;
    }

    public boolean checkRectangle(Coordinates a, Coordinates b, Coordinates c ,Coordinates d){
        if (checkParallelogram(a, b, c, d)){

            if (corner(vector(a,b),vector(a,c))==0) return true;

            if (corner(vector(a,b),vector(a,d))==0) return true;

            if (corner(vector(a,d),vector(a,c))==0) return true;
        }
        return false;
    }



}
