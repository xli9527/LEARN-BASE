package yuekao11_3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char symbol = scan.next().charAt(0);

        switch (symbol){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b==0){
                    System.out.println("NaN");
                } else {
                    System.out.println(a/b);
                }
            break;
        }

    }
}