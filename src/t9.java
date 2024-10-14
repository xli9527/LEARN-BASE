import java.util.Scanner;
import java.util.Arrays;

public class t9 {

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner scan =new Scanner(System.in);
        if (scan.hasNext()){
            for (int i = 0; i < 5; i++) {
                System.out.println("请输入第"+ (i+1) + "个数字");
                int num = Integer.parseInt(scan.nextLine());
                arr[i]=num;
            }
        }
        int arr2[]=Arrays.copyOf(arr,5);
        Arrays.sort(arr2);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
//        自定义二维数组
    }
}
