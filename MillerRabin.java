import java.math.BigInteger;
public class MillerRabin {
	public boolean isPrime(long n) {
		if (n == 0 || n  == 1)
	        return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
            return true;
	    long s = n - 1;
		while (s % 2 == 0)
			s /= 2;
		long temp = s;
		long mod = modPow(2, temp, n);
        while (temp != n - 1 && mod != 1 && mod != n - 1) {
        	mod = mulMod(mod, mod, n);
        	temp *= 2;
        }
        if (mod != n - 1 && temp % 2 == 0)
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
	/**Function to calculate (a * b) % c**/
	public long mulMod(long a, long b, long mod) {
		return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }
public static void main(String[] args) {
	long[] primes= {8863,10799,19183,37619,74887,88819,102761,329297,611953,1252343};
     /** Make an object of MillerRabin class **/
      MillerRabin mr = new MillerRabin();
	 /** check if prime **/
     for (int trial = 0; trial < 10; trial++) {
      	for (int i=0; i< primes.length; i++ ) {
      		/**Gets the start time**/
    		long startTime = Timer.getCurrentTime();
      	    mr.isPrime(primes[i]);
    		long endTime = Timer.getCurrentTime();
    		System.out.println(primes[i] + "," + (endTime - startTime) );
         }
      }
   }
}
