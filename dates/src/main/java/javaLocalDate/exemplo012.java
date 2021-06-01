package javaLocalDate;

import java.time.LocalDate;
import java.time.LocalTime;

public class exemplo012 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
    }

}
