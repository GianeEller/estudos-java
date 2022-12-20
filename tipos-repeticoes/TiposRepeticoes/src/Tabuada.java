import java.util.Scanner;

/*
 * desenvolva um gerador de tabuada, capaz de gerar a tabuada
 * de qualquer numero inteiro entre 1 e 10.
 * o usuario deve informar de numero ele deseja ver a tabuada
 * a saida dever ser:
 * Tabuada de 5:
 * 5 X 1 = 5
 * ...
 * 5 x 10 = 50
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

        }

    }
}
