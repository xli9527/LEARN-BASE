import  java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        String str = "";                        //输入
        System.out.println("please enter something");
        Scanner ipt = new Scanner(System.in);
        if(ipt.hasNextLine()){
            str=ipt.nextLine();
        }
        ipt.close();

        String[] strarray= str.split(" ");          //分割字符
        for (String s : strarray) {
            System.out.println(s);          //输出
        }
    }
}
