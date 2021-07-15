**classe Date()**

vai inicialiozar no milissegundo mais próximo do período da sua execução



**Date(long date)**

espera que voce passe como base os milessegundos com base padrão de tempo(epoch) que usa como referencia 1 de janeiro de 1970 00:00:00

O epoch timestamp é um padrão largamente aceito para representar uma data como um inteiro 32 bits a partir do início do Unix Epoch(data de 1970)



**System.currentTimeMillis()**



Este método estático vai nos retornar o milissegundos mais próximo da sua execução com base no sistema operacional (isso pode ser afetado conforme o sistema usando)



**Classe Instant** 

surgiu no jdk 1.8

Imutável e Thread safe

Modela um ponto instantâneo de uma linha do tempo

indicadoi para gravar marcações temporais em eventos da sua aplicação



**Java Calendar**

Necessidade de facilitar recursos da classe Date

Métodos da Classe Date foram depreciados como o construtor (int yer, int month, int date)

Classe abstrata que provê métodos para converter data entre um instante especifico

possui campos específicos para manipulação como MONTH, YERA, HOUR, etc.



**java.text.Dateformat**

SimpleDateFormat traz uma grande facilidade que é definir um padrão de formatação para a saída de data que você deseja

**Datas no java 8**

java.time que foi herdado do projeto Joda Time

https//:joda.org/joda-time/

Haviam duas classes Date e Calendar, se mostravam confusas e trabalhasas

Além de serem mutáveis

**LocalDate**

Classe imutável que representa apenas uma data

sua formatação é yyyy-MM-dd

**LocalTime** 

é uma classe imutável que representa um padrão de hora-minuto-segundo

pode ser representado em até o nível de nanosegundos. Ex; 12:22:10:123212345

Sua utilização é similar ao LoalDate

**LocalDateTime**

funciona como uma espécie de **junção** entre o localtime e o LocalDate

Também é uma classe imutavel e você consegue trabalhar com dia e hora de uma só vez

Você pode manipular a data e hora com precisão de nanosegundos

ex: 2nd October 2007 at 13:45.30.123456789

