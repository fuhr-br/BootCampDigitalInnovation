package dateFormat;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Date;

public class Exemplo008 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dataToStr = DateFormat.getInstance().format(agora);

        System.out.println(dataToStr);

        dataToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dataToStr);

    }



}
