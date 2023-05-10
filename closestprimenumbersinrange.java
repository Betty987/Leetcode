class Solution {
    public int[] closestPrimes(int left, int right) {
  
        List<Integer> primes = getPrimes(left,right);

        int[] ans = new int[]{0,Integer.MAX_VALUE}; 
        
        int m_d = ans[1]-ans[0];
       
        for( int i =0;i< primes.size()-1;i++){  
                int c_d = primes.get(i+1)-primes.get(i);
                if(c_d < m_d){
                    ans[0] = primes.get(i);
                    ans[1] = primes.get(i+1);
                    m_d = ans[1]-ans[0];
                }
        }
        
        if(m_d == Integer.MAX_VALUE) return new int[]{-1,-1};
        return ans;
    }
   
    public List<Integer> getPrimes(int left,int right ){
        List<Integer> primes = new ArrayList<>();
        int[] sieve = new int[1_000_001];
        Arrays.fill(sieve,1);
        for(int i = 2;i<=right;i++){
            if(sieve[i] == 1){
                if(i>=left) primes.add(i);
                for(int j=2*i ; j<=right;j+=i){
                    sieve[j]=0;
                }
            }
        }
        return primes;
    }
}
