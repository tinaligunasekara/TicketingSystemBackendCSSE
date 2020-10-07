package csse.entity;

import javax.persistence.MappedSuperclass;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@MappedSuperclass
public class DateTime {

    private String curDate;
    private String curTime;

    public DateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate;
    }

    public String getCurTime() {
        return curTime;
    }

    public void setCurTime(String curTime) {
        this.curTime = curTime;
    }
}
