package Arrays;

import java.util.Scanner;

public class ArrayTakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n; i++ ){
            System.out.print(input[i] + " ");
        }

    }

}
