//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

public class TstLong {

    /**
     * i) Classe Long: método signum()
     *
     * ii) O método verificaSinal irá verificar o sinal de um valor long
     * utilizando Long.signum(), que retorna -1 se for negativo,
     * 0 se for zero e 1 se for positivo.
     *
     * iii) Referência: Documentação oficial Oracle - Java Long Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
     */
    public void verificaSinal(long valor) {
        int sinal = Long.signum(valor);
        switch (sinal) {
            case 1:
                System.out.println(valor + " é positivo (signum = 1)");
                break;
            case -1:
                System.out.println(valor + " é negativo (signum = -1)");
                break;
            default:
                System.out.println("O valor é zero (signum = 0)");
        }
    }

    /**
     * i) Classe Long: método highestOneBit()
     *
     * ii) O método maiorPotencia2 irá encontrar a maior potência de 2 que
     * é menor ou igual ao valor informado utilizando Long.highestOneBit().
     * Exemplo: para 100 o resultado é 64.
     *
     * iii) Referência: Documentação oficial Oracle - Java Long Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
     */
    public void maiorPotencia2(long valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor positivo para esse teste");
        } else {
            long pot = Long.highestOneBit(valor);
            System.out.println("Maior potência de 2 que cabe em " + valor + ": " + pot);
        }
    }
}