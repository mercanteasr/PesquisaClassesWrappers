//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

public class TstWrap {
    public static void main(String[] args) {

        // objetos
        Leitura lt = new Leitura();
        TstInt tstInt = new TstInt();
        TstBool tstBool = new TstBool();
        TstChar tstChar = new TstChar();
        TstDoub tstDoub = new TstDoub();
        TstByte tstByte = new TstByte();
        TstShort tstShort = new TstShort();
        TstFloat tstFloat = new TstFloat();
        TstLong tstLong = new TstLong();

        boolean rodando = true;

        // menu
        while (rodando) {
            System.out.println("\nUSO DE CLASSES WRAPPERS");
            System.out.println("1) INTEGER");
            System.out.println("2) BOOLEAN");
            System.out.println("3) CHARACTER");
            System.out.println("4) DOUBLE");
            System.out.println("5) BYTE");
            System.out.println("6) SHORT");
            System.out.println("7) FLOAT");
            System.out.println("8) LONG");
            System.out.println("0) SAIR");

            // se digitar letra onde era numero, cai no catch e volta pro menu
            try {
                int opcao = Integer.parseInt(lt.entDados("ESCOLHA UMA OPCAO:"));

                switch (opcao) {
                    case 1:
                        int inteiro1 = Integer.parseInt(lt.entDados("Passe dois numeros inteiros para comparar\nValor um:"));
                        int inteiro2 = Integer.parseInt(lt.entDados("Valor dois:"));
                        System.out.println("\n | COMPARA INTEIROS |");
                        tstInt.comparaInteiros(inteiro1, inteiro2);

                        int valorInt = Integer.parseInt(lt.entDados("\nPasse um valor int para ser convertido em binario:"));
                        System.out.println("\n | TO BINARY STRING |");
                        tstInt.converteInt_Binario(valorInt);
                        break;

                    case 2:
                        Boolean bool1 = Boolean.parseBoolean(lt.entDados("Passe dois valores booleanos (true ou false)\nValor um:"));
                        Boolean bool2 = Boolean.parseBoolean(lt.entDados("Valor dois:"));
                        System.out.println("\n | COMPARA BOOLEANOS |");
                        tstBool.comparaBooleanos(bool1, bool2);
                        System.out.println("\n | LOGICA OR |");
                        tstBool.logicaOr(bool1, bool2);
                        break;

                    case 3:
                        String caracter = lt.entDados("Passe um caracter (letra ou numero):");
                        System.out.println("\n | TO UPPER CASE |");
                        System.out.println("Caracter: " + caracter.charAt(0) + " Ficou...");
                        tstChar.transformaMaiusculo(caracter.charAt(0));
                        System.out.println("\n | IS DIGIT |");
                        tstChar.verificaDigito(caracter.charAt(0));
                        break;

                    case 4:
                        Double doub1 = Double.parseDouble(lt.entDados("Passe dois valores double (0 e 0 para ver NaN)\nValor um:"));
                        Double doub2 = Double.parseDouble(lt.entDados("Valor dois:"));
                        System.out.println("\n | MAIOR VALOR |");
                        tstDoub.maiorValor(doub1, doub2);
                        System.out.println("\n | VERIFICA SE E NaN |");
                        tstDoub.verificaNaN(doub1, doub2);
                        break;

                    case 5:
                        byte valorByte = Byte.parseByte(lt.entDados("Passe um valor byte (-128 a 127):"));
                        System.out.println("\n | CONVERTE BYTE PARA DOUBLE |");
                        tstByte.converteByte_Double(valorByte);
                        System.out.println("\n | CONVERTE SEM SINAL |");
                        tstByte.converteSemSinal(valorByte);
                        break;

                    case 6:
                        short valorShort = Short.parseShort(lt.entDados("Passe um valor short (-32768 a 32767):"));
                        System.out.println("\n | TO STRING |");
                        tstShort.converteShort_String(valorShort);
                        System.out.println("\n | REVERSE BYTES |");
                        tstShort.reverseBytes(valorShort);
                        break;

                    case 7:
                        String valorString = lt.entDados("Passe um valor decimal em String (ex: 3.14):");
                        System.out.println("\n | CONVERTE FLOAT |");
                        tstFloat.converteString_Float(valorString);

                        float valorF1 = Float.parseFloat(lt.entDados("\nPasse dois valores float para somar\nValor um:"));
                        float valorF2 = Float.parseFloat(lt.entDados("Valor dois:"));
                        System.out.println("\n | SOMA FLOAT |");
                        tstFloat.somaFloat(valorF1, valorF2);
                        break;

                    case 8:
                        long valorLong = Long.parseLong(lt.entDados("Passe um valor long:"));
                        System.out.println("\n | VERIFICA SINAL |");
                        tstLong.verificaSinal(valorLong);
                        System.out.println("\n | MAIOR POTENCIA DE 2 |");
                        tstLong.maiorPotencia2(valorLong);
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        rodando = false;
                        break;

                    default:
                        System.out.println("Digite um numero correspondente a tabela!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas numeros!");
            }
        }
    }
}