public class Fibonacci extends FibonacciBase {

    private static final long serialVersionUID = 1L;

    public Fibonacci(int x) 
    {
        fibs = new int[x][2];
    }

    @Override
    public int fibI(int N) throws IllegalArgumentException {
        
        N = N - 1;
        double phi = ((1 + Math.sqrt(5)) / 2);
        double finalNum = (((Math.pow(phi, N)) - (Math.pow(-1, N) / Math.pow(phi, N))) / Math.sqrt(5));
        
        if (N == 0) { finalNum = 0; }
        else if (N == 1) { finalNum = 1; }
        
        return (int) finalNum;
    }

    /*
    Recurssive fibonacci sequence. 
    n is # we want to get to. i-1 in [i][1]
    for loop to take [i-2][1] + [i-1][1] = [i][1]
    */
    @Override
    public int fibR(int N) throws IllegalArgumentException {

        // going to statically add 0 to [0][1] and 1 to [1][1] because those never change anyway
        int x = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) 
            { x = 0; }
            else if (i == 1) 
            { x = 1; }
            else 
            { x = fibs[i-2][1] + fibs[i-1][1]; }
        }
        
        return x;
    }
    
}
