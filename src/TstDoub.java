//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

public class TstDoub {

    /**
     * i) Classe Double: método max()
     *
     * ii) O método maiorValor irá comparar dois valores double e retornar
     * o maior utilizando Double.max().
     *
     * iii) Referência: Documentação oficial Oracle - Java Double Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
     */
    public void maiorValor(Double valor1, Double valor2) {
        Double resultado = Double.max(valor1, valor2);
        System.out.println("Maior valor entre " + valor1 + " e " + valor2 + " é " + resultado);
    }

    /**
     * i) Classe Double: método isNaN()
     *
     * ii) O método verificaNaN irá dividir os dois valores e verificar,
     * utilizando Double.isNaN(), se o resultado é NaN (Not a Number),
     * que acontece em operações indefinidas como 0.0 / 0.0.
     *
     * iii) Referência: Documentação oficial Oracle - Java Double Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
     */
    public void verificaNaN(Double valor1, Double valor2) {
        Double divisao = valor1 / valor2;
        if (Double.isNaN(divisao)) {
            System.out.println(valor1 + " / " + valor2 + " = NaN, resultado indefinido");
        } else {
            System.out.println(valor1 + " / " + valor2 + " = " + divisao + ", não é NaN");
        }
    }
}