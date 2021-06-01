package dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();

        /** CUIDADO, AS LETRAS MINÚSCULAS E MAIÚSCULAS DO PARÂMETRO TEM DIFERENÇA NO RETORNO DA DATA */
        //EXEMPLO 1
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

        //EXEMPLO2
        SimpleDateFormat formatter2 = new SimpleDateFormat("DD/mm/YYYY");
        String dataFormatada2 = formatter2.format(agora);

        System.out.println(dataFormatada2);



    }
}
