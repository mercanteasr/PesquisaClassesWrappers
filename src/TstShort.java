//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

public class TstShort {

    /**
     * i) Classe Short: método toString()
     *
     * ii) O método converteShort_String irá converter um valor short para
     * String utilizando Short.toString(), e mostra a quantidade de
     * caracteres do texto gerado para provar que agora é uma String.
     *
     * iii) Referência: Documentação oficial Oracle - Java Short Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
     */
    public void converteShort_String(short valor) {
        String texto = Short.toString(valor);
        System.out.println("String gerada: \"" + texto + "\" com " + texto.length() + " caracteres");
    }

    /**
     * i) Classe Short: método reverseBytes()
     *
     * ii) O método reverseBytes irá inverter a ordem dos bytes de um
     * valor short utilizando Short.reverseBytes().
     *
     * iii) Referência: Documentação oficial Oracle - Java Short Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
     */
    public void reverseBytes(Short st) {
        System.out.println("Valor " + st + " com os bytes invertidos: " + Short.reverseBytes(st));
    }
}