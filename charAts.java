import java.util.*;

public class charAts{
     public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         String firstName= sc.nextLine();
          String lastName= sc.nextLine();
         String fullName= firstName +" "+ lastName;
        

         for(int i=0; i<fullName.length(); i++){
             System.out.println(fullName.charAt(i));           

        }
          

     }


}