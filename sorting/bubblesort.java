import java.util.*;
// bubble sort

public class bubblesort{

   public static void sort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   }

   public static void main(String[] args) {
    int abc[]= {3, 4, 1,5};
    bubblesort.sort(abc);
    for(int i=0; i<abc.length; i++){
        System.out.print(abc[i]);
    }
    
   }
}