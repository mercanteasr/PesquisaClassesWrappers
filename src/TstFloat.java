public class TstFloat {
    /**
     * i) Classe Float: método parseFloat()
     *
     * ii) O método converteString_Float(String valor) irá converter uma
     * String para um valor primitivo float utilizando Float.parseFloat().
     *
     * iii) Referência: Documentação oficial Oracle - Java Float Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
     */
    public void converteString_Float(String valor){
        System.out.println(Float.parseFloat(valor));
    }
    /**
     * i) Classe Float: método sum()
     *
     * ii) O método somaFloat(float a, float b) irá somar dois valores float
     * utilizando Float.sum().
     *
     * iii) Referência: Documentação oficial Oracle - Java Float Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
     */
    public void somaFloat(float a, float b){
        System.out.println(Float.sum(a, b));
    }
}
