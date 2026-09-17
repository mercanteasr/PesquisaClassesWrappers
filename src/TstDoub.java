public class TstDoub {
    /**
     * i) Classe Double: método min()
     *
     * ii) O método menorValor irá comparar dois valores double e retornar
     * o menor utilizando Double.min().
     *
     * iii) Referência: Documentação oficial Oracle - Java Double Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
     */
    public void menorValor(Double valor1, Double valor2){
        Double resultado = Double.min(valor1, valor2);
        System.out.println("Menor valor entre "+valor1+" e "+valor2+" é "+resultado);
    }

    /**
     * i) Classe Double: método max()
     *
     * ii) O método maiorValor irá comparar dois valores double e retornar
     * o maior utilizando Double.max().
     *
     * iii) Referência: Documentação oficial Oracle - Java Double Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
     */

    public void maiorValor(Double valor1, Double valor2){
        Double resultado = Double.max(valor1, valor2);
        System.out.println("Maior valor entre "+valor1+" e "+valor2+" é "+resultado);
    }
}
