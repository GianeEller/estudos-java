import java.util.Random;

public class NumerosAleatorios {
    /*
     * faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100)
     * armazene em um vetor
     * mostre os numeros e seus sucessores
     */

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++)
            ;
        {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

    }

}