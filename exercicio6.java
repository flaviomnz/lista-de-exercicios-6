import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //Data por extenso. Faça um programa que solicite a data de nascimento (dd/mm/aaaa) do usuário e imprima a data com o nome do mês por extenso.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento: EX: (dd/mm/aaaa)");
        String[] dataMesAno = scanner.nextLine().split("/");
        System.out.println(dataMesAno);


    }
}
