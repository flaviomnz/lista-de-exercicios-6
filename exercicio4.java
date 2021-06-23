import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    //Nome na vertical em escada. Modifique o programa anterior de forma a mostrar o nome em formato de escada.
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite algo:");
        String inputScanner = myScanner.nextLine();

        String[] sttringPalavras = inputScanner.toUpperCase().split("");

        for (int i=0; i<sttringPalavras.length; i++){
            for (int j=0; j<(i+1); j++){
                System.out.print(sttringPalavras[j]);
            }
            System.out.println();
            }
        }
    }


