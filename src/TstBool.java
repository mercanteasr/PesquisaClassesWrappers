public class TstBool {
    /**
     * i) Classe Boolean: método equals()
     *
     * ii) O método comparaBooleanos irá verificar se dois valores Boolean
     * são iguais utilizando o método equals().
     *
     * iii) Referência: Documentação oficial Oracle - Java Boolean Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
     */

    public void comparaBooleanos(Boolean bool1, Boolean bool2){
        boolean resultado = bool1.equals(bool2);
        if(resultado == false) {
            System.out.println("Resultado..." + resultado + " = Os dois são diferentes!");
        }else{
            System.out.println("Resultado..." + resultado+" = Os dois são iguais!");
        }
    }

    /**
     * i) Classe Boolean: método logicalOr()
     *
     * ii) O método aplicaOr irá aplicar o operador lógico OU entre dois
     * valores boolean utilizando Boolean.logicalOr().
     *
     * iii) Referência: Documentação oficial Oracle - Java Boolean Class
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
     */

    public void logicaOr(Boolean valor1, Boolean valor2){
        boolean resultado = Boolean.logicalOr(valor1, valor2);
        if(resultado == true){
            System.out.println("Resultado..."+resultado+" Pois apenas um valor é true");
        }else{
            System.out.println("Resultado..."+resultado+"Pois os dois valores são false");
        }
    }
}
