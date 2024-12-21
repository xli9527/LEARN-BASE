package hsd2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        boolean flag = true ;
        for (int i = 1; i < num.length()-1; i++) {
            if ((int)num.charAt(i-1) > (int)num.charAt(i) && (int)num.charAt(i) < (int)num.charAt(i+1) || (int)num.charAt(i-1) < (int)num.charAt(i) && (int)num.charAt(i) > (int)num.charAt(i+1)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag){
            System.out.println("Life");
        } else {
            System.out.println("Leave");
        }
    }
}

