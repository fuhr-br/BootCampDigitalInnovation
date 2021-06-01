package one.digitalinnovation.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new SuperUsuario( "root", "1234");

        System.out.println( superUsuario.getLogin());
        System.out.println( superUsuario.getSenha());
        System.out.println( "aniversário");
    }


}
