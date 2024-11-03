package yuekao11_3;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < 3; i++) {
            StringBuilder v = new StringBuilder(4*n+1-i);
            if (i == 0){
                for (int j = 0; j < 4*n+1-i; j++) {
                    if(j % 4 ==0){
                        v.append("*");
                    } else {
                        v.append(" ");
                    }
                }
            } else if (i == 1) {
                for (int j = 0; j < 4*n+1-i; j++) {
                    if (j % 2 == 0){
                        v.append(" ");
                    } else {
                        v.append("*");
                    }
                }
            } else {
                for (int j = 0; j < 4*n+1-i; j++) {
                    if ((j-2) % 4 == 0){
                        v.append("*");
                    } else {
                        v.append(" ");
                    }
                }
            }
            System.out.println(v.toString());
        }

    }
}