package school.sptech;

public class Exemplo04 {
    static void main() {
        //laços de repeticao : while, for, [do-while]
        // pode usar primitivos em loopings
        for (Integer i = 0; i < 10 ; i++) {
            System.out.println(i);
            int timmer = 0;
            while(timmer < 10){
                timmer++ ;
                System.out.println(timmer);
            }


        }
        int contador = 0;
        do{
            System.out.println("o que é " + contador + " vida?");
            contador++; }
        while(contador < 11);

    }
}
