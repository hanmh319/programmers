class Solution {
    public long solution(long n) {
        long answer = 0;
        long i =1;
        while(true){
            if(i*i==n){
                return (i+1)*(i+1);
            }
            i++;
            if(i==n)
                break;
        }
        return -1;
    }
}