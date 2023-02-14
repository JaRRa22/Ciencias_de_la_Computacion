package recursividad;

public class Fibonacci {
    public static int fibonacci(int nPosicion){
        if(nPosicion <= 2)
            return 1;
        return fibonacci(nPosicion - 1 ) + fibonacci(nPosicion - 2);
    }
}
