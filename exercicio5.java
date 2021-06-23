import java.util.Scanner;

public class exercicio5 {
    //Nome na vertical em escada invertida. Altere o programa anterior de modo que a escada seja invertida.
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Digite algo:");
            String inputScanner = myScanner.nextLine();

            String[] sttringPalavras = inputScanner.toUpperCase().split("");

            for (int i= sttringPalavras.length; i>0;i--){
                for (int j=0; j<i;j++){
                    System.out.print(sttringPalavras[j]);
                }
                System.out.println();
            }
        }
    }


