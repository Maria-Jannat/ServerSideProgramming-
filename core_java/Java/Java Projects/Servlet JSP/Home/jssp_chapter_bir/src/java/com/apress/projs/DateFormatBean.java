package com.apress.projs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatBean {

    private DateFormat dateFormat;
    private Date date;

    public DateFormatBean() {
        dateFormat = DateFormat.getDateInstance();
        date = new Date();
    }

    public String getDate() {
        return dateFormat.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFormat(String format) {
        this.dateFormat = new SimpleDateFormat(format);
    }

}
