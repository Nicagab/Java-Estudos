public class P0206EstruturasDeDesvio {
    public static void main(String[] args) {
        int a = 25;
        int b = 20;

        // Diretiva If else
        if (a>b) {
            System.out.println("Verdadeiro");
        } else if (a<b){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

         // Diretiva Switch

        switch (a) {
            case 1:
                System.out.println("Caso 1");
                break;
            default:
                System.out.println("Caso default");
                break;
            }

        // Cases Amontoados
        switch (a) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Caso 1,2,3,4 e 5");
                break;
            default:
                System.out.println("Caso default");
                break;
            }
        // Cases mais organizados
        switch (a) {
            case 1,2,3,4,5:
                System.out.println("Caso 1,2,3,4 e 5");
                break;
            default:
                System.out.println("Caso default");
                break;
            }
        // Rule Switch
        switch (a) {
            case 1 -> System.out.println("Caso 1");
            default -> System.out.println("Caso default");
            }
        // Switch como expressão
        String frase = switch(a){
            case 1 -> "Caso 1";
            default -> "Caso default";
        };
        System.out.println(frase);
    }
}
