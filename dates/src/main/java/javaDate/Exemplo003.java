package javaDate;

import javax.xml.crypto.Data;
import java.util.Date;

public class Exemplo003 {

    public static void  main(String[] args){
        //Observe que como é um "Long" o parâmetro passado precisa ter o "L" ao final do número
        Date dataNoPassado = new Date(1622467104602L);
    //Mon May 31 10:18:24 BRT 2021

        Date dataNoFuturo = new Date (1722467104602L);
    //Wed Jul 31 20:05:04 BRT 2024

        /** Comparando se a dataNoPassado é posterior a datanoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true

    }
}