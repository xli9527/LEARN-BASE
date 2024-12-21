package hsd3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        String str = scan.next();
        List<Character> sli = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            sli.add(str.charAt(i));
        }

        int idx = sli.size()-1;

        while (idx > 1){
            if (sli.get(idx-1)==sli.get(idx)-1 || sli.get(idx+1)==sli.get(idx)-1){
                sli.remove(idx);
                idx = sli.size()-1;
            }
            idx--;
            count++;
        }

        System.out.println(count);

    }

}
