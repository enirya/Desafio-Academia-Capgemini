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
     * método
     * gerarDegrau, onde n é a altura da escada
     * 
     * @see gerarDegrau();
     * @param n Representa a quantidades de "degraus" (*) que a escada irá ter
     */
    public static String gerarEscada(int n) {
        String escada = "";
        for (int i = 1; i <= n; i++) {
            escada = escada + gerarDegrau(n, i) + "\n";
        }
        return escada;
    }

    /**
     * Este método é responsável por calcular
     * 
     * @param tamanhoDegrau Representa
     * @param numeroDegrau  sdasdasdas
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
