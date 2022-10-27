class Solution {
    public int countPrimes(int n) {
        
        //space 
        int count=0;
        //sieve of eratosthenes
       boolean primes[] = new boolean[n+1];//n+1 to include 0
       for(int i=0;i<primes.length;i++){
           primes[i]=true;      //we set everything to true
       }
        
      for(int i=2;i*i<=n;i++){
          if(primes[i]){
              for(int j=i*i;j<=n;j+=i){
                  primes[j]=false;
              }
          }
      }
      for(int i=2;i<n;i++){
          if(primes[i]) count++;
      }
        return count;
    }
  
}