package exemplo6.suite;

public final class Vetores {

    //verifica se 2 vetores são iguais
    public static boolean vetoresIguais(int[] a, int[] b) {
        if ((a == null) || (b == null))
            throw new IllegalArgumentException("argumento nulo");
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    //produto interno de 2 vetores
    public static int produtoInternoVetorial(int[] a, int[] b) {
        if ((a == null) || (b == null))
            throw new IllegalArgumentException("argumento nulo");
        if (a.length != b.length)
            throw new IllegalArgumentException(
                    "vetores de tamanhos diferentes ("
                    + a.length + ", " + b.length + ')');
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }
}
