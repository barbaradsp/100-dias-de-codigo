import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Dia001 {

    public static void main(String[] args) {
        int min, max;
        boolean test = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o menor número do intervalo desejado: ");
        min = scan.nextInt();

        System.out.println("Informe o maior número do intervalo desejado: ");
        max = scan.nextInt();

        while(test) {
            if (max > min) {
                test = false;
            } else {
                System.out.println("Número inválido. Informe um número maior que o mínimo.");
                max = scan.nextInt();
            }
        }
        // Geração de número pseudoaleatório - classe Random
        Random random = new Random();
        int randomNum = random.nextInt(max - min) + min;
        System.out.println("Número aleatório (Random): " + randomNum);

        // Geração de número aleatório - classe SecureRandom
        SecureRandom sRandom = new SecureRandom();
        randomNum = sRandom.nextInt(max - min) + min;
        System.out.println("Número aleatório (SecureRandom): " + randomNum);

        scan.close();

    }
}