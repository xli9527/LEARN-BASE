package hsd3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int count = 0;
        int num = 0;
        for (int i = L; i <= R; i++) {
            int tcount = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    tcount++;
                }
            }
            if (tcount > count){
                num = i;
                count = tcount;
            } else if (tcount == count && num < i) {
                num = i;
            }


        }
        System.out.println(num + " " +  count);
    }

}
