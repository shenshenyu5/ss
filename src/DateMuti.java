import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMuti {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = sdf.parse("20190101");
            date2 = sdf.parse("20200101");
            calendar1.setTime(date1);
            calendar2.setTime(date2);
            int days = (int)((date2.getTime() - date1.getTime()) / (1000*3600*24));
            System.out.println(days);
            }catch (Exception e){
           e.printStackTrace();
        }
    }
}
