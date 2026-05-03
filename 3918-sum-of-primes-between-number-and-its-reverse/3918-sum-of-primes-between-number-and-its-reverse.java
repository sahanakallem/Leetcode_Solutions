class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0, temp =n;
        while(temp!=0){
            rev = (rev*10)+(temp%10);
            temp = temp/10;
        }
        int min = Math.min(rev, n);
        int max = Math.max(rev, n);
        for(int i=min; i<=max; i++){
            if(isPrime(i)) temp+=i;
        }
        return temp;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}