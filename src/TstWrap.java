// Ricardo Mercante

import java.util.Scanner;

public class TstWrap {

    static TstInt tstInt = new TstInt();
    static TstBool tstBool = new TstBool();

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
                    int valor1 = sc.nextInt();
                    System.out.println("Valor Dois: ");
                    int valor2 = sc.nextInt();
                    tstInt.comparaInteiros(valor1, valor2);

                    System.out.println("Passe um valor para ser convertido em String:");
                    int valor = sc.nextInt();
                    tstInt.converteInt_String(valor);

                    break;
                case 2:
                    System.out.println("Passe dois valores Booleans para comparar");
                    Boolean bool1 = sc.nextBoolean();
                    System.out.println("Valor Dois:");
                    Boolean bool2 = sc.nextBoolean();
                    tstBool.comparaBooleanos(bool1, bool2);

                    System.out.println("Passe dois valores Booleans para ultilizar a LogicaOr");
                    Boolean value1 = sc.nextBoolean();
                    System.out.println("Valor Dois:");
                    Boolean value2 = sc.nextBoolean();
                    tstBool.logicaOr(value1, value2);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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