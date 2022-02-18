import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Anagrama
 * 
 * @author Tayrine Lopes
 * @version 1.0.0
 * @since Release 1.0.0
 */
public class Anagrama {

    /**
     * Método Main, utilizado
     * 
     * @param args Argumentos que podem ser passados se necessário
     */
    public static void main(String[] args) {
        String input = getUserInput();

        ArrayList<String> substringArray = createSubstringArray(input);

        substringArray = sortSubstringArray(substringArray);

        int numberOfAnagrams = getNumberOfAnagrams(substringArray);

        System.out.println(numberOfAnagrams);
    }

    /**
     * Método
     * 
     * @return String
     */
    public static String getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.nextLine();
            return string;
        }
    }

    /**
     * Ass
     * 
     * @param input
     * @return ArrayList<String>
     */
    public static ArrayList<String> createSubstringArray(String input) {
        ArrayList<String> substringArray = new ArrayList<String>();
        for (int substringSize = 1; substringSize < input.length(); substringSize++) {
            for (int startIndex = 0; startIndex <= input.length() - 1; startIndex++) {
                int endIndex = startIndex + substringSize;
                if (endIndex > input.length()) {
                    return substringArray;
                }
                String substring = input.substring(startIndex, endIndex);
                substringArray.add(substring);
            }
        }
        return substringArray;
    }

    /**
     * 
     * 
     * @param substringArray
     * @return ArrayList<String>
     */
    public static ArrayList<String> sortSubstringArray(ArrayList<String> substringArray) {
        for (int i = 0; i < substringArray.size(); i++) {
            char charArray[] = substringArray.get(i).toCharArray();
            Arrays.sort(charArray);
            substringArray.set(i, new String(charArray));
        }
        return substringArray;
    }

    /**
     * O método recebe como parâmetro um array de substrings ordenadas a partir do
     * input do usuário.
     * O array de substrings então é percorrido dentro de dois laços de repetição
     * com uma estrutura condicional.
     * O primeiro laço de repetição é responsável por definir o índice do elemento
     * que será comparado com os outros elementos do array.
     * No segundo laço, o índice j sempre será maior que o índice i, comparando o
     * elemento na posição i com o elemento na posição j. Caso sejam iguais,
     * adiciona mais um ao contador de anagramas.
     * 
     * @param substringArray Array de Substrings ordenadas do Input.
     * @return numberOfAnagramas Número de anagramas contidos no array de substrings
     *         ordenadas.
     */
    public static int getNumberOfAnagrams(ArrayList<String> substringArray) {
        int numberOfAnagrams = 0;
        for (int i = 0; i < substringArray.size(); i++) {
            for (int j = i + 1; j < substringArray.size(); j++) {
                if (substringArray.get(i).equals(substringArray.get(j))) {
                    numberOfAnagrams++;
                }
            }
        }
        return numberOfAnagrams;
    }
}
