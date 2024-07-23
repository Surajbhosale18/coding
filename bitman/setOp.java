import java.util.*;

public class setOp{

    public static void main(String[] args) {
        int n = 5;
        int position = 1;

        int bitMask = 1 << position;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}