package sk.akademiasovy.myDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public void today()
    {
        Date date = new Date();
        System.out.println(date);
    }

    public void formatedDate()
    {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yy HH:mm.ss");
        System.out.println(formatDate.format(date));

    }
}
