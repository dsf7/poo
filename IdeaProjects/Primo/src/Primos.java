import java.util.Scanner;

public class Primos {
    public static void main(String[] {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informe o número final:");
            int input = scan.nextInt();
            Primo primo = new Primo();
            int contador = 0;
            String string = "";
            while (contador < input) {
                if(primo.primo(contador)) {
                    string = string.concat(String.valueOf(contador));
                }
                contador++


            }
            System.out.println(string);

    }
}
