package javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo005 {
    public static void main(String[] args) {
        Date dataInicio = new Date(1622467104602L);
        System.out.println(dataInicio);
        //Mon May 31 10:18:24 BRT 2021

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        //2021-05-31T13:18:24.602Z
    }

}
