import java.util.*;
import java.lang.Math;

public class rockstarGames {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int idade;
        double prezo;
        
        System.out.println("indica edad  cliente");
        idade = input.nextInt();
        if (idade < 0) {
            System.out.println("Idade non valida");
        } else {
            if (idade < 4) {
                prezo = 0;
            } else {
                if (idade < 18) {
                    prezo = 5;
                } else {
                    prezo = 10;
                }
            }
            System.out.println("El precio es: " + prezo);
        }
    }
}
