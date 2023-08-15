import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Dia001 {

    public static void main(String[] args) {
        int[] intervalo = defineIntervalo();
        int min = intervalo[0];
        int max = intervalo[1];

        // Geração de número pseudoaleatório - classe Random
        System.out.println("Número aleatório (Random): " + random(min, max));

        // Geração de número aleatório - classe SecureRandom
        System.out.println("Número aleatório (SecureRandom): " + sRandom(min, max));
    }

    public static int[] defineIntervalo() {
        int[] intervalo = new int[2];

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o menor número do intervalo desejado: ");
        intervalo[0] = scan.nextInt();

        System.out.println("Informe o maior número do intervalo desejado: ");
        intervalo[1] = scan.nextInt();

        while(intervalo[1] <= intervalo[0]) {
                System.out.println("Número inválido. Informe um número maior que o mínimo.");
                intervalo[1] = scan.nextInt();
            }

        scan.close();

        return intervalo;
    }

    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int sRandom(int min, int max) {
        SecureRandom sRandom = new SecureRandom();
        return sRandom.nextInt(max - min) + min;
    }
}