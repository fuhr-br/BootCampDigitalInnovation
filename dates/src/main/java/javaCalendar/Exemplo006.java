package javaCalendar;

import java.util.Calendar;

public class Exemplo006 {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora.getTimeInMillis());
        //1622470671881
        long timpoAgora = agora.getTimeInMillis();

        System.out.println("A data corrente é: "+agora.getTime());
        //A data corrente é: Mon May 31 11:09:40 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        //5 dias atrás: Sun May 16 11:11:09 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: "+ agora.getTime());
        //4 meses depois: Thu Sep 16 11:13:12 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos após: "+ agora.getTime());
        //2 anos após: Sat Sep 16 11:13:12 BRT 2023

        agora = Calendar.getInstance();
        System.out.println("A data corrente é: "+agora.getTime());
        //Volta a hora ao estado original
        System.out.println(agora.getTimeInMillis());
        /** 1622470671923 repare que o long foi alterado,
        // pois se passou alguns milessegundos apenas na execução do programa*/
        //para evitar isso, salve o timeInmilli original no inicio e sete novamente

        agora.setTimeInMillis(timpoAgora);
        System.out.println(agora.getTimeInMillis());
    }

}
