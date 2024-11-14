package cxsj2023_2024_2;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int sy = len;
        int step=(int) Math.sqrt(len);
        String answer="";


        while (sy>0 && step >= 0){
            int bl =(int) Math.pow(2,step);
            if (bl <= sy){
                sy -= bl;
                answer = bl + " " + answer;
            }
            step--;
        }
        System.out.println(sy);
        System.out.println(answer.trim());
    }
}
