package cxsj2023;

import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {
        int count=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (Integer.parseInt(str.substring(i,i+1))%2==0){
                    count++;
                }
            }
        }
        scan.close();
        System.out.println(count);

//        Right
    }
}
