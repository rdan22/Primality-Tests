public class LucasLehmer {
    public  boolean isPrime(long n) {
		long s=4;
		long M = ((long) Math.pow(2,n))-1;
	  for (int i=3; i<=(n+1); i++) {	
		  /**Determines Mersenne primes**/
		  s = (((long)Math.pow(s, 2)) - 2) % M;
		}
		if (s == 0)
			return true;
		return false;		
	}
    public static void main(String[] args) {
		long[] primes= {8863,10799,19183,37619,74887,88819,102761,329297,611953,1252343};
		LucasLehmer ll = new LucasLehmer();
		 /**check if prime**/
	     for (int trial = 0; trial < 10; trial++) {
	      	for (int i=0; i< primes.length; i++ ) {
	      		/**Gets the start time**/
	    		long startTime = Timer.getCurrentTime();
	      	    ll.isPrime(primes[i]);
	    		long endTime = Timer.getCurrentTime();
	    		System.out.println(primes[i] + "," + (endTime - startTime) );
	        }
	     }
	  }
   }
