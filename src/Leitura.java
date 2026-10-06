//Nome: Ricardo Augusto Scalada Mercante - RA: a2865483

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    /**
     * Mostra o rotulo na tela e le o que o usuario digitar no teclado,
     * retornando sempre como String.
     */
    public String entDados(String rotulo) {
        System.out.println(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String ret = "";
        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("\nERRO de sistema: SAI DO PROGRAMA");
        }
        return ret;
    }
}