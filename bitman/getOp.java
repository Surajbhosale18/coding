// this is the code for get bit opration 


import java.util.*;


public class getOp{

    public static void main(String args[]){

        int n = 10;
        int postion= 1;

        int bitMask= 1 << postion;

        if((n & bitMask)==0){
                       System.out.println("bit is zero");
        }else{
            System.out.println("bit is 1");
        }
    }

}
