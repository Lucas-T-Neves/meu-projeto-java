package school.sptech;

public class Exemplo02 {
    static void main(String[] args) {
        // Condicionais: if, else, else if, ternário/*
        // >, <, <=, ==, ===
        Boolean temCarro = false;
        if(temCarro){
            System.out.println("vilão");
        }
        // || e && mantem/*
        Integer idade = 19;
        if (idade < 16){
            System.out.println("não pode votar");} else if (idade < 18) {
            System.out.println("não pode dirigir mas pode votar");}else {
                System.out.println("pode votar e dirigir!!!!!!!!!!!!!!!");

        }
    }
}
