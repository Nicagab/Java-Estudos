
import java.awt.desktop.SystemEventListener;
import java.io.StringReader;

public class P0207EstruturasDeControleDeErros {
    public static void main(String[] args) {
        // Diretiva try, catch, finally
        try {
            System.out.println("Diretiva normal");
        } catch (Exception e) {
            System.out.println("Diretiva de tratamento de erro");
        } finally {
            System.out.println("Diretiva com execução garantida");
        }
        // 2 ou mais diretivas catch 
        try {
            System.out.println("Diretiva normal");
        } catch (ArrayIndexOutOfBoundsException e1) {
            // Falta de argumentos
            System.out.println("Diretiva de tratamento de erro");
        } catch (NumberFormatException e2) {
            // Argumento inadequado
            System.out.println("Diretiva de tratamento de erro");
        } finally {
            System.out.println("Diretiva com execução garantida");
        }
        // Multi-catch
        try {
            System.out.println("Diretiva normal");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // Uso de Exception é genérico e pode mascarar o real problema
            System.out.println("Diretiva de tratamento de erro");
        } finally {
            System.out.println("Diretiva com execução garantida");
        }
        // Try com recursos
        StringReader recurso = new StringReader("Recurso");

        try (recurso) {
            System.out.println(recurso);
        } catch (Exception e) {
            System.out.println("Erro");
        }
        // Asserções (estão normalmente desabilitadas)
        int valor = 10;
        assert valor>10;
    }
}
