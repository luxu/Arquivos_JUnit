package exemplo6.suite;

import java.math.BigInteger;

public class Utils {

    public static String concatenaPalavras(String... palavras) {
        StringBuilder buf = new StringBuilder();
        for (String palavra : palavras)
            buf.append(palavra);
        return buf.toString();
    }

    public static String calculaFatorial(int numero) throws IllegalArgumentException {
        if (numero < 1) 
            throw new IllegalArgumentException("parâmetro zero or negativo (" + numero + ')');
        BigInteger fatorial = new BigInteger("1");
        for (int i = 2; i <= numero; i++)
            fatorial = fatorial.multiply(new BigInteger(String.valueOf(i)));
        return fatorial.toString();
    }
}
