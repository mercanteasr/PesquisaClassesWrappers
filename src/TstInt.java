// Ricardo Mercante

public class TstInt {

    /**
     * i) Classe Integer: método compare()
     *
     * ii) O método comparaInteiros irá comparar dois valores inteiros
     * utilizando Integer.compare() e retornará o resultado da comparação.
     *
     * iii) Referência: Documentação oficial Oracle - Java Integer Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
     */
    public void comparaInteiros(int inteiro1, int inteiro2) {
        int resultado = Integer.compare(inteiro1, inteiro2);
        if (resultado == 0) {
            System.out.println(inteiro1 + " e " + inteiro2 + " são iguais");
        } else if (resultado < 0) {
            System.out.println(inteiro1 + " é menor que " + inteiro2);
        } else {
            System.out.println(inteiro1 + " é maior que " + inteiro2);
        }
    }

    /**
     * i) Classe Integer: método toBinaryString()
     *
     * ii) O método converteInt_Binario(int valor) irá converter um valor int
     * para sua representação em binário, no formato String, utilizando
     * Integer.toBinaryString().
     *
     * iii) Referência: Documentação oficial Oracle - Java Integer Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
     */

    public void converteInt_Binario(int valorInt) {
        String resultado = Integer.toBinaryString(valorInt);
        System.out.println("Resultado: "+resultado);
    }
}