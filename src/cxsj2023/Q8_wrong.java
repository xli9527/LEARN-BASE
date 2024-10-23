package cxsj2023;

import java.util.Objects;
import java.util.Scanner;

public class Q8_wrong {
    public static void main(String[] args) {
        int time;
        int count=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            time=scan.nextInt();
            for (int i = 0; i < time; i++) {
                String people[] = new String[scan.nextInt()];
                for (int j = 0; j < people.length; j++) {
                    String temp=scan.next();
                    if (Objects.equals(temp, "C")){
                        people[j]="A";
                    }else{
                        people[j]=temp;
                    }
                }
                for (int j = 0; j < people.length-1; j++) {
                    if(Objects.equals(people[i], "A")){
                        for (int k = j; k < people.length-1; k++) {
                            people[k]=people[k+1];
                        }
                        count++;
                        people[people.length-count]="A";
                    }
                }
                for (String person : people) {
                    System.out.print(person + " ");
                }
            }


        }
        scan.close();
    }
}
