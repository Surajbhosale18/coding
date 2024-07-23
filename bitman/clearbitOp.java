import java.util.*;
public class clearbitOp {

    public static void main(String[] args) {
        int n= 5;
        int position =2;

        int bitMask = 1 << position;

        int negation = ~(bitMask);

        int newNumber = negation & n;
        System.out.println(newNumber);
    }
    
}
