//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

public class TstByte {

    /**
     * i) Classe Byte: método doubleValue()
     *
     * ii) O método converteByte_Double irá converter o valor de um objeto
     * Byte para o tipo primitivo double utilizando bt.doubleValue().
     *
     * iii) Referência: Documentação oficial Oracle - Java Byte Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     */
    public void converteByte_Double(Byte bt) {
        double resultado = bt.doubleValue();
        System.out.println("Byte " + bt + " convertido para double: " + resultado);
    }

    /**
     * i) Classe Byte: método toUnsignedInt()
     *
     * ii) O método converteSemSinal(Byte bt) irá converter um valor byte
     * para int sem sinal, no intervalo de 0 a 255, utilizando
     * Byte.toUnsignedInt(). Exemplo: o byte -1 é convertido para 255.
     *
     * iii) Referência: Documentação oficial Oracle - Java Byte Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     */
    public void converteSemSinal(Byte bt) {
        System.out.println("Byte " + bt + " sem sinal: " + Byte.toUnsignedInt(bt));
    }
}