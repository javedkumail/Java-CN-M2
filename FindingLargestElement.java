package Arrays;

import java.util.Scanner;



public class FindingLargestElement {
    public static int sum(int[] arr) {
        int sum = 0;
        for ( int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
           
       }

    public static int LargestInArray(int input[]){  
        int max = Integer.MIN_VALUE;                                                                        
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
   }


    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        return input;
        
    }

    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        print(arr);
        int largest = LargestInArray(arr);
        System.out.println("Largest: " + largest); 
        System.out.println("sum of all elemts: " + sum(arr));       

    }
}
