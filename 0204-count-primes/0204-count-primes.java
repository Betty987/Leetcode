class Solution {
    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
        Arrays.fill(isprime,true);//we set everything to true
        int primecount=0;
        for(int i=2;i<isprime.length;i++){
            if(isprime[i]){//if it is prime we count it
                primecount++;
                for(int j=i+i;j<isprime.length;j+=i){//we set the multiples to false
                        isprime[j]=false;
                }
            }
        }
        return primecount;
    }
}
