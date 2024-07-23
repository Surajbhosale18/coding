import java.util.*;
public class selection {

    public static void select(int arr[]){
        for(int i=0; i<arr.length-1; i++){
                int min= i;
                for(int j= 0; j<arr.length-1-i; j++){
                    if(min<arr[j+1]){
                        int temp =min;
                        min= arr[j+1];
                        arr[j+1]=temp;
                    }

                }
        }
    }

    public static void main(String[] args) {
        int abc[]={7,5,6,1};

        selection.select(abc);

        for(int i=0; i<abc.length; i++){
            System.out.println(abc[i]);
        }
    }
    
}
