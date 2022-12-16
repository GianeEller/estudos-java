
public class OperadorRelacional {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String nomeUm = "Giane";
        String nomeDois = new String("Giane");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente a
        // numeroDois? " + simNao);

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }
    }
}