public class TstByte {
    /**
     * i) Classe Byte: método byteValue()
     *
     * ii) O método obtemValorByte irá retornar o valor primitivo byte de
     * um objeto Byte utilizando Byte.byteValue().
     *
     * iii) Referência: Documentação oficial Oracle - Java Byte Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     */
    public void obtemValorByte(Byte bt){
        System.out.println(bt.byteValue());
    }

    /**
     * i) Classe Byte: método toUnsignedInt()
     *
     * ii) O método converteSemSinal(byte valor) irá converter um valor byte
     * para int sem sinal, no intervalo de 0 a 255, utilizando
     * Byte.toUnsignedInt(). Exemplo: o byte -1 é convertido para 255.
     *
     * iii) Referência: Documentação oficial Oracle - Java Byte Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     */

    public void converteSemSinal(Byte bt){
        System.out.println(Byte.toUnsignedInt(bt));
    }
}
