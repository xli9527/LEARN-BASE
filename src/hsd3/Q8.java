package hsd3;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;

        for (int i = 1; i <= num ; i++) {
            int bnum=0;
            int tnum = i;
            int count = 0;
            while (tnum != 0){
                bnum = tnum % 2 + bnum*10;
                if (tnum % 2 ==1){
                    count++;
                }
                tnum /= 2;
            }
            if (count % 2 == 1){
                answer++;
            }
        }

        System.out.println(answer);
    }

}
