import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
    /*Tamanho de strings. Faça um programa que leia 2 strings e informe o conteúdo delas seguido
    do seu comprimento. Informe também se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite duas strings para comparação.:");
        String comparacao1 = scanner.nextLine();
        String comparacao2 = scanner.nextLine();
    }
    public static void ifElse (String stringComparador1,String stringComparador2) {
        if (stringComparador1.equals(stringComparador2)) {
            System.out.println("As strings tem o mesmo conteúdo.");
    }
        else{
            System.out.println(" As strings NÃO tem o mesmo conteúdo. ");
        }
        if (stringComparador1.length() == stringComparador2.length()){
            System.out.println(" As strings tem o mesmo tamanho.");
        }
        else {
            System.out.println(" As strings possuem tamanhos diferentes.");
        }
    }
    public static void Tela (String stringTela1, String stringTela2){
        System.out.println("Primeira String: " + stringTela1);
        System.out.println("Segunda String: " + stringTela2);

        System.out.printf("Tamanho de '%s': %d caracteres.\n", stringTela1, stringTela1.length());
        System.out.printf("Tamanho de '%s': %d caracteres.\n", stringTela1, stringTela2.length());
    }
    //'%s' = String || '%d' = decimal. (serve para double / int) , se for FLOAT é '%f'.
}


