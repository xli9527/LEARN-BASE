package hsd3;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mex = scan.nextInt();
        int arr[] = new int[num];
        int count = 0;
        int temp = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mex){
                index = i;
                break;
            }
        }

        temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mex){
                break;
            }
            if (arr[i] == temp){
                temp++;
            } else {
                count++;
                temp++;
            }

        }

        System.out.println(count);
    }

}
