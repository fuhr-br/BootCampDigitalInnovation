package javaLocalDate;

import java.time.LocalDate;

public class exemplo011 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println("Hoje é: "+ hoje);
        System.out.println("Ontem era: "+ ontem);
    }
}
