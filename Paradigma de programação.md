**Paradigma funcional**

Damos uma regra, uma declaração de como quweremos que nosso programa se comporte.

Damos uma regra, uma declaração de como queremos que o programa se comporte

Defiição de Erich elliot

Programação funcional é o processo de construir software através de composição de funções puras, evitando compartilhamento de estados, dados mutaveis e efeitos colaterais. È declarativa ao invés de imperativa. 

respeita ordens, instrução a ser executada

Vem das funções matematicas, como claculo lambda

Alan turing desenvolveu

lisp primeirra linguagem funcional

variaveis imutáveis

recursividade intensamente

**Composição de funçoes**

criar uma função através de outras

**Funções Puras**

Invocada mais de uma vez produz exatamento o mesmo resultado quando passamos o mesmo valor como parametro

**imutabilidade**

Objeto ou valor, não mudam de valor, não pode ser alterado.

**Paradigma imperativo**

É aquele que expressa o código atyravés de comandos ao computador, nele é possivel ter controle de estado dos objetos

C, dotnet, eram paradigmas imperativos

Roda cada linha instantãneamente , script de ordens

Expressa o código atraves de comandos ao comutador, nele é possivel ter controle de estados dos objetos



**lambdas**

Antes do java 8 precisavamos implementar uma classe anonima para implementar um comportamento

melhoria do java 8 foi tirar verbosidade do código

Obedecem o conceito funcional

facilitam legibilidade do código

alta produtividade para lidar com objetos

**interface funcional** que possui apoenas um método abastrato

**@FunctionalInterface**  está anotação implementa um controle, para para que ninguém altere uma interface funcional.

força o complidador a apontar erro se uma interface não estiver de acordo com as regras de uma interface funcional. Não é obrigatória pois o compilador reconhece em tempo de compilação



**Recursividade**

função chama ela mesma até uma condição de parada

tail call(Recursividade em cauda) : não há nenhuma linha de codigo apos a chamada do próprio método..Java não suporta...não há nenhum processamento feito após a chamada recursiva

JVM lança um estouro de pilha(stackOverFlow)

**memoriztion**

é uma tecnica consite no cache do resultado de uma função, baseado nos parametros de entrada. Com isso, nas seguintes execuções conseguimos ter uma resposta rápida.



