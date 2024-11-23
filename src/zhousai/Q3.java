package zhousai;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        if (arr[0][0] + arr[0][1] == arr[0][0] + arr[1][0]){
            count++;
        }
        if (arr[1][1] + arr[0][1] == arr[1][1] + arr[1][0]){
            count++;
        }
        if (arr[1][0] + arr[1][1] == arr[1][0] + arr[0][0]){
            count++;
        }
        if (arr[0][1] + arr[1][1] == arr[0][1] + arr[0][0]){
            count++;
        }

        if (count > 0){
            System.out.println("YE5");
        } else {
            System.out.println("N0");
        }
    }
}
