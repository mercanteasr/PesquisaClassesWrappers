// Ricardo Mercante

import java.util.Scanner;
import java.lang.NumberFormatException;


public class TstWrap {
    public static void main(String[] args) {

        float valorF1;
        float valorF2;
        String valorString1;
        String valorString2;
        short valorShort1;
        short valorShort2;
        byte valorByte1;
        byte valorByte2;


         TstInt tstInt = new TstInt();
         TstBool tstbool = new TstBool();
         TstChar tstchar = new TstChar();
         TstDoub tstdoub = new TstDoub();
         TstByte tstbyte = new TstByte();
         TstShort tstshort = new TstShort();
         TstFloat tstfloat = new TstFloat();



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
                    tstInt.converteInt_Binario(valorint);

                    break;
                case 2:
                    System.out.println("Passe dois valores Booleans");
                    Boolean bool1 = sc.nextBoolean();
                    System.out.println("Valor Dois:");
                    Boolean bool2 = sc.nextBoolean();
                    System.out.println("\n | COMPARA BOOLEANOS |");
                    tstbool.comparaBooleanos(bool1, bool2);
                    System.out.println("\n | LOGICA OR | ");
                    tstbool.logicaOr(bool1, bool2);

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
                    valorByte1 = sc.nextByte();
                    System.out.println("\n | OBTEM VALOR BYTE |");
                    tstbyte.obtemValorByte(valorByte1);
                    System.out.println("\n | CONVERTE SEM SINAL |");
                    tstbyte.converteSemSinal(valorByte1);

                    break;
                case 6:
                    System.out.println("Passe um valor Short");
                    valorShort1 = sc.nextShort();
                    sc.nextLine(); // consome o \n que sobrou do nextShort()
                    System.out.println("\n | REVERSE BYTES |");
                    tstshort.reverseBytes(valorShort1);
                    System.out.println("Passe o primeiro valor short");
                    valorShort1 = sc.nextShort();
                    System.out.println("Passe o segundo valor short");
                    valorShort2 = sc.nextShort();
                    System.out.println("\n | COMPARA SHORT |");
                    tstshort.comparaShort(valorShort1, valorShort2);

                    break;
                case 7:
                    System.out.println("Passe um valor em String");
                    valorString1= sc.next();
                    System.out.println("\n| CONVERTE FLOAT |");
                    tstfloat.converteString_Float(valorString1);
                    System.out.println("Passe o primeiro valor float");
                    valorF1 = sc.nextFloat();
                    System.out.println("Passe o segundo valor float");
                    valorF2 = sc.nextFloat();
                    System.out.println("\n| SOMA FLOAT |");
                    tstfloat.somaFloat(valorF1, valorF2);

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