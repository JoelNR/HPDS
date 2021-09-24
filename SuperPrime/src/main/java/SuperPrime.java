public class SuperPrime {
    public int[] analizeSuperPrime(int lowerBound, int upperBound){
        int[] result = {0,0};
        int primoInvertido;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (esPrimo(i)){
                primoInvertido = invierteNumero(i);
                if (esPrimo(primoInvertido)){
                    if (primoInvertido != i) {
                        result[0]++;
                        result[1] += i;
                    }
                }
            }
        }

        return result;
    }

    public boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;

        while (primo && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }

        return primo;
    }

    public int invierteNumero(int numero){
        int invertido = 0,resto;

        while(numero > 0){
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /=10;

        }

        return invertido;
    }
}
