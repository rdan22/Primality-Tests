public class Fermat {
    public boolean isPrime(long n) {  
    /**Base case**/
        if (n == 0 || n == 1)
            return false;
    /**Base case - 2 is prime**/
        if (n == 2)
            return true;
    /**An even number other than 2**/
        if (n % 2 == 0)
            return false;    
        if (modPow(2, n-1, n) != 1)
        	return false;
        return true;        
    }
    /**Function to calculate (a ^ b) % c**/
    public long modPow(long a, long b, long c) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= c; 
        }
        return res % c;
    }
   /**Main function**/
    public static void main (String[] args) {
    	long[] primes= {8863,10799,19183,37619,74887,88819,102761,329297,611953,1252343};
   /**Make an object of FermatPrimality class**/
        Fermat fp = new Fermat();
       for (int trial=0; trial < 10; trial++) {
        	for (int i=0; i< primes.length; i++ ) {
        		/**Gets the start time**/
        		long startTime = Timer.getCurrentTime();
        		fp.isPrime(primes[i]);
        		long endTime = Timer.getCurrentTime();
        		System.out.println(primes[i] + "," + (endTime - startTime) );
        	}        
        }
    }
}
  












