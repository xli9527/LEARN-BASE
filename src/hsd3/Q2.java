package hsd3;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num % 7 == 0){
            System.out.println("hello world.");
        } else if (num % 2 == 0) {
            System.out.println("if you don't walk out, you will think that this is the whole world.");
        } else if (num % 5 == 0) {
            System.out.println("life isn't like in the movies.life is much harder.");
        } else {
            System.out.println("right now the paradiso needs you and you need the paradiso.");
        }
    }

}
