import java.util.Locale;
import java.util.Scanner;

public class exercicioo3 {
    public static void main(String[] args) {
        //Nome na vertical. Faça um programa que solicite o nome do usuário e imprima-o na vertical.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo:");
        String inputScanner = scanner.nextLine();

        for (int i=0; i < inputScanner.length(); i++){
            System.out.println(inputScanner.toUpperCase(Locale.ROOT).charAt(i));
        }

    }
}
