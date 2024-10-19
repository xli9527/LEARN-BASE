package cxsj2023;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int cost=0;
        int prise=8;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int time = scan.nextInt();
            if (time>1 && time<=5){
                cost=time * prise;
            } else if (time > 5) {
                cost=5 * prise;
                for (int i = 0; i < time-5; i++) {
                    prise++;
                    cost+=prise;
                }
            }
            if (cost>300){
                cost=300;
            }
        }
        scan.close();
        System.out.println(cost);
    }
}
