import java.util.Scanner;

public class updatebitOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("which bit want to convert");
        int bit = sc.nextInt();

        int n=5;
        int postion =2;
        int bitMask = 1 << postion;
        
        
        if(bit == 1){
          int newNumber  =bitMask|n;
            System.out.println(newNumber);


              
        }else{
            int negation = ~(bitMask);
            int newNumber = negation & bitMask;
            System.out.println(newNumber);

        }
    }
}
