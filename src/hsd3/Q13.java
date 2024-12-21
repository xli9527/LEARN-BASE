package hsd3;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long count = 0;
        long hw = 0;
        long add = 0;
        while(count < num){
            StringBuilder sb = new StringBuilder(String.valueOf(add));
            StringBuilder sb2 = new StringBuilder(String.valueOf(add));
            if(sb.compareTo(sb2.reverse()) == 0){
                hw = add;
                count ++;
            }
            add++;
        }
        System.out.println(hw);
    }

}
