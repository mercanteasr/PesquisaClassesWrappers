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
        byte resultado = bt.byteValue();
        System.out.println(resultado);
    }
    /**
     * i) Classe Byte: método hashCode()
     *
     * ii) O método calculaHash irá retornar o hash code de um valor Byte
     * utilizando hashCode().
     *
     * iii) Referência: Documentação oficial Oracle - Java Byte Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
     */
    public void calculaHash(Byte bt){
       int resultado =  bt.hashCode();
        System.out.println(resultado);
    }
}
