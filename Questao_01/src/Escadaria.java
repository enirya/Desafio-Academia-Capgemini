/**
 * Escadaria
 * 
 * @author Tayrine Lopes
 * @version 1.0.0
 * @since Release 1.0.0
 */
public class Escadaria {
    /**
     * Método main onde é definido qual é a entrada do método gerarEscada(); e onde
     * se executa o mesmo.
     * 
     * @see gerarEscada();
     * @param Argumentos que podem ser passados se necessário
     */
    public static void main(String[] args) throws Exception {
        gerarEscada(6);
    }

    /**
     * Este método é responsável por gerar uma escada através do uso iterativo do
     * método gerarDegrau, onde n é a altura da escada. A iteração é responsável por
     * adicionar o resultado do método gerarDegrau() em uma String chamada escada
     * que é retornada pelo método.
     * 
     * @see gerarDegrau();
     * @param n Representa a quantidades de "degraus" (*) que a escada irá ter
     * @return escada String - representa a escada
     */
    public static String gerarEscada(int n) {
        String escada = "";
        for (int i = 1; i <= n; i++) {
            escada = escada + gerarDegrau(n, i) + "\n";
        }
        return escada;
    }

    /**
     * Este método define os elementos que utilizaremos para criar a 'escada',
     * recebendo dois parâmetros que irão definir sua dimensão. A iteração é
     * responsável por verificar em qual degrau da escada estamos e adicionar
     * espaços ou asteriscos compondo uma string (degrau) que será retornada.
     * 
     * @param tamanhoDegrau Representa quantos andares a escada irá possuir no total
     * @param numeroDegrau  Número do degrau representa o andar do degrau (é iterado
     *                      em gerarEscada())
     * @return degrau String - Representa um degrau da escada
     */
    public static String gerarDegrau(int tamanhoDegrau, int numeroDegrau) {
        String espaco = " ";
        String asterisco = "*";
        String degrau = "";
        int asteriscoAPartirDe = tamanhoDegrau - numeroDegrau;

        for (int i = 1; i <= tamanhoDegrau; i++) {
            if (i <= asteriscoAPartirDe) {
                degrau = degrau + espaco;
            } else {
                degrau = degrau + asterisco;
            }
        }
        System.out.println(degrau);
        return degrau;
    }
}
