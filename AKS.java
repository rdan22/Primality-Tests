public class AKS {
	/**Range of numbers**/
	static Long[] c = new Long[2000000];
	public static void main(String[] args) {
		/**List of primes**/
		int[] primes= {8863,10799,19183,37619,74887,88819,102761,329297,611953,1252343};
		   /** Make an object of AKS class **/
		        AKS aks = new AKS();
		       /**Trials for each prime**/
		        for (int trial = 0; trial < 10; trial++) {
		        	/**Gets the time for each prime in the list**/
		        	for (int idx = 0; idx < primes.length; idx++ ) {
		        		/**Gets the start time**/
		        		long startTime = Timer.getCurrentTime();
		        		aks.isPrime(primes[idx]);
		        		long endTime = Timer.getCurrentTime();
		        		System.out.println(primes[idx] + "," + (endTime - startTime) );
		        	}        
		        }
	}
	void coef(int n) {
		int i, j;
        for (c[i=0] = 1l; i < n; c[0] = -c[0], i++)
			for (c[1 + (j=i)] = 1l; j > 0; j--)
				c[j] = c[j-1] - c[j];
	}
    
	boolean isPrime(int n) {
		int i;
        coef(n);
		c[0] += 1;
		c[i=n] -= 1;
        while (i-- != 0 && (c[i] % n) == 0);
            return i < 0;
	}
    /**For the integer n, as it decrements by 1 it doesn't equal 0**/
	static void show(int n) {
		do {
			
     } while (n-- != 0);
	}
  }
	