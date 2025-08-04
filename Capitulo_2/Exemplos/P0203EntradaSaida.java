import java.util.Scanner;

public class P0203EntradaSaida {
    public static void main(String[] args) {
        /*try {
            // Entrada não formatada
            int c = System.in.read(); // Lê valores da tabela ASCII
            // Saída não formatada
            System.out.println(c);
        } catch (Exception e) {
        }*/
        // Entrada formatada
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma palavra: "); // mensagem para orientação do usuário
        String palavra = s.next();
        s.nextLine(); // limpeza de entrada após leituras
        System.out.println("Digite uma frase: "); // mensagem para orientação do usuário
        String frase = s.nextLine();
        // Saída formatada
        System.out.printf("Palavra: %s Frase: %s", palavra,frase);
        s.close();

        /*
         * Valores para formatar:
         * %s = Strings
         * %b = boolean
         * %h = conversão para hashcode (valor hexadecimal)
         * %c = char
         * %d = integer
         * %f = real
         * %e = notação cientifica
         * %a = numéro real para hexadecimal
         * %x = número inteiro para ASCII
         * %o = inteiro para octal
         * %t = datas e horas
         * %n = separador de linhas
         */
    }
} 
