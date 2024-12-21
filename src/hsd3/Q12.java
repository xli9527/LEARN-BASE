package hsd3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        List<String> sli = new ArrayList<String>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            sli.add(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < sli.size()-1; i++) {
            if (sli.get(i).equals("C") && sli.get(i + 1) .equals("G")){
                sli.remove(i);
                sli.add(i,"G");
                break;
            }
            if (sli.get(i).equals("C") && sli.get(i + 1) .equals("B")){
                sli.remove(i);
                sli.add(i,"B");
                break;
            }
        }

        int idx = 0;

        while (idx < sli.size()-1){
            if (idx == sli.size()-1){
                break;
            }

            if (sli.get(idx).equals(sli.get(idx + 1)) && (sli.get(idx).equals("G") || sli.get(idx).equals("B"))){
                sli.remove(idx);
                sli.remove(idx);
                idx=0;
                continue;
            }

            idx++;
        }

        for (int i = 0; i < sli.size(); i++) {
            if (sli.get(i) != ""){
                count++;
            }
        }
        System.out.println(count);
    }

}
