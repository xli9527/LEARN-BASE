import java.util.Scanner;

public class t1 {

    public static void main(String[] args){
        System.out.println("请键入文字");
        Scanner ipt = new Scanner(System.in);

        if (ipt.hasNextLine()) {
            String str = ipt.nextLine();
            System.out.println(str);
        }
        ipt.close();

    }
//  输入模块


}

