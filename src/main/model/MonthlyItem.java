package model;

import model.exception.TimeFormException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthlyItem extends Item {

    public MonthlyItem() {
        super();
        state = 1;
    }

    @Override
    public void setItemName(String name) {
        this.itemName = name + "_Paid_Monthly.";
    }

    @Override
    public String nextMonthPay() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(date);
        Calendar tempo = Calendar.getInstance();
        tempo.setTime(d);
        tempo.add(Calendar.MONTH, 1);
        d = tempo.getTime();
        return sdf.format(d);
    }
}
