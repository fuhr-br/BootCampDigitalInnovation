package javaCalendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance(); //data atual do sistema

        System.out.printf("%tc\n", agora);
        //seg mai 31 11:25:39 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-05-31
        System.out.printf("%tD\n", agora);
        //05/31/21
        System.out.printf("%tr\n", agora);
        //11:25:39 AM
        System.out.printf("%tT\n", agora);
        //11:25:39


    }
}
