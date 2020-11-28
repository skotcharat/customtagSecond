package com.kotcharat;
import java.time.*;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

@SuppressWarnings("deprecation")
public class GreetingTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        // create a LocalTime object
        LocalTime time = LocalTime.parse("19:34:50.63");

        // get Hour field using getHour()
        int hour = time.getHour();

        if(hour < 12) {
            out.println("Good morning!  ");
        } else if(hour > 12 && hour < 16) {
            out.println("Good afternoon!  ");
        } else if(hour > 20) {
            out.println("Good night!  ");
        } else {
            out.println("Good evening!  ");
        }

        // create a Date object
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        int date = today.getDayOfMonth();


        if(date == 31 && month == 10) {
            out.println("Today is Halloween!");
        } else {
            out.println("Today is not Halloween!");
        }


    }

}
