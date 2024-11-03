package yuekao11_3;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            String str = new StringBuilder(Integer.toString(i)).reverse().toString();

            if (Integer.toString(i).equals(str)){
                count++;
            }
        }


        System.out.println(count);
    }
}