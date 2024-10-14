import java.util.Date;

public class t7 {
    public static void main(String[] args) {
        Date date = new Date();
        String day = String.format("%tF",date);
        System.out.println(day);
//      格式化字符串
    }
}
