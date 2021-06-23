import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //Nome ao contrário em maiúsculas. Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário
        // de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas.

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nomeUsuario = myScanner.nextLine().toUpperCase(Locale.ROOT);
        StringBuilder nome = new StringBuilder();
        nome.append(nomeUsuario).reverse();
        String nomeReverso = String.valueOf(nome);

        System.out.println(nomeReverso);
    }
}
