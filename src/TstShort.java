import java.lang.Short;

public class TstShort {
    /**
     * i) Classe Short: método compareTo()
     *
     * ii) O método comparaShort(Short a, Short b) irá comparar dois valores
     * Short utilizando a.compareTo(b), retornando um valor negativo se a for
     * menor, zero se forem iguais e positivo se a for maior.
     *
     * iii) Referência: Documentação oficial Oracle - Java Short Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
     */
    public void comparaShort(Short a, Short b){
        int res = a.compareTo(b);
        if(res < 0){
            System.out.println(a + " é menor que " + b);
        } else if(res > 0){
            System.out.println(a + " é maior que " + b);
        } else {
            System.out.println(a + " é igual a " + b);
        }
    }

    /**
     * i) Classe Short: método reverseBytes()
     *
     * ii) O método inverteBytes irá inverter a ordem dos bytes de um
     * valor short utilizando Short.reverseBytes().
     *
     * iii) Referência: Documentação oficial Oracle - Java Short Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
     */
    public void reverseBytes(Short st){
        System.out.println(Short.reverseBytes(st));
    }

}
