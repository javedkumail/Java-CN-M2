//import util.java.Scanner;
package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int arr[] = new int[10]; // square brackets can be put in any direction while declaring array
                                 // indexing elememts always start with "0"
        // arr [11] = 15; // this will throw OutOfBoundException, aukaat se bahar

        arr[3] = 15;
        System.out.println(arr[3]);

        // default value of unassigned indices(boxes) is "0"

        int n = 10;
        int[] arr1 = new int[n];
        System.out.println(arr1[5]);
        

        
      
        char charArray[] = new char[11];
        charArray[0] = 'a';
        double chard[] = new double[12];
        chard[0] = 1.1;
        System.out.println(charArray[0]);
        System.out.println(chard[0]);

        boolean arrb[] = new boolean[5];
        System.out.println(arrb[0]);       // default value of boolean value will be false
    }
}
