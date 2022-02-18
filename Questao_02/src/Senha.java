import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Senha
 * 
 * @author Tayrine Lopes
 * @version 1.0.0
 * @see Regex
 * @since Release 1.0.0
 */

public class Senha {

    /**
     * Método main onde é passada a senha definida através do método captarSenha() e
     * é utilizado para executar o método validarSenha()
     * 
     * @see captarSenha();
     * @see validarSenha();
     * @param args Argumentos que podem ser passados se necessário
     * @throws Exception Error
     */
    public static void main(String[] args) throws Exception {
        String senha = captarSenha();
        validarSenha(senha);
    }

    /**
     * Este método é responsável por captar o input do usuário (senha)
     * 
     * @return String - senha
     */

    public static String captarSenha() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        return senha;
    }

    /**
     * Este método é responsável por verificar se a senha possui ao menos seis
     * caracteres
     * 
     * @param senha String
     * @return boolean Boolean
     */

    public static boolean verificarTamanhoSenha(String senha) {
        if (senha.length() < 6) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Este método utiliza de uma expressão regular para verificar se a senha possui
     * ao menos um caractere numérico
     * 
     * @param senha String
     * @return Boolean
     */

    public static boolean verificarSeTemNumero(String senha) {
        String regex = "[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);

        return m.find();
    }

    /**
     * Este método utiliza de uma expressão regular para verificar se a senha possui
     * ao menos uma letra minúscula
     * 
     * @param senha String
     * @return boolean Boolean
     */
    public static boolean verificarSeTemMinusculo(String senha) {
        String regex = "[a-z]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);

        return m.find();
    }

    /**
     * Este método utiliza de uma expressão regular para verificar se a senha possui
     * ao menos uma letra maiúscula
     * 
     * @param senha String
     * @return boolean Boolean
     */
    public static boolean verificarSeTemMaiusculo(String senha) {
        String regex = "[A-Z]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);

        return m.find();
    }

    /**
     * Este método utiliza de uma expressão regular para verificar se a senha possui
     * ao menos um caractere especial
     * 
     * @param senha String
     * @return boolean Boolean
     */
    public static boolean verificarSeTemCaractereEspecial(String senha) {
        String regex = "[!@#$%^&*()-+]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);

        return m.find();
    }

    /**
     * Este método utiliza o resultado dos métodos anteriores para validar a senha.
     * A cada verificação é feita uma contagem para saber quantos caracteres
     * faltantes a senha possui.
     * É feita uma verificação para saber também quantos caracteres restam para a
     * quantidade mínima de caracteres
     * É comparado o valor do contador dos caracteres faltantes com a quantidade
     * mínima de caracteres
     * É exibido para o usuário o número que for maior (caracteres especiais ou
     * caracteres faltantes).
     * 
     * @param senha String
     */
    public static void validarSenha(String senha) {
        Boolean temSeisOuMaisCaracteres = verificarTamanhoSenha(senha);
        Boolean temAoMenosUmNumero = verificarSeTemNumero(senha);
        Boolean temAoMenosUmMinusculo = verificarSeTemMinusculo(senha);
        Boolean temAoMenosUmMaiusculo = verificarSeTemMaiusculo(senha);
        Boolean temAoMenosUmCaractereEspecial = verificarSeTemCaractereEspecial(senha);

        int caracteresFaltantes = 0;
        int minimoSenha = 0;

        if (!temAoMenosUmCaractereEspecial) {
            caracteresFaltantes++;
        }
        if (!temAoMenosUmMaiusculo) {
            caracteresFaltantes++;
        }
        if (!temAoMenosUmMinusculo) {
            caracteresFaltantes++;
        }
        if (!temAoMenosUmNumero) {
            caracteresFaltantes++;
        }
        if (!temSeisOuMaisCaracteres) {
            minimoSenha = 6 - senha.length();
        }

        if (minimoSenha > caracteresFaltantes) {
            System.out.println(minimoSenha);
        } else {
            System.out.println(caracteresFaltantes);
        }
    }
}