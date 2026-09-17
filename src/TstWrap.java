// Ricardo Mercante

import java.util.Scanner;

public class TstWrap {

    static TstInt tstInt = new TstInt();
    static TstBool tstBool = new TstBool();
    static TstChar tstchar = new TstChar();
    static TstDoub tstdoub = new TstDoub();
    static TstByte tstbyte = new TstByte();



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

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
            System.out.print("ESCOLHA UMA OPCAO: \n");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Passe dois numeros para comparar:");
                    int inteiro1 = sc.nextInt();
                    System.out.println("Valor Dois: ");
                    int inteiro2 = sc.nextInt();
                    System.out.println("\n | COMPARA INTEIROS |");
                    tstInt.comparaInteiros(inteiro1, inteiro2);
                    System.out.println("\n | TO STRING |");
                    System.out.println("Passe um valor int para ser convertido em String:");
                    int valorint = sc.nextInt();
                    tstInt.converteInt_String(valorint);

                    break;
                case 2:
                    System.out.println("Passe dois valores Booleans");
                    Boolean bool1 = sc.nextBoolean();
                    System.out.println("Valor Dois:");
                    Boolean bool2 = sc.nextBoolean();
                    System.out.println("\n | COMPARA BOOLEANOS |");
                    tstBool.comparaBooleanos(bool1, bool2);
                    System.out.println("\n | LOGICA OR | ");
                    tstBool.logicaOr(bool1, bool2);

                    break;
                case 3:
                    System.out.println("Passe um caracter para a trasformação: ");
                    String caracter = sc.next();
                    System.out.println("\n | TO UPPER CASE |");
                    System.out.println("Caracter: "+caracter+" Ficou...");
                    tstchar.transformaMaiusculo(caracter.charAt(0));
                    System.out.println("\n | TO LOWER CASE |");
                    System.out.println("Caracter: "+caracter+" Ficou...");
                    tstchar.transformaMinusculo(caracter.charAt(0));

                    break;
                case 4:
                    System.out.println("Passe dois valores Double");
                    Double doub1 = sc.nextDouble();
                    System.out.println("Valor Dois: ");
                    Double doub2 = sc.nextDouble();
                    System.out.println("\n | MENOR VALOR |");
                    tstdoub.menorValor(doub1,doub2);
                    System.out.println("\n | MAIOR VALOR |");
                    tstdoub.maiorValor(doub1,doub2);

                    break;
                case 5:
                    System.out.println("Passe um valor byte");
                    byte bt = sc.nextByte();
                    System.out.println("\n | OBTEM VALOR BYTE |");
                    tstbyte.obtemValorByte(bt);
                    System.out.println("\n | HASH CODE |");
                    tstbyte.calculaHash(bt);

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Digite um numero correspondente a tabela!");
            }
        }

        sc.close();
    }
}