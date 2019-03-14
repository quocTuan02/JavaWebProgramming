package shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Parallelogram extends Coordinates {



    public boolean checkParallelogram(Coordinates a,Coordinates b, Coordinates c, Coordinates d){
        // kiểm tra hình bình hành
        if (vector(a,b).x==vector(c,d).x && vector(a,b).y==vector(c,d).y){
            return true;
        }
        if (vector(a,b).x==vector(d,c).x && vector(a,b).y==vector(d,c).y){
            return true;
        }
        if (vector(a,c).x==vector(b,d).x && vector(a,c).y==vector(b,d).y){
            return true;
        }
        if (vector(a,c).x==vector(d,b).x && vector(a,c).y==vector(d,b).y){
            return true;
        }
        if (vector(a,d).x==vector(c,b).x && vector(a,d).y==vector(c,b).y){
            return true;
        }
        if (vector(a,d).x==vector(b,c).x && vector(a,d).y==vector(b,c).y){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {


    }


}
