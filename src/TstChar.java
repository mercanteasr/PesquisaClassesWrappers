public class TstChar {
    /**
     * i) Classe Character: método toUpperCase()
     *
     * ii) O método transformaMaiusculo irá transformar um caractere
     * para maiúsculo utilizando Character.toUpperCase().
     *
     * iii) Referência: Documentação oficial Oracle - Java Character Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
     */
    public void transformaMaiusculo(char caracter){
        char resultado = Character.toUpperCase(caracter);
        System.out.println(resultado);
    }
    /**
     * i) Classe Character: método toLowerCase()
     *
     * ii) O método transformaMinusculo irá transformar um caractere
     * para minúsculo utilizando Character.toLowerCase().
     *
     * iii) Referência: Documentação oficial Oracle - Java Character Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
     */
    public void transformaMinusculo(char caracter){
        char resultado = Character.toLowerCase(caracter);
        System.out.println(resultado);
    }
}
