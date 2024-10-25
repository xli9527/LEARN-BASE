package cxsj2023;

import java.util.Scanner;

public class Q10 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String answer;
            if (scan.hasNext()){
                int time = scan.nextInt();
                while (time > 0){

                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    int q = scan.nextInt();
                    int pos = scan.nextInt();
                    int t = scan.nextInt();


                    int twt = (pos - 1) * t;
                    int stu = twt/x;
                    int acj = (twt-q)/y;

                    if (acj < 0){
                        answer = "No";
                    }

                    if (acj > stu){
                        answer = "Yes";
                    } else if (acj == stu) {
                        answer = "So So";
                    } else {
                        answer = "No";
                    }
                    System.out.println(answer);
                    time--;
                }
            }


        }


}
