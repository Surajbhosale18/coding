import java.util.*;
public class revers {

    public static void main(String[] args) {
       
       StringBuilder name= new StringBuilder("suraj");
       StringBuilder abc = new StringBuilder();

       Scanner sc = new Scanner(System.in);

       StringBuilder word = new StringBuilder(sc.next());

       for(int i=word.length()-1; i>=0; i--){
        abc.append(word.charAt(i));

        


       }
       System.out.println(abc);

    
}
}
