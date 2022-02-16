public class Escadaria {
    /**
     * Método main onde é executado o código
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        gerarEscada(6);
    }

    /**
     * Este método é responsável por gerar uma escada através do uso do método
     * gerarDegrau, onde n é a altura da escada
     * 
     * @see gerarDegrau();
     * @param n
     */
    public static void gerarEscada(int n) {
        for (int i = 1; i <= n; i++) {
            gerarDegrau(n, i);
        }
    }

    /**
     * 
     * @param tamanhoDegrau
     * @param numeroDegrau
     */
    public static void gerarDegrau(int tamanhoDegrau, int numeroDegrau) {
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
    }
}
