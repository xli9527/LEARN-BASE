package yuekao11_3;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int price[] = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = scan.nextInt();
        }

        int min=price[0];

        for (int i : price) {
            if (min > i){
                min = i;
            }
        }

        System.out.println(min);
    }
}