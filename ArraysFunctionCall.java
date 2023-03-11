package Arrays;

import java.util.Scanner;

public class ArraysFunctionCall {

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

    }
}
