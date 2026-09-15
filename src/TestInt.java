import org.w3c.dom.ls.LSOutput;

public class TestInt {

    /**
     * i) Classe Integer: métodos compare() e toString()
     *
     * ii) O método comparaInteiros irá comparar dois valores inteiros
     * utilizando Integer.compare() e retornará o resultado da comparação.
     *
     * O método converteInt_String irá converter um valor int para uma
     * String utilizando Integer.toString().
     *
     * iii) Referência: Documentação oficial Oracle - Java Integer Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
     */

    public void comparaInteiros(int valor1, int valor2) {

        int resultado = Integer.compare(valor1, valor2);
        if(resultado == 0){
            System.out.println(valor1+" e "+valor2+" são iguais");
        } else if(resultado == -1){
            System.out.println(valor1+ " é menor que "+valor2);
        } else if(resultado == 1){
            System.out.println(valor1+" é maior que "+valor2);
        }
    }
    public void converteInt_String(int valor) {

       String resultado = Integer.toString(valor);
        System.out.println(resultado);
    }
}
