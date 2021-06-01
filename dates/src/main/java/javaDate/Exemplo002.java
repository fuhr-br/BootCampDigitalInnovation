package javaDate;

import java.util.Date;

public class Exemplo002 {

    public static void  main(String[] args){
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        //saida 1622466186752
        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        //Saida Mon May 31 10:03:06 BRT 2021
    }
}
