//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

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
    public void transformaMaiusculo(char caracter) {
        char resultado = Character.toUpperCase(caracter);
        System.out.println(resultado);
    }

    /**
     * i) Classe Character: método isDigit()
     *
     * ii) O método verificaDigito irá verificar se o caractere informado
     * é um dígito numérico (0 a 9) utilizando Character.isDigit(),
     * que retorna true se for dígito e false caso contrário.
     *
     * iii) Referência: Documentação oficial Oracle - Java Character Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
     */
    public void verificaDigito(char caracter) {
        if (Character.isDigit(caracter)) {
            System.out.println("'" + caracter + "' é um dígito numérico");
        } else {
            System.out.println("'" + caracter + "' não é um dígito numérico");
        }
    }
}