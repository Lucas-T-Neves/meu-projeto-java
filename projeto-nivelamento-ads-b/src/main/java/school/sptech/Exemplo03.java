package school.sptech;

public class Exemplo03 {

    static void main() {
        String numero01 = new String("martelo");
        String numero02 = new String("Lucas");
//nao utilizamos == para tipos Wrapper
        if (!numero01.equals(numero02)) {
            System.out.println("numeros diferentes ");
        } else {
            System.out.println("numeros iguais");
        }

        String nomeBan = "Bob";
        String nomeDig = "Bob";

        if (nomeBan.equals(nomeDig)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }
    }

    ;


}
