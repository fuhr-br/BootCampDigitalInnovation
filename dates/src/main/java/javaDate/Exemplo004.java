package javaDate;

import java.util.Date;

public class Exemplo004 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1622467104602L);  //Mon May 31 10:18:24 BRT 2021
        Date dataNoFuturo = new Date (1722467104602L); //Wed Jul 31 20:05:04 BRT 2024
        Date mesmaDataDoFuturo = new Date (1722467104602L); //Wed Jul 31 20:05:04 BRT 2024

        /** comparando se as datas são iguals*/
        boolean isEquals = dataNoFuturo.equals(mesmaDataDoFuturo);

        System.out.println(isEquals); //true

        /**Comparando uma data com a outra*/
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataDoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1 significa que a dataNoPassado é anterior a data de referencia/parametro passado
        System.out.println(compareCase2); // 1   data está a frente a data de referencia
        System.out.println(compareCase3); // 0   datas iguais
    }
}
