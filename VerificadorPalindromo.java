import java.util.Scanner;

public class verificadorP {
    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);
        System.out.println("Por favor, digite a palvra que devemos verificar hoje: ");
        String palavra = verificador.nextLine();
        // convertendo a palavra em minúscula e removendo os espaços
        // palvraMinuscula recebe a variável palavra em mínuscula e sem espaços
        String palavraMinuscula = palavra.toLowerCase().replaceAll("\\s+", "");
        /*invertendo a palvraMinuscula para aplicar a condição
          para ver se mesmo lendo a palavra invertida ainda é a
          mesma coisa ou não
        */
        String invertida = new StringBuilder(palavraMinuscula).reverse().toString();

        /*
         * aplicando o tipo boleano '.equals' direto na condição
         * para verifcar se a palavra lida detrás pra frente é
         * um palíndormo.
         */
        if (palavraMinuscula.equals(invertida)) {
            System.out.println("\"" + palavra + "\" é um palíndromo! true");
        } else {
            System.out.println("\"" + palavra + "\" não é um palíndromo. false");
        }
        verificador.close();
    }
}