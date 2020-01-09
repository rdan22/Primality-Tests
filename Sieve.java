public class Sieve {
    public void isPrime(int n) {
       boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
     }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
         }
     }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.println(i);
           }
       }
   }
	public static void main(String[] args) {
		int[] primes= {8863,10799,19183,37619,74887,88819,102761,329297,611953,1252343};
		   /**Make an object of Sieve of Eratosthenes class**/
		        Sieve sieve = new Sieve();
		       for (int trial=0; trial < 10; trial++) {
		        	for (int i=0; i< primes.length; i++ ) {
		        		/**Gets the start time**/
		        		long startTime = Timer.getCurrentTime();
		        		sieve.isPrime(primes[i]);
		        		long endTime = Timer.getCurrentTime();
		        		System.out.println(primes[i] + "," + (endTime - startTime) );
		        	}        
		        }
	        }
        }
	
	
	

