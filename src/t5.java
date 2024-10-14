public class t5 {
    public static void main(String[] args) {
        int n = 20;
        int count = 1;
        float sum = 0;
        while (count<=n){
            int temp=0;
            float suml = 0;
            while (temp<count){
                temp++;
                suml+=temp;
            }
            sum+=1/suml;
            count++;
        }
        System.out.println(sum);
//      阶乘相加取平均数
    }
}
