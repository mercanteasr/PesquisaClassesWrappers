import java.lang.Short;

public class TstShort {
    /**
     * i) Classe Short: método decode()
     *
     * ii) O método converteString_Short irá converter uma String para
     * um valor Short utilizando Short.decode().
     *
     * iii) Referência: Documentação oficial Oracle - Java Short Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
     */
    public void converteString_Short(String str_st){
        System.out.println(Short.decode(str_st));
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
