import java.util.Scanner;

public class TesteWrappers {

    static TestInt tstint = new TestInt();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Integer");
        System.out.println("2) Boolean");
        System.out.println("3) Character");
        System.out.println("4) Double");
        System.out.println("5) Byte");
        System.out.println("6) Short");
        System.out.println("7) Float");
        System.out.println("8) Long");
        System.out.println("0) Sair");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Passe dois numeros para comparar:");
                int valor1 = sc.nextInt();
                int valor2 = sc.nextInt();
                tstint.comparaInteiros(valor1, valor2);
                System.out.println("Passe um valor para ser convertido em int");
                int valor = sc.nextInt();
                tstint.converteInt_String(valor);

                break;
            case 2:

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
                System.exit(0);
                break;
            default:
                System.out.println("Digite um numero correspondente a tabela!");

        }



    }
}
