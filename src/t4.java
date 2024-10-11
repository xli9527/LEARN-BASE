import java.lang.Math;

public class t4 {
    public static void main(String[] args) {//打印菱形
        int n = 10;
        int a=-(n/2);
        int b=n/2;
        for (int i = a;i <= b; i++) {    //层数

            for (int j = Math.abs(i)+1; j!=0; j--) {          //空白
                System.out.print(" ");
            }
            for (int j = (n/2-Math.abs(i))*2+1; j!=0; j--) {        //星号
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
