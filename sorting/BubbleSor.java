public class BubbleSor
 {
    public static void bubbleSort(int[] abc) {
        int n = abc.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (abc[j] > abc[j + 1]) {
                    // Swap abc[j] and abc[j + 1]
                    int temp = abc[j];
                    abc[j] = abc[j + 1];
                    abc[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] abc = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int num : abc) {
            System.out.print(num + " ");
        }
        
        bubbleSort(abc);
        
        System.out.println("\nSorted array:");
        for (int num : abc) {
            System.out.print(num + " ");
        }
    }
}
